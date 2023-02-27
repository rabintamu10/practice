import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellIntroduction {

	public static void main(String[] args) {
		/*Invoking Browser
		https://rahulshettyacademy.com/dropdownsPractise/ */

		//Chrome - class called (ChromeDriver) ->Methods -> e.g of methods; close
		// chromedriver.exe-> Chrome browser

		/*Once the driver is downloaded for a specific browser,
		QAs need the setProperty() method to define the path for that driver before
		writing any test cases.
		his helps the Selenium WebDriver identify the browser on which tests are to
		be executed.*/
		System.setProperty("webdriver.chrome.driver", "/Users/rabingurung/Downloads/chromedriver 2");

		// webdriver.chrome.driver->value of path //driver object here access to all the methods of chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}

/*what are tags in cucumber?
In Cucumber, tags are used to associate a test like smoke, regression etc. with a particular scenario.*/

//scenario outline in cucumber?
//The Scenario Outline keyword can be used to run the same Scenario multiple times, with different combinations of values.
//The keyword Scenario Template is a synonym of the keyword Scenario Outline .

//What are DataProviders in TestNG? 
//The DataProviders in TestNG are another way to pass the parameters in the test function, the other one being TestNG parameters. 
//DataProviders pass different values to the TestNG Test Case in a single execution and in the form of TestNG Annotations.

//What is data providers in Selenium?
//DataProvider helps with data-driven test cases that carry the same methods but can be run multiple times with different data sets. 
//It also helps in providing complex parameters to the test methods.

//In Java, method overriding occurs when a subclass (child class) has the same method as the parent class. 
//In other words, method overriding occurs when a subclass provides a particular implementation of a method declared by one of its parent classes.

//When two or more methods in the same class have the same name but different parameters, it's called overloading.
