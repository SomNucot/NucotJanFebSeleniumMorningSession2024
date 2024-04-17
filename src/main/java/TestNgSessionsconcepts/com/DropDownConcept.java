package TestNgSessionsconcepts.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownConcept {
	
	
	ChromeDriver odriver;
	
	 //precondition
	@BeforeMethod
	void lauanchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
	
		
	}
	

	@Test(priority=1)
	void titleOfThePage()
	{
		
		String title=odriver.getTitle();
		System.out.println(title);
		
	}
	
	
	@Test(priority=2)
	void currentUrlOfThePage()
	{
		
		String url=odriver.getCurrentUrl();
		System.out.println(url);
		
	}
	
	@Test(priority=3)
	void personalDetails() throws InterruptedException
	{
		
		WebElement gender=odriver.findElement(By.xpath("//input[@id='gender-male']"));
		gender.click();
		WebElement firstName=odriver.findElement(By.xpath("//input[@id='FirstName']"));
		firstName.sendKeys("Nucot");
		WebElement lastName=odriver.findElement(By.xpath("//input[@id='LastName']"));
		lastName.sendKeys("Nucot");
		
		//Day
		
		WebElement day=odriver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		Select oselect=new Select(day);
		oselect.selectByIndex(24);//first way pick the value from the dropdown
		Thread.sleep(3000);
		oselect.selectByValue("10");
		Thread.sleep(3000);
		oselect.selectByVisibleText("Day");
		Thread.sleep(3000);
		
		//Month
		
		WebElement month=odriver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		Select oselect1=new Select(month);
		oselect1.selectByIndex(4);//first way pick the value from the dropdown
		Thread.sleep(3000);
		oselect1.selectByValue("5");
		Thread.sleep(3000);
		oselect1.selectByVisibleText("August");
		Thread.sleep(3000);
		
		
		//Year
		
				WebElement year=odriver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
				Select oselect2=new Select(year);
				oselect2.selectByIndex(10);//first way pick the value from the dropdown
				Thread.sleep(3000);
				oselect2.selectByValue("2024");
				Thread.sleep(3000);
				oselect2.selectByVisibleText("2023");
				Thread.sleep(3000);
		
		
		
	}
	
	
	
	@AfterMethod
	void closeAPP()
	{
		
		odriver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
