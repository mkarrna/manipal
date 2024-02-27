package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class hard {
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testhardassert() throws InterruptedException {
	
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(500);
			
			driver.manage().window().maximize();
			
			String actualTitle = driver.getTitle();
			
			String expectedTitle = "Orange";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
			
			driver.close();

}
	
}
