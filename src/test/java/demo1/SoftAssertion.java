package demo1;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertion {
	WebDriver driver;
	SoftAssert asert = new SoftAssert();
	
	@BeforeTest
		public void mainMethod()
		{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		driver = new ChromeDriver();
			  
			driver.manage().window().maximize();		
			driver.get("http://tutorialsninja.com/demo/");
			
		}
	
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void configLogin()
	{
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("k799.karunakara@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		asert.assertEquals("jk","jk");
		
	}

	@Test
	public void configLogin1()
	{
		asert.assertEquals("jk","111jk");
	}
	@Test
	public void configLogin2()
	{
		asert.assertTrue(driver.findElement(By.linkText("Change your password")).isDisplayed());
		
		System.out.println("hxhh");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
