package data;

import org.testng.annotations.DataProvider;
import utilities.PropertyManager;

public class DataProviders {
    @DataProvider(name = "failedLogin")
    public Object[][] failedLoginData(){
        return new Object[][] {
                {PropertyManager.getInstance().getInvalidUsername(), PropertyManager.getInstance().getInvalidPassword(),"Epic sadface: Username and password do not match any user in this service"},
                {PropertyManager.getInstance().getValidUsername(), PropertyManager.getInstance().getInvalidPassword(),"Epic sadface: Username and password do not match any user in this service"},
                {"","","Epic sadface: Username is required"},
                {PropertyManager.getInstance().getInvalidUsername(), "","Epic sadface: Password is required"},
                {"", PropertyManager.getInstance().getInvalidPassword(),"Epic sadface: Username is required"},
                {PropertyManager.getInstance().getInvalidUsername(), PropertyManager.getInstance().getValidPassword(),"Epic sadface: Username and password do not match any user in this service"}
        };
    }
}
