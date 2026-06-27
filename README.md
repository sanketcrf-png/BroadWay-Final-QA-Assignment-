# BroadWay-Final-QA-Assignment-

This repository contains the automated regression test suite designed for the final QA assessment. The framework is built from scratch to validate critical e-commerce workflows on [SauceDemo](https://saucedemo.com) using **Java**, **Selenium WebDriver**, and **TestNG**.

All core script logic, locator implementations, and page validation steps are thoroughly documented inside the source files via inline code comments.

---

## Tech Stack & Tools
* **Language:** Java (100%)
* **Automation Library:** Selenium WebDriver (v4.x)
* **Testing Framework:** TestNG
* **Build Automation:** Maven (`pom.xml`)
* **IDE Configuration:** IntelliJ IDEA (`.idea/`)

---

## 🧪 Automated Test Scenarios
The test suite validates five core end-to-end capabilities on the target web application:

1. **Negative Authentication Validation:** Verifies system handling, access restrictions, and UI error responses when users attempt logging in with a locked-out profile.
2. **Positive Authentication Validation:** Assures valid credentials successfully authorize users and redirect them to the storefront catalog.
3. **Product Catalog Filtering:** Automates sorting mechanisms to verify product lists dynamically re-order by Name (Z-to-A) and Price (Low-to-High).
4. **Shopping Cart Lifecycle:** Simulates adding multiple inventory items to the cart and validates real-time cart badge counts.
5. **E-Commerce Checkout Pipeline:** Automates end-to-end purchase confirmation by populating shipping metadata and verifying successful transaction screens.

---

## 📂 Repository Structure
```text
├── .idea/                          # IDE configuration files
├── src/                            # Main automation source code folder
│   ├── main/java                   # Application layers & Page Object classes
│   └── test/java                   # TestNG execution suites & assertions
├── .gitignore                      # Git exclusion rules
├── pom.xml                         # Maven dependencies & build setup
└── README.md                       # Documentation
```

---

## ⚙️ How to Setup and Run

### Prerequisites
Make sure your system has the following configured:
* **Java Development Kit (JDK 11 or higher)**
* **Apache Maven** Installed
* **Google Chrome** browser installed 
