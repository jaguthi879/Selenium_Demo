package Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mousehover {
	@Test
	public void mousehover() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\237529\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Thread.sleep(1000);
		 Actions actions = new Actions(driver);
		 WebElement webElement = driver.findElement(By.linkText("REGISTER"));
		 actions.moveToElement(webElement).perform();
		 //Thread.sleep(2000);
		 WebElement webElement1 = driver.findElement(By.name("submit"));
		 webElement1.click();
		 driver.quit();
	}
}

