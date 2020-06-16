import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTest {

    @Test
    public void positivefibonacciTest() {

        int[] result = Fibonacci.fibonacci(10);
       int[] expectedArray = {0,0,1,2,3,5,8,13,21,34};
       Assert.assertEquals(result,expectedArray);

    }
}
