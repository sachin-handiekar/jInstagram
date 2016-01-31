package org.jinstagram.http;

import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;

import org.junit.Test;

/**
 * The class <code>StreamUtilsTest</code> contains tests for the class
 * <code>{@link StreamUtils}</code>.
 *
 */
public class StreamUtilsTest {
	/**
	 * Run the String getStreamContents(InputStream) method test.
	 *
	 * @throws Exception if any error occurs
	 */
	@Test
	public void testGetStreamContents() throws Exception {
		ByteArrayInputStream is = new ByteArrayInputStream("Mock Content".getBytes());

		String result = StreamUtils.getStreamContents(is);

		assertNotNull(result);
	}

	/**
	 * Run the String getStreamContents(InputStream) method test.
	 *
	 * @throws Exception if any error occurs
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetStreamContentsWithIllegalStateException() throws Exception {
		InputStream is = new PipedInputStream();
		String result = StreamUtils.getStreamContents(is);
		assertNotNull(result);
	}
 

}