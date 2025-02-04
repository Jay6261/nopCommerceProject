# **NopCommerce Automation Testing - Selenium WebDriver**

## **Project Overview**
This project automates the testing of the **NopCommerce** demo eCommerce website using **Selenium WebDriver** with the **TestNG** framework. The automation covers user registration, login, product search, adding items to the cart, checkout, and payment confirmation.

## **Technology Stack**
- **Selenium WebDriver** - For automating web interactions
- **TestNG** - For test execution and reporting
- **Maven** - For project and dependency management
- **Extent Reports** - For generating HTML test reports
- **Java** - As the primary programming language

## **Test Scenarios Automated**
1. **User Registration**
2. **User Login**
3. **Product Search and Selection**
4. **Adding Products to Cart**
5. **Proceeding to Checkout**
6. **Payment and Order Confirmation**

## **Setup Instructions**
### **Prerequisites**
- Install **Java JDK (Latest version)**
- Install **Maven**
- Install **TestNG plugin** in your IDE (e.g., IntelliJ IDEA, Eclipse)
- Install **Google Chrome** and corresponding **ChromeDriver**

### **Project Setup**
1. Clone the repository or download the project.
2. Open the project in your preferred IDE.
3. Ensure that **Maven** dependencies in `pom.xml` are correctly set up.
4. Update `chromedriver.exe` path in the test script.

### **Execution Steps**
1. Open the terminal/command prompt.
2. Navigate to the project directory.
3. Run the tests using:
   ```bash
   mvn clean test
   ```
4. Alternatively, execute tests using `testng.xml` file in your IDE.

### **TestNG XML Execution**
- The `testng.xml` file is used to define test execution sequences, including priority and dependencies.
- Run it via TestNG plugin in your IDE.

### **Generating HTML Reports**
- **Extent Reports** will be generated in the project directory after test execution.
- Open `extentReport.html` in a browser to view test results.

## **Expected Outcome**
- User should be able to register successfully.
- Login should work with valid credentials.
- Products should be searchable and addable to the cart.
- Checkout process should complete with payment confirmation.

## **Conclusion**
This project provides a fully automated framework for testing the **NopCommerce** website, ensuring a seamless shopping experience for users.

---
**Author:** JAY Singh Narvariya 

