package TestNgSessionsconcepts.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {
	
	
	ChromeDriver odriver;
	
	 //precondition
	@BeforeMethod
	void lauanchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://the-internet.herokuapp.com/frames");
	
		
	}
	

	@Test(priority=1)
	void titleOfThePage() throws InterruptedException
	{
		
		String title=odriver.getTitle();
		System.out.println(title);
		
		
		WebElement nestedframe=odriver.findElement(By.xpath("//a[text()='iFrame']"));
		nestedframe.click();
		Thread.sleep(3000);
		
		
		//Switch to the frame
		//Using a name or ID or index
		//frame id
		//odriver.switchTo().frame("mce_0_ifr");
		//frame id
		odriver.switchTo().frame(0);
		
		 WebElement textValue=odriver.findElement(By.xpath("//body[@id='tinymce']"));
		 textValue.sendKeys("bangalore");
		 Thread.sleep(3000);
		
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		
		odriver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
