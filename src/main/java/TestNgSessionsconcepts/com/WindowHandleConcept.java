package TestNgSessionsconcepts.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleConcept {
	
	ChromeDriver odriver;
	
	 //precondition
	@BeforeMethod
	void lauanchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("http://www.naukri.com/");
	
		
	}
	

	
	@Test(priority=1)
	void windowHandle() throws InterruptedException
	{
		
		String parentwindowId=odriver.getWindowHandle();
		System.out.println(parentwindowId);
		
		String parentTitle=odriver.getTitle();
		System.out.println("Parent window title-->"+parentTitle);
		
		
		
		Thread.sleep(3000);
		WebElement remote=odriver.findElement(By.xpath("//a[@title='Remote']"));
		
		remote.click();
		
		
		//List and Set
		Set<String> windowIds=odriver.getWindowHandles();
	
		Iterator<String> i1=windowIds.iterator();
		
		while(i1.hasNext())
		{
			
			
			
			String childWindowId=i1.next();
			System.out.println(childWindowId);
			
			if(!parentwindowId.equals(childWindowId))
			{
			
				Thread.sleep(3000);
				odriver.switchTo().window(childWindowId);
		
				Thread.sleep(3000);
			
				
				String title=odriver.getTitle();
				System.out.println("Title of child window--->"+title);
				
				Thread.sleep(3000);
				WebElement 	jobs=odriver.findElement(By.xpath("//div[text()='Jobs']"));
				jobs.click();
				
			
//				WebElement reg=odriver.findElement(By.xpath("//a[text()='Register']"));
//			
//				reg.click();
				Thread.sleep(3000);
			
			}
		
			
			
			
		}
			
			
			
			
		}
		
		
		
		
		
		

	
	@AfterMethod
	void closeAPP()
	{
		
		odriver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
