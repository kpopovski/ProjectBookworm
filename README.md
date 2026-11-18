# Bookworm E-Commerce Test Automation Framework

A robust UI automation testing framework developed using **Java**, **Selenium WebDriver**, **TestNG**, and the **Page Object Model (POM)** design pattern.

This project automates and validates key user journeys of the Bookworm e-commerce application, covering Wishlist management and the complete Checkout process. The framework focuses on maintainability, scalability, and adherence to automation testing best practices.

## Application Under Test

**Bookworm Demo Store**

https://bookworm.madrasthemes.com/

---

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- WebDriverManager
- IntelliJ IDEA
- Git & GitHub

---

## Project Structure

```text
FinalProjectBookworm/
│
├── .idea/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── projectB/
│   │           └── CategoryPage.java
│   │
│   └── test/
│       └── java/
│           └── projectB.academy/
│               ├── MainClasses.java
│               ├── WishlistTest.java
│               └── CheckoutTest.java
│
├── target/
│
├── .classpath
├── .gitignore
├── .project
├── FinalProjectBookworm.eml
├── pom.xml
├── README.md
└── testng.xml
```

---

## Automated Test Scenarios

### 1. Wishlist Management Test

This test validates the Wishlist functionality from an end-user perspective.

#### Test Flow

1. Open Bookworm website
2. Navigate to Categories page
3. Select a book
4. Add the book to Wishlist
5. Open Wishlist through the header icon
6. Edit the book title
7. Verify the book is present in Wishlist
8. Verify the title was successfully updated
9. Close the browser

#### Validations

- Wishlist icon navigation works correctly
- Book is successfully added to Wishlist
- Updated title is displayed correctly
- Wishlist data persists after update

---

### 2. End-to-End Checkout Test

This test validates the complete purchase workflow.

#### Test Flow

1. Open Bookworm website
2. Navigate to Categories page
3. Add a book to Cart
4. Open Cart page
5. Proceed to Checkout
6. Complete Checkout form
7. Place the order
8. Verify successful order confirmation
9. Close the browser

#### Validations

- Product is added to Cart successfully
- Cart contents are displayed correctly
- Checkout page loads successfully
- User information is accepted
- Order submission completes successfully
- Order confirmation message is displayed

---

## Framework Design

The framework follows the **Page Object Model (POM)** design pattern to improve maintainability and code reuse.

### Key Features

- Reusable page classes
- Clear separation between test logic and page interactions
- Centralized element locators
- Scalable test architecture
- Easy maintenance and extension
- Automated browser setup using WebDriverManager

---

## Installation & Setup

### Prerequisites

Make sure the following tools are installed:

- Java JDK 11+
- Maven 3.8+
- IntelliJ IDEA
- Git

### Clone Repository

```bash
git clone https://github.com/your-username/bookworm-automation.git
```

### Navigate to Project

```bash
cd bookworm-automation
```

### Install Dependencies

```bash
mvn clean install
```

---

## Running Tests

### Run All Tests

```bash
mvn test
```

### Run Specific TestNG Suite

```bash
mvn test -DsuiteXmlFile=testng.xml
```
Updated GitHub Actions configuration.

---

## Test Coverage

| Module | Scenario | Status |
|----------|----------|----------|
| Wishlist | Add Book to Wishlist | |
| Wishlist | Verify Wishlist Item | |
| Wishlist | Edit Book Title | |
| Cart | Add Book to Cart | |
| Checkout | Complete Purchase Flow | |
| Checkout | Verify Order Success | |

---

## Testing Objectives

This project demonstrates:

- UI Automation Testing
- Functional Testing
- Regression Testing
- End-to-End Testing
- E-Commerce Workflow Validation
- Selenium Framework Development
- TestNG Suite Management
- Automation Best Practices

---

## Skills Demonstrated

- Selenium WebDriver
- Java Programming
- TestNG Framework
- Maven Dependency Management
- Page Object Model Design Pattern
- Assertions & Test Validation
- Git Version Control
- Test Automation Framework Design
- Web UI Testing
- Agile Testing Practices

---

## Future Improvements

- Selenium Grid Integration
- Cross-Browser Testing
- Data-Driven Testing
- Extent Reports Integration
- Parallel Test Execution
- CI/CD Pipeline with GitHub Actions
- Screenshot Capture on Failure
- Logging using Log4j

---

## Author

**Kristijian Popovski**

QA

### Connect with Me

- LinkedIn: *https://www.linkedin.com/in/kristijanpopovski7/*


---

## Repository Purpose

This repository was created to demonstrate practical QA Automation Engineering skills through real-world e-commerce test scenarios. It showcases the ability to design, develop, and maintain scalable Selenium automation frameworks while applying industry-standard testing practices.

If you found this project useful, feel free to star the repository and connect with me.
