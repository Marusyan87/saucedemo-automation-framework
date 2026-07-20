# SauceDemo Automation Framework

## About

This project is a UI Automation Framework built using Selenium WebDriver and Java.

The framework follows the Page Object Model (POM) design pattern and includes reporting, logging, screenshots on failure and GitHub Actions CI.

---

## Technologies

- Java 21
- Selenium WebDriver
- JUnit 5
- Gradle
- Log4j2
- Allure Report
- Git
- GitHub
- GitHub Actions

---

## Project Structure

```
src
 ├── test
 │   ├── pageobjectsmodels
 │   ├── scenarious
 │   ├── utils
 │   └── resources
```

---

## Features

- Page Object Model
- Driver Factory
- Wait Utils
- Config Reader
- Screenshot on Failure
- Logging with Log4j2
- Allure Reporting
- GitHub Actions CI

---

## Test Scenarios

- Login Test
- Logout Test
- Add Product To Cart
- Remove Product From Cart
- Checkout Test

---

## Run Tests

```bash
./gradlew clean test
```

---

## Generate Allure Report

```bash
./gradlew allureServe
```

---

## Author

**Marius Aioanei**

Junior QA Automation Engineer