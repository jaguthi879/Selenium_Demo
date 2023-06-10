package Exceptions_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Exceptions {
	
	@Test
    public void test() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\237529\\Browserdriver\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("REGISTER")).click();
		 //Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("jagruthi");//use("//input[@name='firstName']")		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("k");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();
		 //driver.switchTo().alert().accept();  //NOAlertpresent exception
		   driver.quit();
		  // driver.findElement(By.linkText("SIGN-OFF")).click();//NoSuchSessionException
    }
}
