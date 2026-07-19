package utils;

import org.apache.commons.lang3.SystemUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

@ExtendWith(TestListener.class)
public class BaseTestClass {

    public WebDriver driver;

    @BeforeEach
    public void setUpTest() {

        driver = DriverFactory.createDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        if (SystemUtils.IS_OS_WINDOWS) {
            driver.manage().window().maximize();
        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}