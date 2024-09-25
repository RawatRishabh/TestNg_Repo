package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

/*
 1) Open application
 2) Test logo presence
 3) Login
 4) Close application
 */
public class OrangeHRMTest
{
    WebDriver driver; // Globally define
    @Test(priority = 1)
    void open_app()
    {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(priority = 2)
    void test_logo() throws InterruptedException {
        Thread.sleep(4000);
        boolean check = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("Logo : "+check);
    }
    @Test(priority = 3)
    void login()
    {
       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test(priority = 4)
    void close_app()
    {
        driver.quit();
    }
}
