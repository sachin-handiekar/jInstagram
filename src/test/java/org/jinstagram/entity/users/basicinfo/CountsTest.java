package org.jinstagram.entity.users.basicinfo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>CountsTest</code> contains tests for the class
 * <code>{@link Counts}</code>.
 */
public class CountsTest {
	/**
	 * Run the int getFollowedBy() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetFollowedBy_1() throws Exception {
		Counts fixture = new Counts();
		fixture.setFollows(1);
		fixture.setMedia(1);
		fixture.setFollowedBy(1);

		int result = fixture.getFollowedBy();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getFollows() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetFollows_1() throws Exception {
		Counts fixture = new Counts();
		fixture.setFollows(1);
		fixture.setMedia(1);
		fixture.setFollowedBy(1);

		int result = fixture.getFollows();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getMedia() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetMedia_1() throws Exception {
		Counts fixture = new Counts();
		fixture.setFollows(1);
		fixture.setMedia(1);
		fixture.setFollowedBy(1);

		int result = fixture.getMedia();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setFollowedBy(int) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetFollowedBy_1() throws Exception {
		Counts fixture = new Counts();
		fixture.setFollows(1);
		fixture.setMedia(1);
		fixture.setFollowedBy(1);
		int follwedBy = 1;

		fixture.setFollowedBy(follwedBy);

		// add additional test code here
	}

	/**
	 * Run the void setFollows(int) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetFollows_1() throws Exception {
		Counts fixture = new Counts();
		fixture.setFollows(1);
		fixture.setMedia(1);
		fixture.setFollowedBy(1);
		int follows = 1;

		fixture.setFollows(follows);

		// add additional test code here
	}

	/**
	 * Run the void setMedia(int) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetMedia_1() throws Exception {
		Counts fixture = new Counts();
		fixture.setFollows(1);
		fixture.setMedia(1);
		fixture.setFollowedBy(1);
		int media = 1;

		fixture.setMedia(media);

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
		Counts fixture = new Counts();
		fixture.setFollows(1);
		fixture.setMedia(1);
		fixture.setFollowedBy(1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Counts [follows=1, followed_by=1, media=1]", result);
	}

 
}