import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/rabingurung/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.get() method is used to open or navigate on an URL and it will wait
		// till the whole page gets loaded
		// so webDriver will wait until the page has fully loaded before returning
		// control to the test case.
		driver.get("https://google.com");

		// with the use of navigate() you can move back() or forward() in your session's
		// history.
		// navigate() is faster than get() because navigate() does not wait for the page
		// to load fully or completely.
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.navigate().back();
		driver.navigate().forward();
	}

}

// explain java Script executor?

// JavaScriptExecutor is an interface that is used to execute JavaScriprt through selenium webdriver. 
// JavaScript is a programming language that interacts with HTML in a browser, and to use this function in Selenium, JavascriptExecutor is required.
// Selenium JavascriptExecutor allows users easily to inject and execute Javascript code directly within the context of browser window. 
// This feature is useful in case when the standard WebDriver's methods do not work to find an element on the browser web page.

// how do you handle frames in Selenium?
// To work with different nested iframes, we can use the method switchTo() to switch the frames using Index, Name, or Id & Web Element. 
// Moreover, you can switch to immediate parent iframe using method switchTo(). parentFrame(). 
// You can switch to the main web page from child iframe using method switchTo().
