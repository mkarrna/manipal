package demo1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Assertion_hard {
	WebDriver driver;
	String title;
	
	String Expected="Your Store";
	String NotExpected="My store";	
	@Test(priority=1)
	public void MainClass()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("http://tutorialsninja.com/demo/");
	title=driver.getTitle();
	}
	
	@Test(priority=2)
	public void t3()
	{
	//this Assert fails , in hard assertion this will stop execution of other assertion and return error message
	Assert.assertNull(Expected,"this true, its run otherwise fails");
		Object NullVal = null;
		Assert.assertNull(NullVal,"");
	
	Assert.assertNotNull(Expected,"this true, its run otherwise fails");
		Assert.assertNotNull(NotExpected, Expected);

	if(driver.findElement(By.linkText("Qafox.com")).isSelected())
		{
			Assert.fail("Test is ");
		}
	}
	
	
	
	@Test(priority=3)
	public void t1()
	{
	Assert.assertEquals(title,Expected,"both are matched ,its true otherwise false");
	}
	
	@Test(priority=4)
	public void t2()
	{
	Assert.assertNotEquals(title,NotExpected,"both are matched,its false otherwise true");
	
	Assert.assertTrue(driver.findElement(By.linkText("Qafox.com")).isDisplayed(),"this code working , its true otherwise false");
	
	Assert.assertFalse(driver.findElement(By.linkText("Qafox.com")).isSelected(),"this code is working ,its false otherwise true");
	}
	
	@AfterTest
	public void quit()
	{
		driver.quit();
	}
}
