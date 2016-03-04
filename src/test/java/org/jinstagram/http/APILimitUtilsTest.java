package org.jinstagram.http;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class APILimitUtilsTest {

    @Test
    public void remainingBetweenMinAndMax() {
        int limitValue = 5000;
        int remainingValue = 3999;
        
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(APILimitUtils.LIMIT_HEADER_KEY, String.valueOf(limitValue));
        headers.put(APILimitUtils.REMAINING_HEADER_KEY, String.valueOf(remainingValue));
       
        assertTrue(limitValue == Integer.valueOf(APILimitUtils.getAPILimitStatus(headers)));
        assertTrue(remainingValue == Integer.valueOf(APILimitUtils.getRemainingLimitStatus(headers)));
    }

    @Test
    public void remainingBetweenMax() {
        int limitValue = 5000;
        int remainingValue = limitValue;
        
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(APILimitUtils.LIMIT_HEADER_KEY, String.valueOf(limitValue));
        headers.put(APILimitUtils.REMAINING_HEADER_KEY, String.valueOf(remainingValue));
       
        assertTrue(limitValue == APILimitUtils.getAPILimitStatus(headers));
        assertTrue(remainingValue == APILimitUtils.getRemainingLimitStatus(headers)); 
    }

    @Test
    public void remainingZero() {
        int limitValue = 5000;
        int remainingValue = 0;
        
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(APILimitUtils.LIMIT_HEADER_KEY, String.valueOf(limitValue));
        headers.put(APILimitUtils.REMAINING_HEADER_KEY, String.valueOf(remainingValue));
       
        assertTrue(limitValue == APILimitUtils.getAPILimitStatus(headers));
        assertTrue(remainingValue == APILimitUtils.getRemainingLimitStatus(headers)); 
    }

    @Test
    public void emptyHeader() {
        int defaultErrorValue = -1;
        Map<String, String> headers = new HashMap<String, String>();
       
        assertTrue(defaultErrorValue == APILimitUtils.getAPILimitStatus(headers));
        assertTrue(defaultErrorValue == APILimitUtils.getRemainingLimitStatus(headers)); 
    }

    @Test
    public void lowerCase() {
        int limitValue = 5000;
        int remainingValue = 3999;

        Map<String, String> headers = new HashMap<String, String>();
        headers.put(APILimitUtils.LIMIT_HEADER_KEY.toLowerCase(), String.valueOf(limitValue));
        headers.put(APILimitUtils.REMAINING_HEADER_KEY.toLowerCase(), String.valueOf(remainingValue));

        assertTrue(limitValue == APILimitUtils.getAPILimitStatus(headers));
        assertTrue(remainingValue == APILimitUtils.getRemainingLimitStatus(headers));
    }
}
