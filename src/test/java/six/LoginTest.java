package six;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest
{
    WebDriver driver;
    @BeforeClass
    void setup() {
         driver = new EdgeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @Test
    void login_test() {
        LoginPageFactory data = new LoginPageFactory(driver);
        data.username("Admin");
        data.password("admin123");
        data.login_btn();
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @AfterClass
    void tear_down()
    {
        driver.quit();
    }
}
