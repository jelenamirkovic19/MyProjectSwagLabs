package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ShoppingCartPage extends BasePage{
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
    By removeButtonBy = By.xpath("//button[text()='Remove']");
    By shoppingCartIconBy = By.xpath("//a[@class='shopping_cart_link']");
    By cartItemNameBy = By.xpath("//div[@class='inventory_item_name']");
    By checkoutButonBy = By.xpath("//button[@id='checkout']");
    By firstnameFieldBy = By.xpath("//input[@id='first-name']");
    By lastnameFieldBy = By.xpath("//input[@id='last-name']");
    By zipCodeFieldBy = By.xpath("//input[@id='postal-code']");
    By continueButtonBy = By.xpath("//input[@id='continue']");
    By finishButtonBy = By.xpath("//button[@id='finish']");
    By backHomeButtonBy = By.xpath("//button[@id='back-to-products']");

    public void removeFromCart(){
        clickElement(removeButtonBy);
    }
    public void verifyEmptyShoppingCart(){
        isElementDisplayed(shoppingCartIconBy);
    }
    public void verifyIsItemAddedToCart(){
        isElementDisplayed(removeButtonBy);
    }
    public void verifyItemNameInCart(String expectedPrice){
        assertStringEquals(readText(cartItemNameBy), expectedPrice);
    }
    public void checkout() {
        clickElement(checkoutButonBy);
    }
    public void performCheckout(String firstname, String lastname, String postalCode) {
        writeText(firstnameFieldBy, firstname);
        writeText(lastnameFieldBy, lastname);
        writeText(zipCodeFieldBy, postalCode);
        clickElement(continueButtonBy);
    }
    public void finishButton() {
        clickElement(finishButtonBy);
    }
    public void verifyFinish(){
        isElementDisplayed(backHomeButtonBy);
    }
}
