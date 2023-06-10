package Examples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_cls {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\237529\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 Actions actions = new Actions(driver);
		 WebElement webElement = driver.findElement(By.linkText("REGISTER"));
		 actions.contextClick(webElement).perform();
		 Thread.sleep(2000);
		 System.out.println("Right click Context Menu displayed");
		 driver.quit();
}
	
}
