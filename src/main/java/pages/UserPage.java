package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage extends BasePage{
    public UserPage(WebDriver driver) {
        super(driver);
    }
    By addToCartButtonBy = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By burgerMenuButtonBy = By.xpath("//button[@id='react-burger-menu-btn']");
    By logoutButtonBy = By.xpath("//a[@id='logout_sidebar_link']");
    By shoppingCartButtonBy = By.xpath("//a[@class='shopping_cart_link']");
    By itemNameBy = By.xpath("//a[@id='item_4_title_link']");

    public void verifyLogin(){
        isElementDisplayed(addToCartButtonBy);
    }
    public void performLogout(){
        clickElement(burgerMenuButtonBy);
        clickElement(logoutButtonBy);
    }
    public UserPage addItemToCart(){
        clickElement(addToCartButtonBy);
        return this;
    }
    public void navigateToCart(){
        clickElement(shoppingCartButtonBy);
    }
    public String saveItemName(){
        return readText(itemNameBy);
    }

}
