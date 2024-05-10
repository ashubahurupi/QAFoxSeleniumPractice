package MouseEventKeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDownAndKeysUp {
	
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement compendiumdev = driver.findElement(By.linkText("compendiumdev"));
		WebElement onlytestingblog = driver.findElement(By.linkText("onlytestingblog"));
		WebElement testwisely = driver.findElement(By.linkText("testwisely"));
		WebElement jqueryui = driver.findElement(By.linkText("jqueryui")); 
		WebElement theautomatedtester = driver.findElement(By.linkText("theautomatedtester")); 
		
		Actions actions =new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).keyDown(Keys.DOWN.CONTROL).click(compendiumdev).build().perform();
		actions.pause(Duration.ofSeconds(2)).keyDown(Keys.DOWN.CONTROL).click(onlytestingblog).build().perform();
		actions.pause(Duration.ofSeconds(2)).keyDown(Keys.DOWN.CONTROL).click(testwisely).build().perform();
		actions.pause(Duration.ofSeconds(2)).keyDown(Keys.DOWN.CONTROL).click(jqueryui).build().perform();
		actions.pause(Duration.ofSeconds(2)).keyDown(Keys.DOWN.CONTROL).click(theautomatedtester).build().perform();
	}

}
