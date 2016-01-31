package org.jinstagram.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * The class <code>URLUtilsTest</code> contains tests for the class
 * <code>{@link URLUtils}</code>.
 *
 */
public class URLUtilsTest {
	/**
	 * Run the URLUtils() constructor test.
	 *
	 * 
	 */
	@Test
	public void testURLUtils_1() throws Exception {
		URLUtils result = new URLUtils();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String appendParametersToQueryString(String,Map<String,String>)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testAppendParametersToQueryString_1() throws Exception {
		String url = "";
		Map<String, String> params = new HashMap();

		String result = URLUtils.appendParametersToQueryString(url, params);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String appendParametersToQueryString(String,Map<String,String>)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testAppendParametersToQueryString_2() throws Exception {
		String url = "";
		Map<String, String> params = new HashMap();

		String result = URLUtils.appendParametersToQueryString(url, params);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String appendParametersToQueryString(String,Map<String,String>)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testAppendParametersToQueryString_3() throws Exception {
		String url = "";
		Map<String, String> params = new HashMap();

		String result = URLUtils.appendParametersToQueryString(url, params);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String concatSortedPercentEncodedParams(Map<String,String>)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testConcatSortedPercentEncodedParams_1() throws Exception {
		Map<String, String> params = new HashMap<String,String>();

		params.put("key1", "value1");
		params.put("key2", "value2");
		params.put("key3", "value3");
		
		String result = URLUtils.concatSortedPercentEncodedParams(params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.StringIndexOutOfBoundsException: String index out of range:
		// -1
		// at java.lang.String.substring(String.java:1954)
		// at
		// org.jinstagram.http.URLUtils.concatSortedPercentEncodedParams(URLUtils.java:189)
		assertNotNull(result);
	}

	/**
	 * Run the String concatSortedPercentEncodedParams(Map<String,String>)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testConcatSortedPercentEncodedParams_2() throws Exception {
		Map<String, String> params = new HashMap<String,String>();

		params.put("key1", "value1");
		params.put("key2", "value2");
		params.put("key3", "value3");
		
		
		String result = URLUtils.concatSortedPercentEncodedParams(params);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.StringIndexOutOfBoundsException: String index out of range:
		// -1
		// at java.lang.String.substring(String.java:1954)
		// at
		// org.jinstagram.http.URLUtils.concatSortedPercentEncodedParams(URLUtils.java:189)
		assertNotNull(result);
	}

	/**
	 * Run the String encodeURIComponent(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testEncodeURIComponent_1() throws Exception {
		String s = "";

		String result = URLUtils.encodeURIComponent(s);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String formURLDecode(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testFormURLDecode_1() throws Exception {
		String string = "";

		String result = URLUtils.formURLDecode(string);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String formURLDecode(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testFormURLDecode_2() throws Exception {
		String string = "";

		String result = URLUtils.formURLDecode(string);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String formURLEncode(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testFormURLEncode_1() throws Exception {
		String string = "";

		String result = URLUtils.formURLEncode(string);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String formURLEncode(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testFormURLEncode_2() throws Exception {
		String string = "";

		String result = URLUtils.formURLEncode(string);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String formURLEncodeMap(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testFormURLEncodeMap_1() throws Exception {
		Map<String, String> map = new HashMap();

		String result = URLUtils.formURLEncodeMap(map);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String formURLEncodeMap(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testFormURLEncodeMap_2() throws Exception {
		Map<String, String> map = new HashMap();

		String result = URLUtils.formURLEncodeMap(map);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String percentEncode(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testPercentEncode_1() throws Exception {
		String string = "";

		String result = URLUtils.percentEncode(string);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String percentEncode(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testPercentEncode_2() throws Exception {
		String string = "";

		String result = URLUtils.percentEncode(string);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Map<String, String> queryStringToMap(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testQueryStringToMap_1() throws Exception {
		String queryString = "a";

		Map<String, String> result = URLUtils.queryStringToMap(queryString);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("", result.get("a"));
	}

	/**
	 * Run the Map<String, String> queryStringToMap(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testQueryStringToMap_2() throws Exception {
		String queryString = "a";

		Map<String, String> result = URLUtils.queryStringToMap(queryString);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("", result.get("a"));
	}

	/**
	 * Run the Map<String, String> queryStringToMap(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testQueryStringToMap_3() throws Exception {
		String queryString = "a";

		Map<String, String> result = URLUtils.queryStringToMap(queryString);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("", result.get("a"));
	}

	/**
	 * Run the Map<String, String> queryStringToMap(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testQueryStringToMap_4() throws Exception {
		String queryString = null;

		Map<String, String> result = URLUtils.queryStringToMap(queryString);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<String, String> queryStringToMap(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testQueryStringToMap_5() throws Exception {
		String queryString = "";

		Map<String, String> result = URLUtils.queryStringToMap(queryString);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

}