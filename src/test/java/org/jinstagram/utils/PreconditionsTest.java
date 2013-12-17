package org.jinstagram.utils;

import org.junit.Test;

public class PreconditionsTest {

    private static final String ERROR_MSG = "";

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNullObjects() {
        Preconditions.checkNotNull(null, ERROR_MSG);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNullStrings() {
        Preconditions.checkEmptyString(null, ERROR_MSG);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForEmptyStrings() {
        Preconditions.checkEmptyString("", ERROR_MSG);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForSpacesOnlyStrings() {
        Preconditions.checkEmptyString("               ", ERROR_MSG);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForInvalidUrls() {
        Preconditions.checkValidUrl("this/is/not/a/valid/url", ERROR_MSG);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNullUrls() {
        Preconditions.checkValidUrl(null, ERROR_MSG);
    }

    @Test
    public void shouldAllowValidUrls() {
        Preconditions.checkValidUrl("http://www.example.com", ERROR_MSG);
    }

    @Test
    public void shouldAllowSSLUrls() {
        Preconditions.checkValidUrl("https://www.example.com", ERROR_MSG);
    }

    @Test
    public void shouldAllowSpecialCharsInScheme() {
        Preconditions.checkValidUrl("custom+9.3-1://www.example.com", ERROR_MSG);
    }

    @Test
    public void shouldAllowNonStandarProtocolsForAndroid() {
        Preconditions.checkValidUrl("x-url-custom://www.example.com", ERROR_MSG);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowStrangeProtocolNames() {
        Preconditions.checkValidUrl("$weird*://www.example.com", ERROR_MSG);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowUnderscoreInScheme() {
        Preconditions.checkValidUrl("http_custom://www.example.com", ERROR_MSG);
    }

    @Test
    public void shouldAllowOutOfBandAsValidCallbackValue() {
        Preconditions.checkValidOAuthCallback("oob", ERROR_MSG);
    }
    
    @Test
    public void shouldAllowValidLatLong(){
    	Preconditions.checkValidLatLong("35.89421911", ERROR_MSG);
    }
    
    @Test
    public void shouldAllowValidLatLongThreeDigits(){
    	Preconditions.checkValidLatLong("139.94637467", ERROR_MSG);
    }
    
    @Test
    public void shouldAllowValidLatLongWithoutDecimal(){
    	Preconditions.checkValidLatLong("139", ERROR_MSG);
    }
    
    @Test
    public void shouldAllowValidNegativeLatLong(){
    	Preconditions.checkValidLatLong("-35.89421911", ERROR_MSG);
    }
    
    @Test
    public void shouldAllowValidNegativeLatLongThreeDigits(){
    	Preconditions.checkValidLatLong("-139.94637467", ERROR_MSG);
    }
    
    @Test
    public void shouldAllowValidNegativeLatLongWithoutDecimal(){
    	Preconditions.checkValidLatLong("-139", ERROR_MSG);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowEmptyString(){
    	Preconditions.checkValidLatLong("    ", ERROR_MSG);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowLatLongWithCharAtTheFirstPart(){
    	Preconditions.checkValidLatLong("1f3.894121", ERROR_MSG);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowLatLongWithCharAtTheSecondPart(){
    	Preconditions.checkValidLatLong("123.89f121", ERROR_MSG);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowLatLongWithStrangeCharactersFirstPart(){
    	Preconditions.checkValidLatLong("1!@#%3.83121", ERROR_MSG);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowLatLongWithStrangeCharactersSecondPart(){
    	Preconditions.checkValidLatLong("123.89@#$#$121", ERROR_MSG);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowLatLongWithWhiteSpaceAtBeginning(){
    	Preconditions.checkValidLatLong("  123.45678", ERROR_MSG);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowLatLongWithWhiteSpaceAtTheEnd(){
    	Preconditions.checkValidLatLong("123.45678  ", ERROR_MSG);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowLatLongWithWhiteSpaceAtTheMiddle(){
    	Preconditions.checkValidLatLong("123.  45678", ERROR_MSG);
    }
    
    @Test
    public void shouldAllowValidRadiusValue(){
    	Preconditions.checkValidRadius("12345", ERROR_MSG);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowRadiusWithAlphabet(){
    	Preconditions.checkValidRadius("12e345", ERROR_MSG);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowRadiusWithStrangeCharacter(){
    	Preconditions.checkValidRadius("12#@$%@#%345", ERROR_MSG);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowRadiusWithWhiteSpaceAtBeginning(){
    	Preconditions.checkValidRadius("  12345", ERROR_MSG);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowRadiusWithWhiteSpaceAtTheEnd(){
    	Preconditions.checkValidRadius("12378  ", ERROR_MSG);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowRadiusWithWhiteSpaceAtTheMiddle(){
    	Preconditions.checkValidRadius("123  4567", ERROR_MSG);
    }
}