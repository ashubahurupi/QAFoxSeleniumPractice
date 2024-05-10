package LetCodeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LetCodeHandlingIframe {
	
	public WebDriver driver;
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	@Test
	public void handlingiframe() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		WebElement firstFrame = driver.findElement(By.xpath("//iframe[@id='firstFr']"));
		driver.switchTo().frame(firstFrame);
		WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='Enter name']"));
		firstName.sendKeys("Ashish");
		WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Enter email']"));
		lastName.sendKeys("bahurupi");
		WebElement validationText=driver.findElement(By.xpath("//p[@class='title has-text-info']"));
		System.out.println(validationText.getText());
		WebElement innerFrame=driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		Thread.sleep(2000);
		driver.switchTo().frame(innerFrame);
		WebElement emailIdInput=driver.findElement(By.xpath("//input[@name='email']"));
		emailIdInput.sendKeys("abahurupi@yopmail.com");
		driver.switchTo().parentFrame();
		WebElement firstName1=driver.findElement(By.xpath("//input[@placeholder='Enter name']"));
		firstName.clear();
		firstName.sendKeys("Ashish1");
		WebElement lastName1=driver.findElement(By.xpath("//input[@placeholder='Enter email']"));
		lastName.sendKeys("bahurupi1");
		
	}

}
