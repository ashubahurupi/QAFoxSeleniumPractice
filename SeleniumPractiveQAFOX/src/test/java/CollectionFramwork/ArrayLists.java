package CollectionFramwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayLists {
	
	
	public static void main(String[] args) {
		
		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://docs.oracle.com/javase//8/docs/api/");
	   
	   
	   driver.switchTo().frame(0);
	   
	   
	   WebElement descriptionLink = driver.findElement(By.xpath("//a[text()='Description']"));
	   descriptionLink.click();
		
	}

}
