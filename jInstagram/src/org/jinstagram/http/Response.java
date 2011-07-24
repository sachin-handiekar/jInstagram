package org.jinstagram.http;

import java.io.IOException;
import java.io.InputStream;

import java.net.HttpURLConnection;
import java.net.UnknownHostException;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents an HTTP Response.
 */
public class Response {
	private static final String EMPTY = "";

	private String body;

	private int code;

	private Map<String, String> headers;

	private InputStream stream;

	Response(HttpURLConnection connection) throws IOException {
		try {
			connection.connect();

			code = connection.getResponseCode();
			headers = parseHeaders(connection);
			stream = wasSuccessful() ? connection.getInputStream() : connection
					.getErrorStream();
		}
		catch (UnknownHostException e) {
			code = 404;
			body = EMPTY;
		}
	}

	private String parseBodyContents() {
		body = StreamUtils.getStreamContents(getStream());

		return body;
	}

	private Map<String, String> parseHeaders(HttpURLConnection conn) {
		Map<String, String> headers = new HashMap<String, String>();

		for (String key : conn.getHeaderFields().keySet()) {
			headers.put(key, conn.getHeaderFields().get(key).get(0));
		}

		return headers;
	}

	private boolean wasSuccessful() {
		return (getCode() >= 200) && (getCode() < 400);
	}

	/**
	 * Obtains the HTTP Response body
	 * 
	 * @return response body
	 */
	public String getBody() {
		return (body != null) ? body : parseBodyContents();
	}

	/**
	 * Obtains the meaningful stream of the HttpUrlConnection, either
	 * inputStream or errorInputStream, depending on the status code
	 * 
	 * @return input stream / error stream
	 */
	public InputStream getStream() {
		return stream;
	}

	/**
	 * Obtains the HTTP status code
	 * 
	 * @return the status code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * Obtains a {@link Map} containing the HTTP Response Headers
	 * 
	 * @return headers
	 */
	public Map<String, String> getHeaders() {
		return headers;
	}

	/**
	 * Obtains a single HTTP Header value, or null if undefined
	 * 
	 * @param header name
	 * 
	 * @return header value or null
	 */
	public String getHeader(String name) {
		return headers.get(name);
	}
}
