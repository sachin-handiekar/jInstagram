package org.jinstagram.entity.common;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 31/08/15 16:40
 * @author sachin.handiekar
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	ImagesTest.class,
	VideosTest.class,
	ImageDataTest.class,
	InstagramErrorResponseTest.class,
	GridPositionTest.class,
	PaginationTest.class,
	MetaTest.class,
	FromTagDataTest.class,
	VideoDataTest.class,
	LocationTest.class,
	UserTest.class,
	UsersInPhotoTest.class,
	CaptionTest.class,
	CommentsTest.class,
	LikesTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 31/08/15 16:40
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
