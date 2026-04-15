# 🚀 Selenium Test Automation Framework (BDD + POM)

A robust and scalable **Test Automation Framework** built using **Selenium, Java, and Cucumber (BDD)** following industry best practices like **Page Object Model (POM)** and layered architecture.

---

## 📌 Project Overview

This framework demonstrates:

- Behavior-Driven Development (BDD) using Cucumber
- Page Object Model (POM) design pattern
- Separation of concerns using Actions, Pages, and Steps
- Data-driven testing using JSON
- Scalable and maintainable automation design

---

## 🧰 Tech Stack

- **Automation Tool:** Selenium WebDriver  
- **Language:** Java  
- **Framework:** Cucumber (BDD), TestNG/JUnit  
- **Build Tool:** Maven  
- **Design Pattern:** Page Object Model (POM)  
- **Data Handling:** JSON  
- **Driver:** Edge WebDriver  

---

## 📂 Project Structure

```

SeleniumTAF/
│── demo/
│   ├── src/
│   │   ├── main/
│   │   │   ├── resources/
│   │   │       ├── data.json           # Test data
│   │
│   │   ├── test/
│   │       ├── java/
│   │       │   ├── pages/              # Page Object classes
│   │       │   │   ├── BasePage.java
│   │       │   │   ├── SignInPage.java
│   │       │   │   ├── SignUpPage.java
│   │       │   │
│   │       │   ├── actions/            # Business logic layer
│   │       │   │   ├── CommonActions.java
│   │       │   │   ├── SignInActions.java
│   │       │   │   ├── SignUpActions.java
│   │       │   │
│   │       │   ├── steps/              # Step Definitions
│   │       │   │   ├── CommonSteps.java
│   │       │   │   ├── Hooks.java
│   │       │   │
│   │       │   ├── runner/             # Test Runner
│   │       │       ├── RunCucumberTest.java
│   │       │
│   │       │   ├── utils/
│   │       │       ├── JsonUtils.java
│   │
│   │       ├── resources/
│   │           ├── features/           # Feature files
│   │           │   ├── SignInTest.feature
│   │           │   ├── SignUpTest.feature
│   │           │   ├── BrowserTest.feature
│   │           │
│   │           ├── msedgedriver.exe
│
│── pom.xml

````

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the repository
```bash
git clone https://github.com/Pramodreddy005/SeleniumTAF.git
cd SeleniumTAF/demo
````

### 2️⃣ Install dependencies

```bash
mvn clean install
```

---

## ▶️ Running Tests

### Run all tests

```bash
mvn test
```

### Run specific feature

```bash
mvn test -Dcucumber.options="src/test/resources/features/SignInTest.feature"
```

---

## 🧪 BDD Sample Scenario

```gherkin
Feature: Sign In Functionality

  Scenario: Valid Login
    Given User is on login page
    When User enters valid credentials
    Then User should be logged in successfully
```

---

## ⚡ Key Features

* ✅ BDD framework using Cucumber
* ✅ Page Object Model (POM) implementation
* ✅ Action layer for reusable business flows ⭐
* ✅ Data-driven testing using JSON
* ✅ Modular and scalable design
* ✅ Hooks for setup and teardown
* ✅ Clean separation of concerns

---

## 🔄 Framework Architecture

This framework follows a **layered design**:

* **Feature Files** → Define test scenarios (BDD)
* **Step Definitions** → Map steps to code
* **Actions Layer** → Business logic (reusable flows)
* **Page Layer** → UI element interactions
* **Utils Layer** → Common utilities (JSON, etc.)

👉 This ensures maintainability and scalability.

---

## 📈 Future Enhancements

* Integrate Allure Reporting
* Add parallel execution support
* Implement cross-browser testing
* Add CI/CD (Jenkins / GitHub Actions)
* Dockerize test execution

---

## 👨‍💻 Author

**Pramod Reddy**
QA Automation Engineer

* 🔗 GitHub: [https://github.com/Pramodreddy005](https://github.com/Pramodreddy005)
* 🔗 LinkedIn: [https://linkedin.com/in/pramodbairi](https://linkedin.com/in/pramodbairi)

