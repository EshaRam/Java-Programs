import org.testng.Assert;
import org.testng.annotations.Test;

public class LargestTest {

    @Test

    public void largestNumberTest(){
        int array[]= {12, 84, 28, 38, 14};
       int result = Largest.largestNumber(array);
       Assert.assertEquals(result,84);

    }
}
