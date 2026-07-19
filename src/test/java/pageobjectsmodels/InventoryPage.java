package pageobjectsmodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

    // Locators
    private By backpackButton = By.id("add-to-cart-sauce-labs-backpack");
    private By removeBackpackButton = By.id("remove-sauce-labs-backpack");
    private By cartBadge = By.className("shopping_cart_badge");
    private By shoppingCartBadge = By.className("shopping_cart_badge");
    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutButton = By.id("logout_sidebar_link");
    private By cartButton = By.className("shopping_cart_link");

    // Constructor
    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    // Actions
    public void addBackpackToCart() {
        click(backpackButton);
    }

    public void removeBackpackFromCart() {
        click(removeBackpackButton);
    }

    public String getCartItemsNumber() {
        return getText(cartBadge);
    }

    public boolean isCartBadgeDisplayed() {
        return isDisplayed(shoppingCartBadge);
    }

    public void logout() {
        click(menuButton);
        click(logoutButton);
    }

    public void openCart() {
        click(cartButton);
    }
}
