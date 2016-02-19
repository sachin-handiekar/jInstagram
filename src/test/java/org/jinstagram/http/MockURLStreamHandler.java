package org.jinstagram.http;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

public class MockURLStreamHandler extends URLStreamHandler implements URLStreamHandlerFactory {
	private MockHttpURLConnection mConnection;

	public MockHttpURLConnection getConnection() {
		return mConnection;
	}

	// *** URLStreamHandler

	@Override
	protected URLConnection openConnection(URL u) throws IOException {
		mConnection = new MockHttpURLConnection(u);
		return mConnection;
	}

	// *** URLStreamHandlerFactory

	@Override
	public URLStreamHandler createURLStreamHandler(String protocol) {
		return this;
	}

}
