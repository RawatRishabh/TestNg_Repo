package others;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogicDemo2
{
    @Test
    void check1()
    {
        Assert.assertTrue(false);
    }
    @Test
    void check2()
    {
        Assert.assertTrue(true);
    }
    @Test
    void check3()
    {
        Assert.assertTrue(false);
    }
}
