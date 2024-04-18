package TestNgSessionsconcepts.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo3 {
	
	ChromeDriver odriver;
	
	 //precondition
	@BeforeMethod
	void lauanchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://the-internet.herokuapp.com/dropdown");
	
		
	}
	
	@Test(priority=1)
	void dropDownExample() throws InterruptedException 
	{
		WebElement option=odriver.findElement(By.xpath("//select[@id='dropdown']"));
		Select oselect=new Select(option);
		
		oselect.selectByIndex(1);
		
		Thread.sleep(3000);
		oselect.selectByValue("2");
		Thread.sleep(3000);
		
		oselect.selectByVisibleText("Option 1");
		Thread.sleep(3000);
		
		
	}
	
	
	
	@AfterMethod
	void closeAPP()
	{
		
		odriver.quit();
		
	}
	
	
	
	
	
	

}
