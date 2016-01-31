package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UsersInPhotoTest</code> contains tests for the class
 * <code>{@link UsersInPhoto}</code>.
 *
 */
public class UsersInPhotoTest {
	/**
	 * Run the GridPosition getPosition() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetPosition_1() throws Exception {
		UsersInPhoto fixture = new UsersInPhoto();
		fixture.setPosition(new GridPosition());
		fixture.setUser(new User());

		GridPosition result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getX(), 1.0);
		assertEquals(0.0, result.getY(), 1.0);
	}

	/**
	 * Run the User getUser() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testGetUser_1() throws Exception {
		UsersInPhoto fixture = new UsersInPhoto();
		fixture.setPosition(new GridPosition());
		fixture.setUser(new User());

		User result = fixture.getUser();

		// add additional test code here
		assertNotNull(result);
		assertEquals("User [bio=null, fullName=null, id=null, profilePictureUrl=null, userName=null, websiteUrl=null]",
				result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getFullName());
		assertEquals(null, result.getProfilePictureUrl());
		assertEquals(null, result.getUserName());
		assertEquals(null, result.getBio());
		assertEquals(null, result.getWebsiteUrl());
	}

	/**
	 * Run the void setPosition(GridPosition) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSetPosition_1() throws Exception {
		UsersInPhoto fixture = new UsersInPhoto();
		fixture.setPosition(new GridPosition());
		fixture.setUser(new User());
		GridPosition position = new GridPosition();

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setUser(User) method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testSetUser_1() throws Exception {
		UsersInPhoto fixture = new UsersInPhoto();
		fixture.setPosition(new GridPosition());
		fixture.setUser(new User());
		User user = new User();

		fixture.setUser(user);

		// add additional test code here
	}

}