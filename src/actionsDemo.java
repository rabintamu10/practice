import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rabingurung/Downloads/chromedriver 2");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		// Creating action class to handle this interact 
		// In this action class argument we are passing driver object so that driver will get the capabilities of actions class methods
		Actions a = new Actions(driver); 
		WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		//.build means ready to execute and .perform is ready to perform
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//Moves to specific element
		a.moveToElement(move).contextClick().build().perform();
		
		
	}

}
