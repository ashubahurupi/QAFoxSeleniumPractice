package MouseEventKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldMoveToElementAndRelease {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement norway = driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2']"));  // //div[@id='box3']
		WebElement washingtone = driver.findElement(By.xpath("//div[@id='box3']"));  // //div[@id='box4']
		WebElement copenhagen = driver.findElement(By.xpath("//div[@id='box4']"));   // //div[@id='box7'] 
		WebElement madrid  = driver.findElement(By.xpath("//div[@id='box7']"));  //div[@id='box1']
		WebElement oslo  = driver.findElement(By.xpath("//div[@id='box1']"));
		
		
		// Countries 
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement italy2 = driver.findElement(By.xpath("//div[@id='box107']"));
		WebElement italy3 = driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement Denmark = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement South_Korea = driver.findElement(By.xpath("//div[@id='box106']"));
		Actions actions=new Actions(driver);
		actions.clickAndHold(rome).perform();
		actions.moveToElement(norway).release().build().perform();
	}

}
