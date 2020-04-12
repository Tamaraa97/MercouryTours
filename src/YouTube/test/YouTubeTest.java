package YouTube.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import YouTube.pageObjects.HomeYTPage;
import YouTube.pageObjects.PlayMusic;


public class YouTubeTest {

	
	WebDriver driver;
	PlayMusic music;
	
	
	@BeforeClass
	public void openBrowser() {
	System.setProperty(".webdriverchrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	@Test
	public void testYTSearch() {
		driver.get(HomeYTPage.YT_URL);
		HomeYTPage.clickOnSearch(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.youtube.com/results?search_query=Rick+Astley";
		Assert.assertTrue(currentUrl.contains(expectedUrl));
	}
	
	@Test
	public void testYTSong() {
		driver.navigate().to(PlayMusic.PLAY_URL);
		music = new PlayMusic();
		music.clickOnSong(driver);
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
		Assert.assertTrue(actualUrl.contains(expectedUrl));
		
	}
	

	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
}
