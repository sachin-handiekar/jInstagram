package org.jinstagram.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

/**
 * The class <code>RequestTest</code> contains tests for the class
 * <code>{@link Request}</code>.
 */
@RunWith(MockitoJUnitRunner.class)
public class RequestTest {

	private static final Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("0.0.0.0", 8080));

	@Mock
	private HttpURLConnection mockHttpConnection;
	
	@Mock
	private OutputStream mockOut;

	@Mock
	private InputStream mockInput;

	@Mock
	private InputStream mockErrStream;

	@Before
	public void init() {

		try {
			when(mockHttpConnection.getOutputStream()).thenReturn(mockOut);
			when(mockHttpConnection.getInputStream()).thenReturn(mockInput);
			when(mockHttpConnection.getErrorStream()).thenReturn(mockErrStream);

			URL url = new URL("http://mock.url/to/test");
			when(mockHttpConnection.getURL()).thenReturn(url);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Run the Request(Verbs,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testRequest_1() throws Exception {
		Verbs verb = Verbs.DELETE;
		String url = "";

		Request result = new Request(verb, url);

		// add additional test code here
		assertNotNull(result);
		assertEquals("UTF-8", result.getCharset());
		assertEquals("", result.getUrl());
		assertEquals("@Request(DELETE )", result.toString());
		assertEquals("", result.getSanitizedUrl());
		assertEquals("", result.getBodyContents());
	}

	/**
	 * Run the void addBody(HttpURLConnection,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testAddBody_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		byte[] content = "Dummy Payload".getBytes();

		HttpURLConnection mockConn = Mockito.mock(HttpURLConnection.class);

		OutputStream mockOut = Mockito.mock(OutputStream.class);
		Mockito.when(mockConn.getOutputStream()).thenReturn(mockOut);

		System.out.println(mockConn);
		fixture.addBody(mockConn, content);
		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void addBody(HttpURLConnection,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testAddBody_2() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		byte[] content = "Dummy Payload".getBytes();

		fixture.addBody(mockHttpConnection, content);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void addBody(HttpURLConnection,byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testAddBody_3() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);
		byte[] content = "Dummy Payload".getBytes();

		fixture.addBody(mockHttpConnection, content);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void addBodyParameter(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testAddBodyParameter_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);
		String key = "";
		String value = "";

		fixture.addBodyParameter(key, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void addHeader(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testAddHeader_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);
		String key = "";
		String value = "";

		fixture.addHeader(key, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void addHeaders(HttpURLConnection) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testAddHeaders_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		fixture.addHeaders(mockHttpConnection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void addHeaders(HttpURLConnection) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testAddHeaders_2() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		fixture.addHeaders(mockHttpConnection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void addPayload(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testAddPayload_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);
		String payload = "";

		fixture.addPayload(payload);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void addQuerystringParameter(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testAddQuerystringParameter_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);
		String key = "";
		String value = "";

		fixture.addQuerystringParameter(key, value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the Response doSend() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testDoSend_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		Response result = fixture.doSend();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Response doSend() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testDoSend_2() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		Response result = fixture.doSend();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Response doSend() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testDoSend_3() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		Response result = fixture.doSend();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Response doSend() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testDoSend_4() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		Response result = fixture.doSend();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the String getBodyContents() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetBodyContents_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		String result = fixture.getBodyContents();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the String getBodyContents() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetBodyContents_2() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		String result = fixture.getBodyContents();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> getBodyParams() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetBodyParams_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		Map<String, String> result = fixture.getBodyParams();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the byte[] getByteBodyContents() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetByteBodyContents_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		byte[] result = fixture.getByteBodyContents();

		assertNotNull(result);
	}

	/**
	 * Run the byte[] getByteBodyContents() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetByteBodyContents_2() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload((String) null);
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		byte[] result = fixture.getByteBodyContents();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the String getCharset() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetCharset_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		String result = fixture.getCharset();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the String getCharset() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetCharset_2() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset((String) null);
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		String result = fixture.getCharset();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> getHeaders() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetHeaders_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		Map<String, String> result = fixture.getHeaders();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> getQueryStringParams() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetQueryStringParams_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "http://mock.url/?key1=value1&key2=value2");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");

		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		Map<String, String> result = fixture.getQueryStringParams();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> getQueryStringParams() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetQueryStringParams_2() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "http://mock.url/?key1=value1&key2=value2");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		Map<String, String> result = fixture.getQueryStringParams();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the String getSanitizedUrl() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetSanitizedUrl_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		String result = fixture.getSanitizedUrl();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the String getUrl() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetUrl_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");

		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		String result = fixture.getUrl();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Verbs getVerb() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetVerb_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		Verbs result = fixture.getVerb();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Response send() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSend_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		Response result = fixture.send();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Response send() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSend_2() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		Response result = fixture.send();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Response send() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSend_3() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		Response result = fixture.send();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the void setCharset(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetCharset_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);
		String charsetName = "";

		fixture.setCharset(charsetName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void setConnectTimeout(int,TimeUnit) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetConnectTimeout_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);
		int duration = 1;
		TimeUnit unit = TimeUnit.DAYS;

		fixture.setConnectTimeout(duration, unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void setConnection(HttpURLConnection) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetConnection_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);
		HttpURLConnection connection = null;

		fixture.setConnection(connection);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void setConnectionKeepAlive(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetConnectionKeepAlive_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);
		boolean connectionKeepAlive = true;

		fixture.setConnectionKeepAlive(connectionKeepAlive);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void setProxy(Proxy) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetProxy_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);
		// Proxy proxy = proxy;

		fixture.setProxy(proxy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the void setReadTimeout(int,TimeUnit) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetReadTimeout_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);
		int duration = 1;
		TimeUnit unit = TimeUnit.DAYS;

		fixture.setReadTimeout(duration, unit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testToString_1() throws Exception {
		Request fixture = new Request(Verbs.DELETE, "");
		fixture.setConnectionKeepAlive(true);
		fixture.setCharset("UTF-8");
		fixture.addPayload("Dummy payload");
		fixture.setConnection(mockHttpConnection);
		fixture.setProxy(proxy);

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException: type DIRECT is not compatible
		// with address 0.0.0.0/0.0.0.0:1
		// at java.net.Proxy.<init>(Proxy.java:95)
		assertNotNull(result);
	}

}