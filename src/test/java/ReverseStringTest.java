import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringTest {

    @Test

    public  void positive(){

        String result = ReverseString.reverse("Welcome");
        Assert.assertEquals(result,"emoclew");
    }
    @Test

    public void number(){

        String result = ReverseString.reverse("2day");
        Assert.assertEquals(result,"yad2");
    }
    @Test

    public void upper(){

        String result = ReverseString.reverse("GOOD MORNING");
        Assert.assertEquals(result,"gninrom doog");
    }
}
