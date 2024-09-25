package six;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    // Constructor
    // Page Object Class (Login)
    WebDriver driver;

    LoginPage(WebDriver driver)
    {
       this.driver = driver;
    }

    // Locator
    By user =  By.xpath("//input[@placeholder='Username']");
    By pass =  By.xpath("//input[@placeholder='Password']");
    By login = By.xpath("//button[normalize-space()='Login']");

    // Action Methods
    public void username(String us) {

        driver.findElement(user).sendKeys(us);
    }
    public void password(String pas)
    {
        driver.findElement(pass).sendKeys(pas);
    }
    public void login_btn()
    {
        driver.findElement(login).click();
    }

}
