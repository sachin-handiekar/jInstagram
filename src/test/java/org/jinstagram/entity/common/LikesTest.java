package org.jinstagram.entity.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * The class <code>LikesTest</code> contains tests for the class
 * <code>{@link Likes}</code>.
 */
public class LikesTest {
	/**
	 * Run the int getCount() method test.
	 *
	 * @throws Exception
	 * 
	 */
	@Test
	public void testGetCount() throws Exception {
		Likes fixture = new Likes();
		fixture.setCount(1);
		fixture.setLikesUserList(new ArrayList<User>());

		int result = fixture.getCount();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the List<User> getLikesUserList() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetLikesUserList() throws Exception {
		Likes fixture = new Likes();
		fixture.setCount(1);
		fixture.setLikesUserList(new ArrayList<User>());

		List<User> result = fixture.getLikesUserList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setCount(int) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetCount() throws Exception {
		Likes fixture = new Likes();
		fixture.setCount(1);
		fixture.setLikesUserList(new ArrayList<User>());
		int count = 1;

		fixture.setCount(count);

		// add additional test code here
	}

	/**
	 * Run the void setLikesUserList(List<User>) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetLikesUserList() throws Exception {
		Likes fixture = new Likes();
		fixture.setCount(1);
		fixture.setLikesUserList(new ArrayList<User>());
		List<User> likesUserList = new ArrayList<User>();

		fixture.setLikesUserList(likesUserList);

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
	public void testToString() throws Exception {
		Likes fixture = new Likes();
		fixture.setCount(1);
		fixture.setLikesUserList(new ArrayList<User>());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Likes [count=1, likesUserList=[]]", result);
	}

}