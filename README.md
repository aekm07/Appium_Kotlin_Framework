Test Automation Framework details:

The given framework is built for testing both Android and iOS devices (Real devices/Emulated)

Please find the tech stack used in the framework
1. Kotlin - best language for mobile app development, so the given framework can also be used by developers.
2. Maven - Maven is used for easier dependency management and updating the dependency with the hassle of installing jars manually and updating
3. Selenide - Basically is a wrapper around the code ensuring every line of the code is asserted without any failures. it has a vast library and the assertions are very easy to understand and readable
4. Guice - provides better dependency injection
5. Allure - reports with better views, categories, customization and test step logging
6. TestNG - Testing framework which can allow for better suite management when the framework is developed for regression/smoke
7. Appium - the driver for mobile testing

How to execute test from terminal(CMD or any IDE)
1. Use command npm install -g allure-commandline --save-dev to install allure reports.(Please refer the link: https://www.swtestacademy.com/allure-report-testng/)
2. Enter the given command in cmd prompt in windows appium --use-plugins=relaxed-caps
3. To execute the test,open terminal in IDE and enter mvn clean test  
4. generate allure report: mvn allure:serve.

You can execute the individual test by simply running the test class directly in IDE too.


