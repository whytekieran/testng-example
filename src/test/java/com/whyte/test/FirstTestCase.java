package com.whyte.test;

import org.testng.annotations.Test;

public class FirstTestCase {
  
  @Test(priority=1)
  public void setup() {
	  System.out.println("Opening Browser and Application");
  }
  
  @Test(priority=2)
  public void login() {
	  System.out.println("Logging into application");
  }
  
  @Test(priority=3)
  public void teardown() {
	  System.out.println("closing application");
  }
	
}

/*
 * NOTES
 * 1. By Default TestNg executes tests in alphabetical order but we can pass 
 * priority=1 or any other number into @Test to change the order
 * 2. The TestNG.xml file can be used to run multiple test cases as a suite. We
 * can create multiple suites and execute them parallelly. We can also pass parameters
 * from the XML file to the test.
 * 3. @BeforeMethod runs before each test method method. and @BeforeClass is before each class
 * 4. @AfterMethod runs after each test method and @AfterClass is after each class
 * 5. Suite -> Test -> Class -> Method is the hierarchy used
 * 6. @BeforeTest runs before each test, doesnt matter which class inside the test this method is.
 * 7. @AfterTest runs after each test, doesnt matter which class inside the test this method is.
 * 8. @BeforeSuite runs before a test suite, doesnt matter which class inside the suite its in
 * 9. @AfterSuite runs after a test suite, doesnt matter which class inside the suite its in
 * 10. Passing enabaled=false into the @Test annotation will disable that test.
 * 11. Dependency Tests - When you have multiple test method you may have a dependencies, one test may depend on
 * 		another. Example shown in DependencyExample.java. You can something called dependsOnMethods in @Test annotation
 * 12. Grouping tests, similar to the concept of tagging in JUnit5 we only run tests which are in a certain group.
 * 		Example shown in GroupingExample.java. Useful if some test are unit, integration etc and is done by
 * 		adding groups={"group_name"} into the @Test annotation. Which groups are run is specified in grouping.xml ..can 
 * 		also use exclude tag
 * 13. Assertions are very similar to JUnit5 check out assertions example using selenium inside 
 * 		AssertionsExample.java
 * 14. Parameters can be passed from the xml into your test, example of this also show inside AssertionsExample.java
 * 		It is accomplished with the @Parameters annotation.
 * 15. DataProviders are used for data driven testing meaning you can different sets of data to the same test method
 * 		Its very powerful. One method generates and passes the data to another method which runs repeatedly with the
 * 		different data sets. The method that generates the data is the data provider method. Annotated methods 
 * 		return a two dimensional array. The data provider has a name and is used in other methods by calling that name.
 * 		It can be used in same or different class. The method is annotated with @DataProvider example inside 
 * 		DataProviderExample.java
 * 16. Parallel tests you can run methods, class and suites in parallel. You can open multiple threads of execution to 
 * 		execute all everything together. This means the tests will be done faster. New package testParallel has an example
 *      and more here https://www.youtube.com/watch?v=M93T8T69akw&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=10 
 * 17. Listeners when you execute your test methods, some may fail, some may pass, some may skip. Based on the
 *      results of those tests you may want to perform certain actions, called post actions. For this we use
 *      Listeners. TestNG has included many interfaces and libraries for this. These methods can only be performed
 *      via Listeners. There are many different Listeners and documentation here;
 *      https://testng.org/doc/documentation-main.html#testng-listeners basically theres a bunch of methods you can call
 *      at different stages of the test lifecycle of at different occurances.
 *      
 * 
 * */
