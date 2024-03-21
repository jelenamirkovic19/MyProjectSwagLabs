package testsWithLogin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.LoginPage;
import utilities.PropertyManager;

public class BaseTestWithLogin {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
        driver.get(PropertyManager.getInstance().getUrl());

        LoginPage loginPage = new LoginPage(driver);
        loginPage.performLogin(PropertyManager.getInstance().getValidUsername(),PropertyManager.getInstance().getValidPassword());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
