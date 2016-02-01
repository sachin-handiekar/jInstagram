package org.jinstagram.entity.likes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;
import java.util.List;

import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.User;
import org.junit.Test;

/**
 * The class <code>LikesFeedTest</code> contains tests for the class
 * <code>{@link LikesFeed}</code>.
 */
public class LikesFeedTest {
	/**
	 * Run the Meta getMeta() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetMeta_1() throws Exception {
		LikesFeed fixture = new LikesFeed();
		fixture.setUserList(new LinkedList());
		fixture.setMeta(new Meta());

		Meta result = fixture.getMeta();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getErrorMessage());
		assertEquals(0, result.getCode());
		assertEquals("Meta [code=0, errorMessage=null, errorType=null]", result.toString());
		assertEquals(null, result.getErrorType());
	}

	/**
	 * Run the List<User> getUserList() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetUserList_1() throws Exception {
		LikesFeed fixture = new LikesFeed();
		fixture.setUserList(new LinkedList());
		fixture.setMeta(new Meta());

		List<User> result = fixture.getUserList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setMeta(Meta) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetMeta_1() throws Exception {
		LikesFeed fixture = new LikesFeed();
		fixture.setUserList(new LinkedList());
		fixture.setMeta(new Meta());
		Meta meta = new Meta();

		fixture.setMeta(meta);

		// add additional test code here
	}

	/**
	 * Run the void setUserList(List<User>) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetUserList_1() throws Exception {
		LikesFeed fixture = new LikesFeed();
		fixture.setUserList(new LinkedList());
		fixture.setMeta(new Meta());
		List<User> userList = new LinkedList();

		fixture.setUserList(userList);

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
		LikesFeed fixture = new LikesFeed();
		fixture.setUserList(new LinkedList());
		fixture.setMeta(new Meta());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("LikesFeed [meta=Meta [code=0, errorMessage=null, errorType=null], userList=[]]", result);
	}

}