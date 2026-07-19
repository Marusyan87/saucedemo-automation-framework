package scenarious;

import io.qameta.allure.Story;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pageobjectsmodels.LoginPage;
import utils.BaseTestClass;
import utils.ConfigReader;

@Epic("SauceDemo")
@Feature("Login")

public class LoginTest extends BaseTestClass {
    private static final Logger logger =
            LogManager.getLogger(LoginTest.class);



    @Test
    @Story("Valid Login")
    @Owner("Marius Aioanei")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that a user can log in using valid credentials")
    public void validLogin() {
        System.out.println("===== TEST STARTED =====");
        logger.error("LOGGER ERROR");
        logger.info("LOGGER INFO");

        logger.error("TEST LOGGER WORKS");
        driver.get(ConfigReader.get("baseUrl"));

        logger.info("Creating LoginPage");
        LoginPage loginPage = new LoginPage(driver);

        logger.info("Logging in with valid credentials");
        loginPage.login("standard_user", "secret_sauce");

        logger.info("Verifying inventory page");
        Assertions.assertEquals(
                "https://www.saucedemo.com/inventory.html",
                driver.getCurrentUrl());

        logger.info("Login test passed");
    }
}