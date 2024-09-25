package five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners(five.MyListener.class) // directly integrate the listener class

public class Orange
{
    WebDriver driver;

    @BeforeClass
    void open() throws InterruptedException {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);
    }
    @Test(priority = 1)
    void logo()
    {
        boolean check = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(check,true);
    }
    @Test(priority = 2)
    void url()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/");
    }
    @Test(priority = 3, dependsOnMethods = {"url"})
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
