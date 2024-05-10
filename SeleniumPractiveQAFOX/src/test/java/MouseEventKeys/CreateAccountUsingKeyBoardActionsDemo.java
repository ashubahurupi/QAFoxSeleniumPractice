package MouseEventKeys;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateAccountUsingKeyBoardActionsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		Thread.sleep(2000);
		myAccount.click();
		WebElement loginOption = driver.findElement(By.xpath("//a[text()='Register']"));
		Thread.sleep(2000);
		loginOption.click();
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Ashish");
		Actions actions =new Actions(driver);
		actions.sendKeys(Keys.TAB).release().build().perform();
		actions.sendKeys("Bahurupi").pause(Duration.ofSeconds(2));
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.TAB).release()
		.sendKeys("ashish@yopmail.com").build().perform();
		
	}

}
