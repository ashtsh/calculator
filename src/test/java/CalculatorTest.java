import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class CalculatorTest {
	   
	    @Test
	    public void testAdd() {
	        int a = 15;
	        int b = 20;
	        int expectedResult = 35;
	        int result = Calculator.add(a, b);
	        Assert.assertEquals(expectedResult, result);;
	    }
	    
	    @Test
	    public void testSubtract() {
	        int a = 25;
	        int b = 20;
	        int expectedResult = 5;
	        int result = Calculator.sub(a, b);
	        Assert.assertEquals(expectedResult, result);;
	    }
	    
	    @Test
	    public void testMultiply() {
	    	int a = 10;
	    	int b = 25;
	    	int expectedResult = 250;
	    	int result = Calculator.mul(a, b);
	        Assert.assertEquals(expectedResult, result);;
	    }
	    
	    @Test
	    public void testDivide() {
	        int a = 56;
	        int b = 10;
	        int expectedResult = 5;
	        int result = Calculator.div(a, b);
	        Assert.assertEquals(expectedResult, result);
	    }
	    @Test(expected = ArithmeticException.class)
	    public void testDivideByZero() {
	        int a = 15;
	        int b = 0;
	        Calculator.div(a, b);
	    }

}

