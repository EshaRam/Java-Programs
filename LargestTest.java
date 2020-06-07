import org.testng.Assert;
import org.testng.annotations.Test;

public class LargestTest {

    @Test

    public void largestNumberTest(){

       int result = Largest.largestNumber();
       Assert.assertEquals(result,84);

    }
}
