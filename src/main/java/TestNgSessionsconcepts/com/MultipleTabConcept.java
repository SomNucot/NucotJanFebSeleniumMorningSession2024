package TestNgSessionsconcepts.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleTabConcept {
	
	
	ChromeDriver odriver;
	
	 //precondition
	@BeforeMethod
	void lauanchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://the-internet.herokuapp.com/windows");
	
		
	}
	
	
	
	
	
	@Test

	public void sigleWindowHandle() throws InterruptedException
	{

	
	String currentWindowHandle=odriver.getWindowHandle();
	System.out.println(currentWindowHandle);
	
	
	odriver.findElement(By.xpath("//a[text()='Click Here']")).click();

	odriver.switchTo().window(currentWindowHandle);
	
	Set<String> allWindows=odriver.getWindowHandles();
	
	for(String allWindows1:allWindows)
	{
		
		System.out.println(allWindows1);
		
		
		if(!currentWindowHandle.equals(allWindows1))
		{
		
			
			odriver.switchTo().window(allWindows1);
	
			Thread.sleep(3000);
		
			
			String title=odriver.getTitle();
			System.out.println("Title of child window--->"+title);
			
		}
		
		
	}
	
	

	}

	




@AfterMethod
void closeAPP()
{
	
	odriver.quit();
	
}

}
