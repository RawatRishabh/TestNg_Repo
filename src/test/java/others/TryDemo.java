package others;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class TryDemo
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriver driver1;
        driver1 = driver;
        driver1.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Rishabh");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(" Rawat");

    }
}
