package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class FailedLoginTest extends BaseTest {

    @Test(testName = "Failed login with invalid credentials", dataProviderClass = data.DataProviders.class, dataProvider = "failedLogin")
    public void failedLogin(String username, String password, String error) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.performLogin(username, password);
        loginPage.verifyFailedLogin(error);
    }
}
