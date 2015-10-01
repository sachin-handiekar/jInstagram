package org.jinstagram.utils;

import org.jinstagram.exceptions.InstagramException;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EnforceSignedRequestUtilsTest {

    // Using the examples from Instagram's website to ensure functionality.
    // https://instagram.com/developer/secure-api-requests/#examples

    @Test
    public void testSignatureSingleParam() throws InstagramException {
        String endpoint = "/users/self";
        Map<String, String> query = new HashMap<String, String>() {{
            put("access_token", "fb2e77d.47a0479900504cb3ab4a1f626d174d2d");
        }};
        String clientSecret = "6dc1787668c64c939929c17683d7cb74";
        String expectedSignature = "cbf5a1f41db44412506cb6563a3218b50f45a710c7a8a65a3e9b18315bb338bf";

        String signature = EnforceSignedRequestUtils.signature(endpoint, query, clientSecret);
        Assert.assertEquals(expectedSignature, signature);
    }

    @Test
    public void testSignatureMultipleParams() throws InstagramException {
        String endpoint = "/media/657988443280050001_25025320";
        Map<String, String> query = new HashMap<String, String>() {{
            put("access_token", "fb2e77d.47a0479900504cb3ab4a1f626d174d2d");
            put("count", "10");
        }};
        String clientSecret = "6dc1787668c64c939929c17683d7cb74";
        String expectedSignature = "260634b241a6cfef5e4644c205fb30246ff637591142781b86e2075faf1b163a";

        String signature = EnforceSignedRequestUtils.signature(endpoint, query, clientSecret);
        Assert.assertEquals(expectedSignature, signature);
    }
}
