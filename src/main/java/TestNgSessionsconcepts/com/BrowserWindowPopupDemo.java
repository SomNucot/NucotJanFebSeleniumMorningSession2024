package TestNgSessionsconcepts.com;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopupDemo {
	
	
	ChromeDriver odriver;
	
	 //precondition
	@BeforeMethod
	void lauanchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
		
	}
	

	
	@Test(priority=1)
	void browserPopUp() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebElement jsAlert=odriver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		jsAlert.click();
		
		Thread.sleep(3000);
		//Switching to the alert
		
		Alert alert=odriver.switchTo().alert();
		
		Thread.sleep(3000);
		//Getting the text value
		String alertTextValue=alert.getText();
		System.out.println(alertTextValue);
		
		Thread.sleep(3000);
		//To click on Ok 
		alert.accept();
		
		Thread.sleep(3000);
		
		
		
			
		
	}
	
	
	
	@AfterMethod
	void closeAPP()
	{
		
		odriver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
