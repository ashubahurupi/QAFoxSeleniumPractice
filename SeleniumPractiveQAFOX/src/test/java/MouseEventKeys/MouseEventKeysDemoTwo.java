package MouseEventKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventKeysDemoTwo {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page3.html");
		
		WebElement minPrice = driver.findElement(By.xpath("//a[@role='slider']"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(minPrice, 100, 0).perform();
		act.dragAndDropBy(minPrice, -100, 0).perform();
	}

}
