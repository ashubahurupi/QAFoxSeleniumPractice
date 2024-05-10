package MouseEventKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionsDemoThree {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement textarea = driver.findElement(By.xpath("(//textarea[@rows='10'])[2]"));
		textarea.click();
		
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.CONTROL+"v");
		actions.sendKeys();
	}

}
