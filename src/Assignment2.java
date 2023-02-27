import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/rabingurung/Downloads/chromedriver 2");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Multiple Windows")).click();

		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		// captured total open windows with the help of .getwindowhandles
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String parentWindow = it.next();
		// Switching to child window
		driver.switchTo().window(it.next());

		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentWindow);

		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

	}

}
