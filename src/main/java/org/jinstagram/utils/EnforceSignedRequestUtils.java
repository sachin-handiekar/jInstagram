package org.jinstagram.utils;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringUtils;
import org.jinstagram.exceptions.InstagramException;

public class EnforceSignedRequestUtils {

    private static final String HMAC_SHA256 = "HmacSHA256";

    private static final Charset UTF_8 = Charset.forName("UTF-8");

    /**
     * signature returns the HmacSHA256 encoded signature used for signed Instagram requests
     * @param endpoint The endpoint
     * @param params   The query parameters
     * @param clientSecret The client application secret
     * @return encoded signature String
     * @throws InstagramException
     */
    public static String signature(String endpoint, Map<String, String> params, String clientSecret) throws InstagramException {
        SecretKeySpec keySpec = new SecretKeySpec(clientSecret.getBytes(UTF_8), HMAC_SHA256);

        // ensure we iterate through the keys in sorted order
        List<String> values = new ArrayList<String>(params.size());
        for (String key : MapUtils.getSortedKeys(params)) {
            values.add(String.format("%s=%s", key, params.get(key)));
        }

        // the sig string to sign in the form "endpoint|key1=value1|key2=value2|...."
        String sig = String.format("%s|%s", endpoint, StringUtils.join(values, '|'));

        try {
            Mac mac = Mac.getInstance(HMAC_SHA256);
            mac.init(keySpec);
            byte[] result = mac.doFinal(sig.getBytes(UTF_8));
            return Hex.encodeHexString(result);
        } catch (NoSuchAlgorithmException e) {
            throw new InstagramException("Invalid algorithm name!", e);
        } catch (InvalidKeyException e) {
            throw new InstagramException("Invalid key: " + clientSecret, e);
        }
    }

}
