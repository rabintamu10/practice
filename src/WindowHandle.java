import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "/Users/rabingurung/Downloads/chromedriver 2");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();

		//.getWindowHandles methods will get the window handles IDs of all the windows which is opened by your automation. 
		Set<String> windows = driver.getWindowHandles(); //now both windows are in "windows" object
		//pulling those windows ID 
		Iterator<String> it = windows.iterator();
		//.it next this methods that will help to get the next index of the set
		String parenID = it.next();
		String ChildID = it.next();
		driver.switchTo().window(ChildID);
		
		String emailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parenID);
		driver.findElement(By.id("username")).sendKeys(emailID);
	}

}
