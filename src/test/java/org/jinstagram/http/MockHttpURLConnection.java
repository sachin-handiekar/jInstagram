package org.jinstagram.http;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.annotation.Resources;

public class MockHttpURLConnection extends HttpURLConnection {

	protected MockHttpURLConnection(URL url) {
		super(url);
	}

	// *** HttpURLConnection

	@Override
	public InputStream getInputStream() throws IOException {
		return new ByteArrayInputStream("Mock Input Stream".getBytes());
	}

	@Override
	public void connect() throws IOException {
	}

	@Override
	public void disconnect() {
	}

	@Override
	public boolean usingProxy() {
		return false;
	}

}
