package YouTube.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlayMusic {
	public static final String PLAY_URL = "https://www.youtube.com/results?search_query=Rick+Astley";
	WebDriverWait wait;
	By song = By.id("video-title");
	
	public void clickOnSong(WebDriver driver) {
		WebElement we = driver.findElement(song);
		we.click();
	}
	
	public void WaitPlay(WebDriver driver) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(song));
	}
	

}
