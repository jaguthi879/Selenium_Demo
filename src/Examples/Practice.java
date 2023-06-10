package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class Practice {
	
	WebDriver driver;
      @BeforeSuite
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\237529\\Browserdriver\\msedgedriver.exe");
				
				driver = new EdgeDriver();
			//	driver.manage().window().maximize();
				Thread.sleep(2000);
	}
	 
	    @Test			
         public void register() throws InterruptedException {
	    	
		      driver.get("https://demo.guru99.com/test/newtours/");
		
		         Thread.sleep(2000);
		
				driver.findElement(By.linkText("REGISTER")).click();
				driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("jagruthi");
				
				driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("k");
			
				driver.findElement(By.name("submit")).click();
				System.out.println("registered");
	
				driver.quit();
				

}
}
