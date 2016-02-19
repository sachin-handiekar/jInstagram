package org.jinstagram.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * The class <code>ResponseTest</code> contains tests for the class
 * <code>{@link Response}</code>.
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class ResponseTest {

	@Mock
	private HttpURLConnection mockHttpConnection;

	@Mock
	private OutputStream mockOutStream;

	@Mock
	private InputStream mockInputStream;

	@Mock
	private InputStream mockErrStream;

	//
	@Before
	public void init() {

		try {
			when(mockHttpConnection.getOutputStream()).thenReturn(mockOutStream);

			when(mockHttpConnection.getInputStream()).thenReturn(mockInputStream);

			when(mockHttpConnection.getErrorStream()).thenReturn(mockErrStream);

			URL url = new URL("http://mock.url/to/test");
			when(mockHttpConnection.getURL()).thenReturn(url);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Run the Response(HttpURLConnection) constructor test.
	 *
	 * @throws Exception
	 *             if any error occurs
	 */
	@Test
	public void testResponse() throws Exception {
		Response result = new Response(mockHttpConnection);
		assertNotNull(result);
	}

	/**
	 * Run the String getBody() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test(expected = IllegalStateException.class)
	public void testGetBody() throws Exception {
		Response fixture = new Response(mockHttpConnection);

		String result = fixture.getBody();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at org.jinstagram.http.Response.<init>(Response.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetCode() throws Exception {
		Response fixture = new Response(mockHttpConnection);

		int result = fixture.getCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at org.jinstagram.http.Response.<init>(Response.java:30)
		assertEquals(0, result);
	}

	/**
	 * Run the String getHeader(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetHeader() throws Exception {
		Response fixture = new Response(mockHttpConnection);
		String headerName = "header";

		String value = fixture.getHeader(headerName);
		System.out.println(value);
	}

	/**
	 * Run the Map<String, String> getHeaders() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetHeaders() throws Exception {
		Response fixture = new Response(mockHttpConnection);

		Map<String, String> result = fixture.getHeaders();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at org.jinstagram.http.Response.<init>(Response.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream getStream() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetStream() throws Exception {
		Response fixture = new Response(mockHttpConnection);

		InputStream result = fixture.getStream();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at org.jinstagram.http.Response.<init>(Response.java:30)
		assertNotNull(result);
	}

	/**
	 * Run the String getURL() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetURL() throws Exception {
		Response fixture = new Response(mockHttpConnection);

		String result = fixture.getURL();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at org.jinstagram.http.Response.<init>(Response.java:30)
		assertNotNull(result);
	}

}