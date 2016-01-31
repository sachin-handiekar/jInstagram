package org.jinstagram.entity.common;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The class <code>PaginationTest</code> contains tests for the class
 * <code>{@link Pagination}</code>.
 */
public class PaginationTest {
	/**
	 * Run the String getDepreciationWarning() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetDepreciationWarning_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");

		String result = fixture.getDepreciationWarning();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getMinTagId() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetMinTagId_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");

		String result = fixture.getMinTagId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNextCursor() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetNextCursor_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");

		String result = fixture.getNextCursor();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNextMaxId() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetNextMaxId_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");

		String result = fixture.getNextMaxId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNextMaxTagId() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetNextMaxTagId_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");

		String result = fixture.getNextMaxTagId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNextMinId() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetNextMinId_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");

		String result = fixture.getNextMinId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getNextUrl() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetNextUrl_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");

		String result = fixture.getNextUrl();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean hasNextPage() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testHasNextPage_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");

		boolean result = fixture.hasNextPage();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean hasNextPage() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testHasNextPage_2() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");

		boolean result = fixture.hasNextPage();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setDepreciationWarning(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetDepreciationWarning_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");
		String depreciationWarning = "";

		fixture.setDepreciationWarning(depreciationWarning);

		// add additional test code here
	}

	/**
	 * Run the void setMinTagId(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetMinTagId_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");
		String minTagId = "";

		fixture.setMinTagId(minTagId);

		// add additional test code here
	}

	/**
	 * Run the void setNextCursor(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetNextCursor_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");
		String nextCursor = "";

		fixture.setNextCursor(nextCursor);

		// add additional test code here
	}

	/**
	 * Run the void setNextMaxId(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetNextMaxId_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");
		String nextMaxId = "";

		fixture.setNextMaxId(nextMaxId);

		// add additional test code here
	}

	/**
	 * Run the void setNextMaxTagId(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetNextMaxTagId_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");
		String nextMaxTagId = "";

		fixture.setNextMaxTagId(nextMaxTagId);

		// add additional test code here
	}

	/**
	 * Run the void setNextMinId(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetNextMinId_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");
		String nextMinId = "";

		fixture.setNextMinId(nextMinId);

		// add additional test code here
	}

	/**
	 * Run the void setNextUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetNextUrl_1() throws Exception {
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");
		String nextUrl = "";

		fixture.setNextUrl(nextUrl);

		// add additional test code here
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
		Pagination fixture = new Pagination();
		fixture.setNextMaxId("");
		fixture.setNextMaxTagId("");
		fixture.setNextMinId("");
		fixture.setNextUrl("");
		fixture.setMinTagId("");
		fixture.setDepreciationWarning("");
		fixture.setNextCursor("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Pagination [depreciationWarning=, minTagId=, nextMaxId=, nextMaxTagId=, nextMinId=, nextUrl=]",
				result);
	}

}