package org.jinstagram.realtime;


import org.jinstagram.exceptions.InstagramException;
import org.jinstagram.realtime.SubscriptionUtil.VerificationResult;
import org.junit.Assert;
import org.junit.Test;

public class SubscriptionUtilTest {
	
	@Test
	public void shouldReturnSameResultWithPhytonImplementation() throws InstagramException{
		String clientSecret = "5f395ee5acae448bbbcf01a251c480f6";
		String rawJsonResponse = "[{\"subscription_id\":\"1\",\"object\":\"user\",\"object_id\":\"1234\",\"changed_aspect\":\"media\",\"time\":1297286541},{\"subscription_id\":\"2\",\"object\":\"tag\",\"object_id\":\"nofilter\",\"changed_aspect\":\"media\",\"time\":1297286541}]";
		String xHubSignature = "53a41d80a55a9265fc72633d432e22e6dc05fd64";
		
		VerificationResult result = SubscriptionUtil.verifySubscriptionPostSignature(clientSecret, rawJsonResponse, xHubSignature);
		Assert.assertTrue(result.isSuccess());
	}
}
