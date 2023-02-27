import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "rabin";
		System.setProperty("webdriver.chrome.driver", "/Users/rabingurung/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		
		// get the text present in alert pop up box
		System.out.println(driver.switchTo().alert().getText());
		
		// Switching context from your driver browser to alert.
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
/*
 * How to handle Alert in Selenium WebDriver 1. void dismiss() // To click on
 * the 'Cancel' button of the alert. driver. ... 2. void accept() // To click on
 * the 'OK' button of the alert. driver. ... 3. String getText() // To capture
 * the alert message. driver. ... 4. void sendKeys(String stringToSend) // To
 * send some data to alert box.
 */

// Question 2:
// In a webpage, if there are three elements with same xpath value, how do we explicitly identify the third element on the page with the help of index. 
// Let us consider, the matching xpath be //input[@name=’Selenium’]
// (//input[@name='selenium'])[3]

// Question 3:
//How do you count number of checkboxes on a webpage?
// driver.findElements(By.cssSelector("input[type='checkbox']")).size()

// Question 4:
//Identify the method used in Selenium WebDriver to get the status of the radio buttons or checkboxes (selected or not).
// isSelected()

//Question 5:
//How do we capture the message visible on the alerts?
// driver.switchTo().alert().getText()

//Question 6:
//Identify the method used in Selenium WebDriver to verify the presence of a web element within the web page.
// isDisplayed()

// Question 7:
//What is the return type of the isEnabled () method?
// Boolean