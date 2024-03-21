package testsWithLogin;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import com.github.javafaker.service.FakeValuesService;
import org.testng.annotations.Test;
import pages.ShoppingCartPage;
import pages.UserPage;

public class ShoppingTest extends BaseTestWithLogin{
    @Test
    public void shoppingTest() {
        UserPage userLoggedInPage = new UserPage(driver);
        userLoggedInPage.addItemToCart().navigateToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.checkout();
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String zipCode = faker.address().zipCode();
        shoppingCartPage.performCheckout(firstName, lastName, zipCode);
        shoppingCartPage.finishButton();
        shoppingCartPage.verifyFinish();
    }
}
