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
}

