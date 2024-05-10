package MouseEventKeys;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JeQueryContextClickDemo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions=new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).contextClick(rightClickMe).build().perform();
		actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).release().build().perform();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String Heading =alert.getText();
		System.out.println(Heading);
		alert.accept();
		
		actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER)
		.sendKeys(Keys.DOWN).pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER)
		.sendKeys(Keys.DOWN).pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER)
		.sendKeys(Keys.DOWN).pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		String Heading2 =alert.getText();
		System.out.println(Heading);
		alert.accept();
		
	}

	private static Actions sendKeys(Keys down) {
		// TODO Auto-generated method stub
		return null;
	}

}
