package Exceptions_in_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exceptions2 {
	@Test
	public void test() throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\237529\\Browserdriver\\msedgedriver.exe");
	 WebDriver driver = new EdgeDriver();
	 //driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;             
	 driver.get("https://www.automationtesting.co.uk/");
	 driver.manage().window().maximize();
	 driver.findElement(By.cssSelector(".toggle")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[contains(text(),'Test Store')]")).click();//use Test Store--
	 driver.findElement(By.linkText("Hummingbird Printed T-Shirt")).click();
	 driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
	 
	/* driver.findElement(By.linkText("ACCORDION")).click(); 
	 String text=driver.findElement(By.xpath("//h2[@id='content']")).getText();
	 System.out.println(text);
	 Assert.assertEquals(text, "Accordion Test");*/
     driver.quit();
}
}