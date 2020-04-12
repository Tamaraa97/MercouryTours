package mercuryTours.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	//Home url je veliko ok je staviti kod public static promenljive,to je praksa ali nije obavezno
	public static String HOME_URL = "http://newtours.demoaut.com/";
	
	//public static By register = By.linkText("REGISTER");
	//pisemo u zagradi webdriver da ne bi morali da pisemo celu sint
	public static void clickOnRegLink(WebDriver driver) {
		//Kada je onako ispisana promenljiva u zagradi umesto teksta ide samo naziv promenljive
		WebElement regLink = driver.findElement(By.linkText("REGISTER"));
		regLink.click();
	}
}
