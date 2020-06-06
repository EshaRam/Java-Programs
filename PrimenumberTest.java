import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimenumberTest {
    @Test
    public void PositiveprimeNumberTest() {


        boolean result = PrimeNumber.primeNumber(5);
        Assert.assertEquals(result, true);

    }
    @Test
    public void NegativeprimeNumberTest() {


        boolean result = PrimeNumber.primeNumber(-21);
        Assert.assertEquals(result, false);

    }
    @Test

    public void NotPrimeNumberTest() {


        boolean result = PrimeNumber.primeNumber(21);
        Assert.assertEquals(result, false);

    }


    }

