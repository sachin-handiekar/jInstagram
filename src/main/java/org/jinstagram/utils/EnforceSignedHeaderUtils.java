package org.jinstagram.utils;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.jinstagram.exceptions.InstagramException;

@Deprecated
public class EnforceSignedHeaderUtils {

    public static final String ENFORCE_SIGNED_HEADER = "X-Insta-Forwarded-For";
    
    private static final String HMAC_SHA256 = "HmacSHA256";

    @Deprecated
    public static String signature(String clientSecret, String message) throws InstagramException {
        SecretKeySpec keySpec = new SecretKeySpec(clientSecret.getBytes(Charset.forName("UTF-8")), HMAC_SHA256);

        try {
            Mac mac = Mac.getInstance(HMAC_SHA256);
            mac.init(keySpec);
            byte[] result = mac.doFinal(message.getBytes(Charset.forName("UTF-8")));
            return Hex.encodeHexString(result);
        } catch (NoSuchAlgorithmException e) {
            throw new InstagramException("Invalid algorithm name!", e);
        } catch (InvalidKeyException e) {
            throw new InstagramException("Invalid key: " + clientSecret, e);
        }
    }

}
