package org.jinstagram.entity.tags;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.junit.Test;

/**
 * The class <code>TagMediaFeedTest</code> contains tests for the class
 * <code>{@link TagMediaFeed}</code>.
 */
public class TagMediaFeedTest {
	/**
	 * Run the List<MediaFeedData> getData() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetData_1() throws Exception {
		TagMediaFeed fixture = new TagMediaFeed();
		fixture.setData(new ArrayList<MediaFeedData>());
		fixture.setMeta(new Meta());
		fixture.setPagination(new Pagination());

		List<MediaFeedData> result = fixture.getData();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Meta getMeta() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetMeta_1() throws Exception {
		TagMediaFeed fixture = new TagMediaFeed();
		fixture.setData(new ArrayList<MediaFeedData>());
		fixture.setMeta(new Meta());
		fixture.setPagination(new Pagination());

		Meta result = fixture.getMeta();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Meta [code=0, errorMessage=null, errorType=null]", result.toString());
		assertEquals(0, result.getCode());
		assertEquals(null, result.getErrorMessage());
		assertEquals(null, result.getErrorType());
	}

	/**
	 * Run the Pagination getPagination() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetPagination_1() throws Exception {
		TagMediaFeed fixture = new TagMediaFeed();
		fixture.setData(new ArrayList<MediaFeedData>());
		fixture.setMeta(new Meta());
		fixture.setPagination(new Pagination());

		Pagination result = fixture.getPagination();

		// add additional test code here
		assertNotNull(result);
		assertEquals(
				"Pagination [depreciationWarning=null, minTagId=null, nextMaxId=null, nextMaxTagId=null, nextMinId=null, nextUrl=null]",
				result.toString());
		assertEquals(null, result.getDepreciationWarning());
		assertEquals(null, result.getMinTagId());
		assertEquals(null, result.getNextMaxId());
		assertEquals(null, result.getNextCursor());
		assertEquals(null, result.getNextMinId());
		assertEquals(null, result.getNextMaxTagId());
		assertEquals(null, result.getNextUrl());
		assertEquals(false, result.hasNextPage());
	}

	/**
	 * Run the void setData(List<MediaFeedData>) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetData_1() throws Exception {
		TagMediaFeed fixture = new TagMediaFeed();
		fixture.setData(new ArrayList<MediaFeedData>());
		fixture.setMeta(new Meta());
		fixture.setPagination(new Pagination());
		List<MediaFeedData> data = new ArrayList<MediaFeedData>();

		fixture.setData(data);

		// add additional test code here
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
		TagMediaFeed fixture = new TagMediaFeed();
		fixture.setData(new ArrayList<MediaFeedData>());
		fixture.setMeta(new Meta());
		fixture.setPagination(new Pagination());
		Meta meta = new Meta();

		fixture.setMeta(meta);

		// add additional test code here
	}

	/**
	 * Run the void setPagination(Pagination) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetPagination_1() throws Exception {
		TagMediaFeed fixture = new TagMediaFeed();
		fixture.setData(new ArrayList<MediaFeedData>());
		fixture.setMeta(new Meta());
		fixture.setPagination(new Pagination());
		Pagination pagination = new Pagination();

		fixture.setPagination(pagination);

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
		TagMediaFeed fixture = new TagMediaFeed();
		fixture.setData(new ArrayList<MediaFeedData>());
		fixture.setMeta(new Meta());
		fixture.setPagination(new Pagination());

		String result = fixture.toString();

		// add additional test code here
		assertEquals(
				"TagMediaFeed [data=[], meta=Meta [code=0, errorMessage=null, errorType=null], pagination=Pagination [depreciationWarning=null, minTagId=null, nextMaxId=null, nextMaxTagId=null, nextMinId=null, nextUrl=null]]",
				result);
	}

}