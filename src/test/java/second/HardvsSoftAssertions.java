package second;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions
{

    @Test
    void check1()
    {
        System.out.println("I am before!");
        Assert.assertTrue(true);
        System.out.println("I am After!");
    }
    @Test
    void check2()
    {
        System.out.println("I am Before!");
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(true);
        System.out.println("I am After!");
        sa.assertAll();
    }
}
