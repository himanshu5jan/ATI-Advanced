# ATI-Advanced

1. Following Programs explains use of page object model \n
a. LoginPage.java --> contains all the locators and actions required to perform the login methods  \n
b. LoginPageTest.java --> contains the Test Case that logs into JIRA using methods defined in LoginPage.java

2. Following Programs explains that when writing object class, you can club the set of actions in one method if that is something which is going to be reused :
a. LoginPage.java
b. LoginPageTest2.java --> contains Test Case where one method call can perform the login operation in jira.

3. Following programs explains how inheritance works
a. LoginPage.java --> has the logic to work with JIRA login page
b. BaseClass.java --> is the parent class which has global variables, @AfterMethod and @AfterClass 
c. LoginPage_Inherit_Test.java --> is the Test Class which inherits BaseClass.java
