package utils;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class TestListener implements TestExecutionExceptionHandler {

    @Override
    public void handleTestExecutionException(
            ExtensionContext context,
            Throwable throwable) throws Throwable {

        BaseTestClass base =
                (BaseTestClass) context.getRequiredTestInstance();

        byte[] screenshot =
                ((TakesScreenshot) base.driver)
                        .getScreenshotAs(OutputType.BYTES);

        Allure.addAttachment(
                "Failure Screenshot",
                new ByteArrayInputStream(screenshot)
        );

        throw throwable;
    }
}