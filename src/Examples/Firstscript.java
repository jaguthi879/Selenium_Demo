package Examples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Firstscript {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\237529\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://petstore.octoperf.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Enter the Store")).click();
		 Thread.sleep(2000);
        driver.findElement(By.linkText("Sign In")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("jagruthi");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).clear();
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("Abc@123");
        Thread.sleep(2000);
        driver.findElement(By.name("signon")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='QuickLinks']/a[5]/img")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'Catalog\']/table/tbody/tr[3]/td[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Add to Cart")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'Cart\']/a")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        //driver.findElement(By.linkText("Sign Out")).click();
        Thread.sleep(2000);
		System.out.println("This Script is done");
		driver.quit();
		
	}

}
