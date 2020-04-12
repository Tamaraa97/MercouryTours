package YouTube.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeYTPage {
	public static String YT_URL = "https://www.youtube.com/";
	
	public static void clickOnSearch(WebDriver driver) {
		WebElement search = driver.findElement(By.name("search_query"));
		search.click();
		search.sendKeys("Rick Astley");
		search.sendKeys(Keys.ENTER);
	
	}

}
