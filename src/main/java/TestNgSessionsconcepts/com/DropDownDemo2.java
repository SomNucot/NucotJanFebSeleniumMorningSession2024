package TestNgSessionsconcepts.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo2 {
	
	ChromeDriver odriver;
	
	 //precondition
	@BeforeMethod
	void lauanchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
	
		
	}
	
	@Test(priority=1)
	void dropDownExample() throws InterruptedException 
	{
		WebElement country=odriver.findElement(By.xpath("//select[@id='select-demo']"));
		Select oselect=new Select(country);
		
		oselect.selectByIndex(4);
		
		Thread.sleep(3000);
		oselect.selectByValue("Friday");
		Thread.sleep(3000);
		
		oselect.selectByVisibleText("Monday");
		Thread.sleep(3000);
		
		
	}
	
	
	
	@AfterMethod
	void closeAPP()
	{
		
		odriver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
