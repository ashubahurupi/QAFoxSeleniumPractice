package MouseEventKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventKeysDemoOne {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions act=new Actions(driver);
		
		WebElement blogs = driver.findElement(By.xpath("//a[@href='#']"));
		//act.moveToElement(blogs).perform();
		WebElement BlogsMenu = driver.findElement(By.xpath("//span[text()='SeleniumOneByArun']"));
		act.moveToElement(blogs).moveToElement(BlogsMenu).click().build().perform();
		
		
	}

}
