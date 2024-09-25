package four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo
{
    WebDriver driver;
    @BeforeClass
    void open()
    {
       driver = new ChromeDriver();
    }
    @Test(dataProvider = "dt")
    void log_in(String user, String pass) throws InterruptedException {
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(user);
       driver.findElement((By.xpath("//input[@placeholder='Password']"))).sendKeys(pass);
       driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
       Thread.sleep(4000);
       Boolean check = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
       if(check==true)
       {
           driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
           driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
           Assert.assertTrue(true);
       }
       else
       {
           Assert.assertTrue(false);
       }

    }
    @AfterClass
    void close()
    {
       driver.close();
    }
    @DataProvider(name = "dt")
    Object[][] data()
    {
       Object[][] obj= {
               {"aasa","121212"},
               {"sasas","@122"},
               {"Admin","admin123"}
       };
       return obj;
    }
}
