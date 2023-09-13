package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Facegenie 
{
	public static void main(String args[]) throws Exception
	{
		//Login to the application
		
		System.setProperty("Webdriver.chrome.driver", "D:\\SELENIUM WEB DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facegenie-ams-school.web.app/");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
		element.sendKeys("testbams@gmail.com");
		WebElement element1 = driver.findElement(By.xpath("//input[@id='password']"));
		element1.sendKeys("facegenie");
		
		//Logging out the application
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}

}
