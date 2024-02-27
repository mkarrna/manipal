package DataDriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class ReadExcel {
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;

	@SuppressWarnings("deprecation")
	@Test
	public void fblogin() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\maven\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		// Import excel sheet
		String excelFilePath = System.getProperty("user.dir")+"\\files\\Book1.xlsx";
		File src = new File(excelFilePath);
		// load the file
		FileInputStream fis = new FileInputStream(src);
		// load the work book

		workbook = new XSSFWorkbook(fis);
		// access the sheet from the work book
		sheet = workbook.getSheetAt(0);
		for (int i = 1; i<sheet.getLastRowNum(); i++) {
			// import the data from email
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			cell = sheet.getRow(i).getCell(0);
			driver.findElement(By.xpath("//input[@name = 'email']")).clear();
			driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys(cell.getStringCellValue());

			// import the data for the password 
			Thread.sleep(1000);

			cell = sheet.getRow(i).getCell(1);
			driver.findElement(By.xpath("//input[@id = 'pass']")).clear();
			driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys(cell.getStringCellValue());


		}
		driver.quit();

	}




 
}