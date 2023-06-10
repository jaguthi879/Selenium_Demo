package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Alert_ {
	
	@Test
	public void alerts() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\237529\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/");
		 driver.manage().window().maximize();
		// Thread.sleep(2000);
		 driver.findElement(By.linkText("Flights")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 driver.quit();
	}

}
