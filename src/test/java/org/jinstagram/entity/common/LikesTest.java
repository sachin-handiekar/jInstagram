package org.jinstagram.entity.common;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LikesTest</code> contains tests for the class <code>{@link Likes}</code>.
 *
 * @generatedBy CodePro at 31/08/15 16:40
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
public class LikesTest {
	/**
	 * Run the int getCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetCount_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testGetLikesUserList_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetCount_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testSetLikesUserList_1()
		throws Exception {
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
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Likes fixture = new Likes();
		fixture.setCount(1);
		fixture.setLikesUserList(new ArrayList<User>());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Likes [count=1, likesUserList=[]]", result);
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
		new org.junit.runner.JUnitCore().run(LikesTest.class);
	}
}