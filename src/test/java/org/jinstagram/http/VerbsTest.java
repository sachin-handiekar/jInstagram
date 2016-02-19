package org.jinstagram.http;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The class <code>VerbsTest</code> contains tests for the class
 * <code>{@link Verbs}</code>.
 */
public class VerbsTest {

	@Test
	public void testVerbs() {

		String value = Verbs.POST.toString();
		assertNotNull(value);

		value = Verbs.GET.toString();
		assertNotNull(value);

		value = Verbs.PUT.toString();
		assertNotNull(value);

		value = Verbs.DELETE.toString();
		assertNotNull(value);
	}

}