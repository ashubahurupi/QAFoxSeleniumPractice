package ScrollingBars;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollingsbars {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
	
		for(int i=1 ; i<=100 ; i++)
			textAreaField.sendKeys("Ashish Bahurupi. \n");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollTop = 0", textAreaField);
		Thread.sleep(2000); // Assuming you want to wait for 1 second here

		jse.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", textAreaField);
		
		jse.executeScript("arguments[0].scrollTop = 900", textAreaField);
	}

}
