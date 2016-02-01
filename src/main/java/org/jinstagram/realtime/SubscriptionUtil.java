package org.jinstagram.realtime;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.google.gson.Gson;

import org.apache.commons.codec.binary.Hex;
import org.jinstagram.exceptions.InstagramException;

@Deprecated
public class SubscriptionUtil {

	private static final String HMAC_SHA1 = "HmacSHA1";

	public static SubscriptionResponseObject[] getSubscriptionResponseData(String jsonBody) throws InstagramException {
		Gson gson = new Gson();
		SubscriptionResponseObject[] responseData;

		try {
			responseData = gson.fromJson(jsonBody, SubscriptionResponseObject[].class);
		} catch (Exception e) {
			throw new InstagramException("Error parsing json to object type ");
		}

		return responseData;
	}

	/**
	 * 
	 * Method to verify Instagram's POST request for a specific subscription.
	 * This method follow the algorithm in <a href="https://github.com/Instagram/python-instagram/blob/master/instagram/subscriptions.py">python-instagram</a> implementation.
	 *
	 * @param clientSecret clientSecret Client secret of our Instagram application
	 * @param rawJsonData Raw JSON data from the POST request
	 * @param xHubSignature The signature given by the HTTP header of the POST request
	 * @return VerificationResult a class that represent result of the signature verification
	 * @throws InstagramException
	 */
	public static VerificationResult verifySubscriptionPostRequestSignature(String clientSecret, byte[] rawJsonData,
			String xHubSignature) throws InstagramException {
		SecretKeySpec keySpec;
		keySpec = new SecretKeySpec(clientSecret.getBytes(Charset.forName("UTF-8")), HMAC_SHA1);
		Mac mac;

		try {
			mac = Mac.getInstance(HMAC_SHA1);
			mac.init(keySpec);
			byte[] result = mac.doFinal(rawJsonData);
			String encodedResult = Hex.encodeHexString(result);

			return new VerificationResult(encodedResult.equals(xHubSignature), encodedResult);
		} catch (NoSuchAlgorithmException e) {
			throw new InstagramException("Invalid algorithm name!", e);
		} catch (InvalidKeyException e) {
			throw new InstagramException("Invalid key: " + clientSecret, e);
		}
	}

	public static class VerificationResult {

		private final boolean success;
		private final String resultingSignature;

		public VerificationResult(boolean success, String resultingSignature) {
			this.success = success;
			this.resultingSignature = resultingSignature;
		}

		public boolean isSuccess() {
			return success;
		}

		public String getCalculatedSignature() {
			return resultingSignature;
		}

	}
}
