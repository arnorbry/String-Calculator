package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	@Test
	public void TestEmptyString(){
		assertEquals(0, StringCalculator.add(""));
	}
	@Test
	public void TestOneNumber(){
		assertEquals(1, StringCalculator.add("1"));
	}
	@Test
	public void TestTwoNumbers(){
		assertEquals(3, StringCalculator.add("1,2"));
	}
	@Test
	public void TestThreeNumbers(){
		assertEquals(6, StringCalculator.add("1,2,3"));
	}
	@Test 
	public void TestNewlineSeperator(){
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}
	@Test
	public void TestNegativeNumber(){
		assertEquals(2, StringCalculator.add("2,1005"));
	}
}