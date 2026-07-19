package scenarious;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjectsmodels.CartPage;
import pageobjectsmodels.CheckoutCompletePage;
import pageobjectsmodels.CheckoutOverviewPage;
import pageobjectsmodels.CheckoutPage;
import pageobjectsmodels.InventoryPage;
import pageobjectsmodels.LoginPage;
import utils.BaseTestClass;
import utils.ConfigReader;
import utils.ScreenshotUtils;

public class CheckoutTest extends BaseTestClass {

    @Test
    public void checkoutTest() {

        driver.get(ConfigReader.get("baseUrl"));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addBackpackToCart();
        inventoryPage.openCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillInformation("Marius", "Aioanei", "557260");

        CheckoutOverviewPage overviewPage = new CheckoutOverviewPage(driver);
        overviewPage.finishOrder();

        CheckoutCompletePage completePage = new CheckoutCompletePage(driver);

        ScreenshotUtils.takeScreenshot(driver, "checkout");

        Assertions.assertEquals(
                "Thank you for your order!",
                completePage.getConfirmationMessage()
        );
    }
}
