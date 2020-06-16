import org.testng.Assert;
import org.testng.annotations.Test;

public class SwapTest {

    @Test
    public void swapNumberTest() {

        int result = Swap.swapNumber(4,8);
        Assert.assertEquals(result,8,4);
    }
    @Test
    public void swap2Test() {

        int result = Swap.swap2(5,10);
        Assert.assertEquals(result,10,5);
    }

}
