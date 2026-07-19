package pageobjectsmodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    // Locators
    private By cartButton = By.className("shopping_cart_link");
    private By checkoutButton = By.id("checkout");

    // Constructor
    public CartPage(WebDriver driver) {
        super(driver);
    }

    // Actions
    public void openCart() {
        click(cartButton);
    }

    public void clickCheckout() {
        click(checkoutButton);
    }
}