package Examples;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MercuryTours_screenshots {
	
		public static void main(String[] args) throws InterruptedException, IOException {
			
	System.setProperty("webdriver.edge.driver", "C:\\Users\\237529\\Browserdriver\\msedgedriver.exe");
			
			WebDriver driver = new EdgeDriver();
			driver.get("https://demo.guru99.com/test/newtours/");
			Thread.sleep(2000);
			driver.findElement(By.linkText("REGISTER")).click();
			Thread.sleep(2000);
			takesnapshot(driver);
		}
		public static void takesnapshot(WebDriver webdriver) throws IOException {
			File srcfile=((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
			File destinationfile=new File("C:\\Resource\\screenshots\\" + timestamp() + ".png");
			FileUtils.copyFile(srcfile, destinationfile);
		}
		public static String timestamp() {
			return new SimpleDateFormat("yyyy MM dd HH mm ss").format(new Date());
		}		
		}
	
		   /*	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("jagruthi");
			
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("k");*/
			



