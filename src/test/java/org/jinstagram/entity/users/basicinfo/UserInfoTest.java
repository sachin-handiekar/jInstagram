package org.jinstagram.entity.users.basicinfo;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UserInfoTest</code> contains tests for the class <code>{@link UserInfo}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:47
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class UserInfoTest {
	/**
	 * Run the UserInfoData getData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testGetData_1()
		throws Exception {
		UserInfo fixture = new UserInfo();
		fixture.setData(new UserInfoData());

		UserInfoData result = fixture.getData();

		// add additional test code here
		assertNotNull(result);
		assertEquals("UserInfoData [bio=null, counts=null, first_name=null, id=null, last_name=null, profile_picture=null, username=null, fullName=null, website=null]", result.toString());
		assertEquals(null, result.getId());
		assertEquals(null, result.getFullName());
		assertEquals(null, result.getProfilePicture());
		assertEquals(null, result.getUsername());
		assertEquals(null, result.getWebsite());
		assertEquals(null, result.getCounts());
		assertEquals(null, result.getFirstName());
		assertEquals(null, result.getLastName());
		assertEquals(null, result.getBio());
	}

	/**
	 * Run the void setData(UserInfoData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testSetData_1()
		throws Exception {
		UserInfo fixture = new UserInfo();
		fixture.setData(new UserInfoData());
		UserInfoData data = new UserInfoData();

		fixture.setData(data);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	@Test
	public void testToString_1()
		throws Exception {
		UserInfo fixture = new UserInfo();
		fixture.setData(new UserInfoData());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("UserInfo [data=UserInfoData [bio=null, counts=null, first_name=null, id=null, last_name=null, profile_picture=null, username=null, fullName=null, website=null]]", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/08/15 16:47
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
	 * @generatedBy CodePro at 31/08/15 16:47
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
	 * @generatedBy CodePro at 31/08/15 16:47
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UserInfoTest.class);
	}
}