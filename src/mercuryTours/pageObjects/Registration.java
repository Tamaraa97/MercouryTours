package mercuryTours.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

	public static final String REG_URL = "http://newtours.demoaut.com/mercuryregister.php";
	WebDriverWait  wait ;
	 
	By username = By.id("email");
	By password = By.name("password");
	By confPassword = By.name("confirmPassword");
	By submit = By.name("register");
	
	//webdriver koristimo da bi preneli nasu promenljivu
	public void inputUsername(WebDriver driver, String textUsername) {
		WebElement element = driver.findElement(username);
		element.sendKeys(textUsername);
	}
	
	public void inputPassword(WebDriver driver, String valuePassword) {
		WebElement element = driver.findElement(password);
		element.sendKeys(valuePassword);
	}

	
	public void inputConfPassword(WebDriver driver, String valueConfPassword) {
		WebElement element = driver.findElement(confPassword);
		//ovaj deo sa stringom u zagradi pisemo samo ako ima sendKeys
		element.sendKeys(valueConfPassword);
	}
	
	public void clickSubmit(WebDriver driver) {
		WebElement element = driver.findElement(submit);
		element.click();
	}
	
	public void waitUsernameElement(WebDriver driver) {
	wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(username));
	}

}
