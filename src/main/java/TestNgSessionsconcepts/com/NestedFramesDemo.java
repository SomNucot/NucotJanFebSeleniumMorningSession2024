package TestNgSessionsconcepts.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFramesDemo {
	
	
	
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
		
		
		WebElement nestedframe=odriver.findElement(By.xpath("//a[text()='Nested Frames']"));
		nestedframe.click();
		Thread.sleep(3000);
		
		
		//Switch to the frame
		
		//frame frameset-->locator
		//Number of Frames on a Page
        int countIframesInPage =odriver.findElements(By.name("frame-left")).size();
        System.out.println("Number of Frames on a Page:"+countIframesInPage);
        
		
      
        
        odriver.switchTo().frame(1);
        
        
        
       
		 WebElement textValue=odriver.findElement(By.xpath("(//body)[1]"));
		 textValue.getText();
		 Thread.sleep(3000);
		 
		 
		 odriver.switchTo().defaultContent();
		
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		
		odriver.quit();
		
	}
	

}
