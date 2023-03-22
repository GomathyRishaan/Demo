import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void browserLaunch(String url) {
		
		ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriverManager.chromedriver().setup();
	
driver = new ChromeDriver(options);	
	driver.get(url);
	}
	public static void inputText(WebElement element, String text)element.sendkeys(text);
}
		public static void dropDown(WebElement element, String text)
		{
			Select s = new Select(element);
		s.deselectByVisibleText(text);
		}
		public static void butt(WebElement element) {
			element.click();
		}
		public static String stringData(int row, int cell) {
			File loc = new File("");
			
			FileInputStream input = new FileInputStream(loc);
			Workbook w = new XSSFWorkbook(input);
			Sheet s = w.getsheet("selenium");
			Row r = s.getRow(row);
			Cell c = r.getcell(cell);
			String stringValue = c.getStringCellValue();
			return string1Value;
		}
		
		public static String numericData(int row, int cell) {
			File loc = new File("");
			
			FileInputStream input = new FileInputStream(loc);
			Workbook w = new XSSFWorkbook(input);
			Sheet s = w.getSheet("selenium");
			Row r = s.getRow(row);
			Cell c = r.getCell(cell);
			double d = c.getNumericValue();
			long l = (long) d;
			String numericData = String.valueOf(l);
			return numericData;
		}
		
		public static void max() {
			driver.manage().window().maximize();
		}
		public static void takesScreenshot(String path) {
			TakesScreenshotAs(OutputType.FILE);
			File destination = new File(path);
			FileUtils.copyFile(destination, destination);
		}
		}
		
			
		}
		