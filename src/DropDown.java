import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// handeling static dropdown
		
		System.setProperty("webdriver.chrome.driver", "/Users/rabingurung/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//xpath 
		// //a[@value='MAA']
		// //a[@value='BLR'] ctl00_mainContent_ddl_destinationStation1_CTXT
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//unique class name to select the current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		

	}

}
