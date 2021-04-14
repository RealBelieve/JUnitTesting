package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunction junit = new JUnitFunction();
		int solution = junit.addNumbers(200, 300);
		assertEquals (500,solution);
	}

}
