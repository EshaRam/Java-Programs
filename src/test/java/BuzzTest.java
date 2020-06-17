import org.testng.Assert;
import org.testng.annotations.Test;

public class BuzzTest {

    @Test

    public void buzzTest() {
        String result =Buzz.fizzbuzz(25);
        Assert.assertEquals(result,"Buzz");
    }
    @Test

    public void fizzTest() {
        String result = Buzz.fizzbuzz(21);
        Assert.assertEquals(result,"Fizz");
    }
    @Test

    public void fizzBuzzTest() {
        String result = Buzz.fizzbuzz(30);
        Assert.assertEquals(result,"FizzBuzz");
    }
    @Test

    public void numTest() {
        String result = Buzz.fizzbuzz(23);
        Assert.assertEquals(result,result);
    }
    @Test
    public void zeroTest() {
        String result = Buzz.fizzbuzz(0);
        Assert.assertEquals(result,"FizzBuzz");
    }

}
