package testsWithLogin;

import org.testng.annotations.Test;
import pages.ShoppingCartPage;
import pages.UserPage;

public class CompareNameTest extends BaseTestWithLogin{
    @Test
    public void checkNameInCart(){
        UserPage userPage = new UserPage(driver);
        String itemName = userPage.saveItemName();
        userPage.addItemToCart().navigateToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.verifyItemNameInCart(itemName);
    }
}
