package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;

public class DriverFactory {

    public static WebDriver createDriver() {

        String browser = ConfigReader.get("browser");

        if (browser == null || browser.isEmpty()) {
            browser = "chrome";
        }

        switch (browser.toLowerCase()) {

            case "chrome":

                ChromeOptions options = new ChromeOptions();

                options.addArguments("--disable-features=PasswordLeakDetection");
                options.addArguments("--disable-save-password-bubble");
                options.addArguments("--incognito");
                options.addArguments("--headless=new");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");

                options.setExperimentalOption(
                        "prefs",
                        Map.of(
                                "credentials_enable_service", false,
                                "profile.password_manager_enabled", false
                        )
                );

                return new ChromeDriver(options);

            default:
                throw new RuntimeException("Browser not supported: " + browser);
        }
    }
}