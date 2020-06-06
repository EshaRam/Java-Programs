import org.testng.annotations.Test;
import org.testng.Assert;

public class FactorialTest {
    @Test
    public void positiveNonrecursiveTest() {

        int result = Factorial.nonrecursive(6);
        Assert.assertEquals(result,720);
    }

    @Test
    public void recursiveTest() {
        int result = Factorial.recursive(6);
        Assert.assertEquals(result,720);
    }
    @Test
    public void NegativeTest() {
        int result = Factorial.recursive(-6);
        Assert.assertEquals(result,0);
    }
}
