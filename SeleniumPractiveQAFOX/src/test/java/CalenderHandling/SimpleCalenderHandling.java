package CalenderHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleCalenderHandling {
	
	 public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	        WebElement datePicker = driver.findElement(By.id("datepicker"));
	        datePicker.click();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));

	        String expectedMonth = "March";
	        String expectedYear = "2025";
	        String expectedDate = "29";

	        while (true) {
	            WebElement currentMonthElement = driver.findElement(By.className("ui-datepicker-month"));
	            String currentMonth = currentMonthElement.getText();

	            WebElement currentYearElement = driver.findElement(By.className("ui-datepicker-year"));
	            String currentYear = currentYearElement.getText();

	            if (currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear))
	                break;

	            WebElement nextButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	            nextButton.click();
	        }

	        String xpathText = "//td[@data-handler='selectDay']/a[text()='" + expectedDate + "']";
	        WebElement date = driver.findElement(By.xpath(xpathText));
	        date.click();

	        // Close the browser
	       // driver.quit();
	    }
}


