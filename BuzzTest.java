import org.testng.Assert;
import org.testng.annotations.Test;

public class BuzzTest {

    @Test
    public void fizzbuzzTest() {

        int result = Buzz.fizzbuzz(21);
        Assert.assertEquals(result, "Fizz");
    }

    @Test

    public void buzzTest() {
        int result =Buzz.fizzbuzz(25);
        Assert.assertEquals(result, "Buzz");
    }
    @Test

    public void fizzBuzzTest() {
        int result = Buzz.fizzbuzz(30);
        Assert.assertEquals(result, "FizzBuzz");
    }
}
