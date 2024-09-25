package second;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo
{
    @Test
    void testTitle()
    {
        String expected = "Shop";
        String actual = "Shop";

       // Assert.assertEquals(actual,expected);
        if(expected.equals(actual))
        {
            System.out.println("Test Case Pass");
            Assert.assertEquals(actual,expected);
        }
        else
        {
            System.out.println("Test Case Fail");
            Assert.assertEquals(actual,expected);
        }
    }
}
