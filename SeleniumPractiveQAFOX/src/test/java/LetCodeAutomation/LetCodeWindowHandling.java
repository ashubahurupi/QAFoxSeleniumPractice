package LetCodeAutomation;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LetCodeWindowHandling {
	
	
	
	@Test
	public void windowHandling() throws InterruptedException
	{
		
//		Click on the home button
//		Goto the newly opened tab
//		Print the title of the page
//		Close the parent window
//		Close the child window
//		Click on the Muiltiple windows button
//		Print all the window title
//		Close all the windows
//		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		WebElement homeButton=driver.findElement(By.xpath("//button[@id='home']"));
		homeButton.click();
		String Parentid=driver.getWindowHandle();
		System.out.println(Parentid);
		Set<String> WindowIds = driver.getWindowHandles();
	    System.out.println("Parent window Id"+ Parentid);
	    
	    for(String winid : WindowIds)
	    {
	    	if(!winid.contentEquals(Parentid))
	    	{
	    	    driver.switchTo().window(winid);
	    	    System.out.println("This is child window"+winid);
	    	    String titalOfThePage=driver.getTitle();
	    	    System.out.println(titalOfThePage);
	    	    Assert.assertEquals(titalOfThePage, "LetCode - Testing Hub");
	    	}
	    	
	    	
	    }
	    driver.switchTo().window(Parentid);
	    WebElement multipleWindows=driver.findElement(By.xpath("//button[@id='multi']"));
	    Thread.sleep(2000);
	    multipleWindows.click();
	    Thread.sleep(2000);
	    driver.switchTo().window(Parentid).close();
	    
		
	}

}
