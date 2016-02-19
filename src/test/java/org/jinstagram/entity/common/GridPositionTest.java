package org.jinstagram.entity.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GridPositionTest</code> contains tests for the class
 * <code>{@link GridPosition}</code>.
 *
 * 
 * @author Sachin Handiekar
 */
public class GridPositionTest {
	/**
	 * Run the double getX() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetX() throws Exception {
		GridPosition fixture = new GridPosition();
		fixture.setX(1.0);
		fixture.setY(1.0);

		double result = fixture.getX();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getY() method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testGetY() throws Exception {
		GridPosition fixture = new GridPosition();
		fixture.setX(1.0);
		fixture.setY(1.0);

		double result = fixture.getY();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the void setX(double) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetX() throws Exception {
		GridPosition fixture = new GridPosition();
		fixture.setX(1.0);
		fixture.setY(1.0);
		double x = 1.0;

		fixture.setX(x);

		// add additional test code here
	}

	/**
	 * Run the void setY(double) method test.
	 *
	 * @throws Exception
	 *
	 * 
	 */
	@Test
	public void testSetY() throws Exception {
		GridPosition fixture = new GridPosition();
		fixture.setX(1.0);
		fixture.setY(1.0);
		double y = 1.0;

		fixture.setY(y);

		// add additional test code here
	}
}