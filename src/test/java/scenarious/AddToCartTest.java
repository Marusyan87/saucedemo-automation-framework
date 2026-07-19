package scenarious;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjectsmodels.InventoryPage;
import pageobjectsmodels.LoginPage;
import utils.BaseTestClass;
import utils.ConfigReader;

public class AddToCartTest extends BaseTestClass {

    @Test
    public void addProductToCart() {

        driver.get(ConfigReader.get("baseUrl"));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);

        inventoryPage.addBackpackToCart();

        Assertions.assertEquals(
                "1",
                inventoryPage.getCartItemsNumber()
        );
    }
}