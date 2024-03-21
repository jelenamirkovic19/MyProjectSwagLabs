package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {

        super(driver);
    }
    By usernameFieldBy = By.xpath("//input[@id='user-name']");
    By passwordFiledBy = By.xpath("//input[@id='password']");
    By loginButtonBy = By.xpath("//input[@id='login-button']");
    By errorNotificationBy = By.xpath("//div[@class='error-message-container error']");

    public void performLogin(String username, String password){
        writeText(usernameFieldBy,username);
        writeText(passwordFiledBy, password);
        clickElement(loginButtonBy);
    }
    public void verifyLogout(){
        isElementDisplayed(loginButtonBy);
    }
    public void verifyFailedLogin(String expectedText){
        assertStringEquals(readText(errorNotificationBy), expectedText);
    }
}


