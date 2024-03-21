package testsWithLogin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UserPage;

public class LogoutTest extends BaseTestWithLogin{

    @Test
    public void logout() {
        UserPage userPage = new UserPage(driver);
        userPage.performLogout();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyLogout();
    }
}
