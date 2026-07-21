# SauceDemo Selenium Automation Framework

## Overview

This project is a UI Test Automation Framework built using Java, Selenium WebDriver, JUnit 5 and Gradle.

The framework automates end-to-end scenarios for the SauceDemo application using the Page Object Model (POM) design pattern and reusable utilities.

---

## Tech Stack

- Java 21
- Selenium WebDriver
- JUnit 5
- Gradle
- Allure Report
- GitHub Actions
- Page Object Model (POM)

---

## Project Structure

src
├── pageobjectmodels
├── scenarious
├── utils
└── resources

---

## Automated Test Scenarios

- Login
- Logout
- Add Product to Cart
- Remove Product from Cart
- Checkout Flow

---

## Framework Features

- Page Object Model
- DriverFactory
- BaseTestClass
- BasePage
- WaitUtils
- ScreenshotUtils
- ConfigReader
- TestListener
- Allure Reports
- GitHub Actions CI

---

## Running the tests

Run all tests:

```bash
./gradlew test
```

Run a single test:

```bash
./gradlew test --tests scenarious.LoginTest
```

---

## Continuous Integration

GitHub Actions automatically executes all UI tests on every push to the repository.

---

## Author

Marius Aioanei

QA Automation Portfolio