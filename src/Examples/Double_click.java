package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Double_click {
	@Test
	public void doubleclick() throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\237529\\Browserdriver\\msedgedriver.exe");
	 WebDriver driver = new EdgeDriver();
	 driver.get("https://demo.guru99.com/test/newtours/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 Actions actions = new Actions(driver);
	 WebElement submitbtn = driver.findElement(By.name("submit"));
	 actions.doubleClick(submitbtn).perform();
	 System.out.println("Button is double clicked");
	 Thread.sleep(2000);
	 String text= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
	 System.out.println(text);
	 Assert.assertEquals(text, "Login Successfully");
	 driver.quit();
	}
}
///html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3

