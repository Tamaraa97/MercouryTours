package mercuryTours.test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mercuryTours.pageObjects.Home;
import mercuryTours.pageObjects.Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class RegistrationTest {
 WebDriver driver;
 Registration regist;
 
 
  @BeforeClass
  public void openBrowser() {
	  //                                            iz chromedriver.exe properties
	  System.setProperty(".webdriverchrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  @Test
  public void testRegLink() {
	  //postavlja URL u browser
	  driver.get(Home.HOME_URL);
	 
	  //driver definisan unutar ove klase izvan ove metode,i ne mora da se pravi citav konstuktor
	  //click na registration link
	  Home.clickOnRegLink(driver);
	  
	  regist.waitUsernameElement(driver);
	  //za uzimanje URL-a sa nase stranice,ne treba unutar njega unositi adresu
	  //TREBA DA SE STAVI POSLE KLIKA NA LINK!!!!!!!!!!!
	  //driver.getCurrentUrl();
	  
	  String currentUrl = driver.getCurrentUrl();
	  
	  String expectedUrl = "http://newtours.demoaut.com/mercuryregister.php";
	  
	  //boolean assert je izabran
	  Assert.assertTrue(currentUrl.contains(expectedUrl));
  }
  
  @Test
  public void testRegForm() {
	  //Registration je ime nase klase
	  driver.navigate().to(Registration.REG_URL);
	  regist = new Registration();
	  //bitan je redosled pozivanja metoda
	  regist.inputUsername(driver, "pera");
	  regist.inputPassword(driver, "Pera123");
	  regist.inputConfPassword(driver, "Pera123");
	  regist.clickSubmit(driver);
	  
	  String expectedUrl = "http://newtours.demoaut.com/create_account_success.php";
	  String acctualUrl = driver.getCurrentUrl();
	  Assert.assertTrue(acctualUrl.contains(expectedUrl));
	  
	  
  }

  @AfterClass
  public void closeBrowser() {
	  driver.close();
  }

}
