package testsWithLogin;

import org.testng.annotations.Test;
import pages.ShoppingCartPage;
import pages.UserPage;

public class AddToCartTest extends BaseTestWithLogin{
    @Test
    public void addToCartTest(){
        UserPage userPage = new UserPage(driver);
        userPage.addItemToCart().navigateToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.verifyIsItemAddedToCart();
    }


}
