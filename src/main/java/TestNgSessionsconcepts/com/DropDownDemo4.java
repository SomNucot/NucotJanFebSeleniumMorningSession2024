package TestNgSessionsconcepts.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo4 {
	
	ChromeDriver odriver;
	
	 //precondition
	@BeforeMethod
	void lauanchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	
		
	}
	
	@Test(priority=1)
	void dropDownExample() throws InterruptedException 
	{
		WebElement optionToSelectCountry=odriver.findElement(By.xpath("//select[@id='dcdrLocation']"));
		Select oselect=new Select(optionToSelectCountry);
		
		oselect.selectByIndex(10);
		
		Thread.sleep(3000);
		oselect.selectByValue("7");
		Thread.sleep(3000);
		
		oselect.selectByVisibleText("Shimla");
		Thread.sleep(3000);
		
		
	}
	
	
	
	@AfterMethod
	void closeAPP()
	{
		
		odriver.quit();
		
	}

}
