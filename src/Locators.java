import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		// $('//input[@placeholder='Name']') console

		// Css Selector

		/* Class name to css-> tagname.classname -> Button.signInBtn
		   ID to css-> tagname#id -> input#inputUsername
		   Tagname[attribute='value']

		   <input> type="text" placeholder="Username" value="">
		   Input [placeholder=' Username']
		   "input[type='text']:nth-child(3)"
		   Parenttagname childtagname */

		// Xpath
		// Absolute xpath depends on the parent node, while xpath relative is
		// independent of parent node.

		/* <input> type="text" placeholder="Username" value="">
		   //Tagname[@attribute='value']
		   //input[@placeholder='Username']
		   //*[contains(@id,'Username')]
		   //"input[@type='text'][2]"
		   //parentTagname/childTagname
		   //header/div/button[1]/following-sibling::button[1]
		   //header/div/button[1]/parent::div/ parent to parent

		// <input type="text" placeholder="Name">
		// input[@placeholder='Name']

		// //button[contains(@class,'submit')] */

		// Implicit wait - 5seconds time out

		System.setProperty("webdriver.chrome.driver", "/Users/rabingurung/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();

		// waiting for object to show
		// Hey wait for 3 number of seconds before you throw exception
		// what was the ideal strategy of using ideal synchronization in selenium
		// the implicit and explicit combination of both is an ideal solution. 
		// in real time if they work on a project where there are 1000 of test cases then you will understand the importance of explicit

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// ID name
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		// Name
		driver.findElement(By.name("inputPassword")).sendKeys("Hello123");

		// ClassName
		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		// Link text
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);

		// xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rabin");

		// Css Selector
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@rsd.com");

		// xpath
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		// cssselector
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("John@gmail.com");

		// xpath
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("986412345");

		// single page application reactor //cssSelector
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		// xpath
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);

		// cssSelector
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		// cssid
		driver.findElement(By.id("chkboxOne")).click();

		// xpath
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}

// postman collection to automate those API calls

// I use SQL for the backEnd

//Python which was integrated in robot framework. 

//azure goes with CI/CD / Jenkins for a nightly run 

//introduction

// talking about myself i have been working more than 6 years in this field. 
