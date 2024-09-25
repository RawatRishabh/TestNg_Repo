package others;
import org.testng.annotations.Test;

public class Enable_DisableDemo
{
    // Make it disable the test method
    @Test(enabled = false)
    void check_url()
    {
        System.out.println("Disable!");
    }
    // By-default every test method is enabled to execute
    @Test
    void check_logo()
    {
        System.out.println("Enable!");
    }

}
