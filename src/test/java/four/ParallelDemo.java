package four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

public class ParallelDemo
{
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void open(String browser, String url) throws InterruptedException {
        switch (browser.toLowerCase())
        {
            case "chrome" : driver = new ChromeDriver(); break;
            case "edge"   : driver = new EdgeDriver(); break;
            default : System.out.println("Browser not found"); return;
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get(url);
        Thread.sleep(3000);
    }
    @Test
    void logo()
    {
        Assert.assertEquals(driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed(),true);
    }
    @Test
    void url()
    {
       Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test
    void title()
    {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @AfterClass
    void close()
    {
        driver.quit();
    }
}
