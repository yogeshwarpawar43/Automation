# Playwright Java POM Framework

This workspace contains a starter Java automation framework using Playwright and a Page Object Model structure.

## Structure
- src/test/java/com/example/base/BaseTest.java - shared browser setup and teardown
- src/test/java/com/example/pages/HomePage.java - page object for the home page
- src/test/java/com/example/tests/HomePageTest.java - first sample test

## Run tests
```bash
mvn test
```

## Notes
- The framework uses JUnit 5 and Playwright for Java.
- Add more page objects under src/test/java/com/example/pages and tests under src/test/java/com/example/tests.
