package scenarious;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjectsmodels.InventoryPage;
import pageobjectsmodels.LoginPage;
import utils.BaseTestClass;
import utils.ConfigReader;

public class LogoutTest extends BaseTestClass {

    @Test
    public void logoutTest() {

        driver.get(ConfigReader.get("baseUrl"));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.logout();

        Assertions.assertEquals(
                "https://www.saucedemo.com/",
                driver.getCurrentUrl()
        );
    }
}