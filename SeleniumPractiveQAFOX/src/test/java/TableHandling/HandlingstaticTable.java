package TableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingstaticTable {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> tableHeadings = driver.findElements(By.xpath("//table[@id='table1']//th"));
		
		for(WebElement heading :tableHeadings)
		{
			System.out.println(heading.getText());
		}
		
		List<WebElement> tableDatas = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
		
		for(WebElement data :tableDatas)
		{
			System.out.println(data.getText());
		}
		
		
		List<WebElement> places = driver.findElements(By.xpath("//table[@id='table1']//tr//td[3]"));
      
		for(WebElement place :places)
		{
			System.out.println("Place is"+ place.getText());
		}
		List<WebElement> mumbai = driver.findElements(By.xpath("//table[@id='table1']//tr[4]/td[3]"));
		for(WebElement mum :mumbai)
		{
			System.out.println("Place should be Mumbai"+ mum.getText());
		}
	}

}
