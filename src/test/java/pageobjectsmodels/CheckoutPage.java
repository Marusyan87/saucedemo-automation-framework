package pageobjectsmodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    // Locators
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");

    // Constructor
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    // Actions
    public void fillInformation(String firstName, String lastName, String postalCode) {

        type(firstNameField, firstName);
        type(lastNameField, lastName);
        type(postalCodeField, postalCode);

        click(continueButton);
    }
}