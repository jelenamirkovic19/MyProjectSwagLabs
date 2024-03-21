package testsWithLogin;

import org.testng.annotations.Test;
import pages.ShoppingCartPage;
import pages.UserPage;

public class RemoveItemTest extends BaseTestWithLogin{
    @Test
    public void removeFromCartTest() {
        UserPage userPage = new UserPage(driver);
        userPage.addItemToCart().navigateToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.removeFromCart();
        shoppingCartPage.verifyEmptyShoppingCart();
    }
}
