package MouseEventKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyEventOnTutorialsNinja {
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		
		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccount.click();
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		WebElement emailAddress = driver.findElement(By.xpath("//input[@id='input-email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));  // //input[@type='submit']
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		emailAddress.sendKeys("abahurupi@yopmail.com");
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.DOWN.TAB).keyUp(Keys.UP.TAB);
		password.sendKeys("password");
		actions.sendKeys(Keys.DOWN.TAB).keyDown(Keys.DOWN.TAB).perform();
		actions.sendKeys(Keys.DOWN.TAB).keyDown(Keys.DOWN.TAB).perform();
		actions.sendKeys(Keys.DOWN.TAB).keyDown(Keys.DOWN.TAB).perform();
		actions.sendKeys(Keys.ENTER).release().perform();
		
	}

}
