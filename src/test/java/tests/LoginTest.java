package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UserPage;
import utilities.PropertyManager;

public class LoginTest extends BaseTest{
    @Test
    public void login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.performLogin(PropertyManager.getInstance().getValidUsername(), PropertyManager.getInstance().getValidPassword());
        UserPage userPage = new UserPage(driver);
        userPage.verifyLogin();
    }
}
