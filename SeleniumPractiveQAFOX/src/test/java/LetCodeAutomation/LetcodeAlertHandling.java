package LetCodeAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LetcodeAlertHandling {
	
	
	
	@Test
	public static void alertHandling() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		// WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();;
		driver.get("https://letcode.in/alert");
		WebElement sampleAlert = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		sampleAlert.click();
		driver.switchTo().alert().accept();
		WebElement confirmeAlert = driver.findElement(By.xpath("//button[@id='confirm']"));
		confirmeAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		WebElement promptAlert = driver.findElement(By.xpath("//button[@id='prompt']"));
		Thread.sleep(2000);
		promptAlert.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Ashish Bahurupi");
		alert.accept();
	}

}
