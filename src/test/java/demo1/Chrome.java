package demo1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.quit();
	
	  
  }
}
