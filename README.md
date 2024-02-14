# Entrata Web Automation

Automation Entrata Website

## Description

Automating Entrata website and exploring the functionality of different pages through automation script

## Installation

Java
Eclipse 
Maven 
TestNG
Selenium

## Roadmap 

Automating end-to-end web functionality through automation script with the help of programming language i.e Java and executing testcases through TestNG framework.

## Description 
Launching the website with the help of webdriver manager and setting up the driver path to launch the browser

1. Developed a BaseTest class which has Initialization and setUp methods inside the test.java 
2. Created a webpage classes for adding xpath and creating the execution methods
3. Creating object of Page.java and using the methods of page class in Test class
4. LandingPage.java class is extending the methods of BaseTest.java
5. Using @BeforeSuite annotation to perform initialization() and launch the browser setUp() only once thorugh out the project

#### BaseTest

1. Using initialization method to initializing the property file
2. Using setUp method for launcing the browser instance
3. Using tearDown method to quit the browser instance 

#### HomeTest

1. LandingTest is extending BaseTest, created an object of LandingPage class to call HomePage methods 
2. Validating the text from entrata web page with assertion method
3. User is interacting to SignIn page
4. Performed Click action on SignIn CTA and added the synchronization methods to wait for some time
5. Navigated back to the default screen
6. Clicking on watch demo cta to perform an inetraction with form elements

#### Form Test

1. FormTest is extending LandingTest, created an object of FormPage class to call FormPage methods 
2. Performing click action and entering the FirstName
3. Performing click action and entering the LastName
4. Performing click action and entering Email Id
5. Performing click action and entering Company Name
6. Performing click action and entering Phone Number
7. Performing click action and entering Unit Count
8. Performing click action and entering Job Title
9. Navigating back to default screen

#### Product Test

1. ProductTest is extending FormTest, created an object of ProductPage class to call the ProductPage methods
2. Using action class to user mouse hover fuctions
3. With the help of action class moving mouse to Products and fetcing the h2 headers
4. Used for loop to fetch and click on Marketing & Leasing
5. Used for loop to find the web element Digital Marketing Sevices out of existing 31 web elemets
6. Performing click action on Digital Marketing Services

#### Resource Test 

1. ResourceTest is extending ProductTest, created an object of ResourcePage class to call the ResourcePage methods
2. Validating the text from resouce page with the help of assertion


#### Project Status 

Total Test Cases writtent - 4
Passed Test Case Count - 4
Failure - 0
Skip - 0 




