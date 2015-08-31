package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UsersInPhotoTest</code> contains tests for the class <code>{@link UsersInPhoto}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:40
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class UsersInPhotoTest {
	/**
	 * Run the GridPosition getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetPosition_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetUser_1()
		throws Exception {
		UsersInPhoto fixture = new UsersInPhoto();
		fixture.setPosition(new GridPosition());
		fixture.setUser(new User());

		User result = fixture.getUser();

		// add additional test code here
		assertNotNull(result);
		assertEquals("User [bio=null, fullName=null, id=null, profilePictureUrl=null, userName=null, websiteUrl=null]", result.toString());
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetPosition_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetUser_1()
		throws Exception {
		UsersInPhoto fixture = new UsersInPhoto();
		fixture.setPosition(new GridPosition());
		fixture.setUser(new User());
		User user = new User();

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UsersInPhotoTest.class);
	}
}