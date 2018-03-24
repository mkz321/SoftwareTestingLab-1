package lab01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Triangle_test {
	private Triangle tri;
	
	@Before
	public void setUp() throws  Exception {
		tri = new Triangle(5,5,5);
	}

	@Test
	public void testIsEquilatera(){
		assertTrue(tri.isEquilatera());
	}
	
	@Test
	public void testIsIsosceles(){
		assertTrue(tri.isIsosceles());
	}
	
	@Test
	public void testIsScalene(){
		assertFalse(tri.isScalene());
	}
}
