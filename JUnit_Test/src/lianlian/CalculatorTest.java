package lianlian;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator Calculator = new Calculator();
	@Before
	public void setUp() throws Exception {
		Calculator.clear();
	}

	@Test
	public void testAdd() {
		Calculator.add(2);
		Calculator.add(3);
		assertEquals(5, Calculator.getResult());
	}

	@Test
	public void testSubstract() {
		Calculator.add(10);
		Calculator.substract(2);
		assertEquals(8, Calculator.getResult());
	}

	@Ignore
	public void testMultiply() {
		
		
	}

	@Test
	public void testDivide() {
		Calculator.add(8);
		Calculator.divide(2);
		assertEquals(4, Calculator.getResult());
	}

}
