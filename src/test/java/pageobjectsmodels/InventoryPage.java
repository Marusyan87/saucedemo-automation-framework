package pageobjectsmodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

    // Locators
    private final By backpackButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By removeBackpackButton = By.id("remove-sauce-labs-backpack");
    private final By cartBadge = By.className("shopping_cart_badge");
    private final By menuButton = By.id("react-burger-menu-btn");
    private final By logoutButton = By.id("logout_sidebar_link");
    private final By cartButton = By.className("shopping_cart_link");

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
        return isDisplayed(cartBadge);
    }

    public void logout() {
        click(menuButton);
        click(logoutButton);
    }

    public void openCart() {
        click(cartButton);
    }
}