package MouseEventKeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeDemo {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		
		
	
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement optionElement = driver.findElement(By.xpath("//div[contains(@class, 'ui-icon-gripsmall-diagonal-se')]"));
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
		
		actions.pause(2).dragAndDropBy(optionElement, 150, 200).build().perform();
	}
}
