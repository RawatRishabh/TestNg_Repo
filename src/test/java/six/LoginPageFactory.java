package six;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory
{
    WebDriver driver;

    LoginPageFactory(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this); // Mandatory
    }

    // Locator
    // @FindBy(How=how.XPATH, using="//input[@placeholder='Username']")
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement user;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement pass;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement login;

    // Action Methods
    public void username(String us)
    {
        user.sendKeys("Admin");
    }
    public void password(String pas)
    {
        pass.sendKeys("admin123");
    }
    public void login_btn()
    {
       login.click();
    }

}
