package MouseEventKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPest {
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement searchField = driver.findElement(By.name("search"));
		searchField.sendKeys("Privet");
	}

}
