import org.testng.Assert;
import org.testng.annotations.Test;

public class BuzzTest {

    @Test

    public void buzzTest() {
        int result =Buzz.fizzbuzz(25);
        Assert.assertEquals(result,25,"Buzz");
    }
    @Test

    public void fizzTest() {
        int result = Buzz.fizzbuzz(21);
        Assert.assertEquals(result,21,"Fizz");
    }
    @Test

    public void fizzBuzzTest() {
        int result = Buzz.fizzbuzz(30);
        Assert.assertEquals(result,30,"FizzBuzz");
    }
    @Test

    public void numTest() {
        int result = Buzz.fizzbuzz(23);
        Assert.assertEquals(result,23);
    }

}
