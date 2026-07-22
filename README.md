# SauceDemo Automation Framework

Java Selenium automation framework built using Page Object Model (POM), Cucumber, JUnit 5, Allure Reports and GitHub Actions.

---

## Technologies

- Java
- Selenium WebDriver
- Cucumber (BDD)
- JUnit 5
- Gradle
- Allure Reports
- GitHub Actions

---

## Project Structure

```
src
├── main
└── test
    ├── java
    │   ├── hooks
    │   ├── pageobjectsmodels
    │   ├── runners
    │   ├── scenarios
    │   ├── stepdefinitions
    │   └── utils
    └── resources
        └── features
```

---

## Test Scenarios

✔ Login

✔ Logout

✔ Add product to cart

✔ Remove product from cart

✔ Complete checkout

---

## Design Pattern

- Page Object Model (POM)
- Reusable BasePage
- Hooks for setup and teardown
- DriverFactory
- ConfigReader
- Explicit waits
- Screenshot support

---

## Run Tests

Run all tests:

```bash
./gradlew test
```

or on Windows

```bash
gradlew.bat test
```

---

## Generate Allure Report

```bash
gradlew allureReport
```

Open report:

```bash
gradlew allureServe
```

---

## GitHub Actions

The project includes a GitHub Actions workflow that automatically executes the test suite on every push.

---

## Author

**Marius Aioanei**

Junior QA Automation Engineer
