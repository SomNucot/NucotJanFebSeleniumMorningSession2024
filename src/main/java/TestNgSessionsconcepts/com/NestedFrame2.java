package TestNgSessionsconcepts.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrame2 {
	
	
	ChromeDriver odriver;
	
	 //precondition
	@BeforeMethod
	void lauanchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://demoqa.com/nestedframes");
	
		
	}
	

	@Test(priority=1)
	void titleOfThePage() throws InterruptedException
	{
		
		//Number of Frames on a Page
        int countIframesInPage =odriver. findElements(By. tagName("iframe")). size();
        System.out.println("Number of Frames on a Page:"+countIframesInPage);
        
        //Locate the frame1 on the webPage
        WebElement frame1=odriver.findElement(By.id("frame1"));
        
        //Switch to Frame1
        odriver.switchTo().frame(frame1);
        
         //Number of Frames on a Frame1
        int countIframesInFrame1 =odriver. findElements(By. tagName("iframe")). size();
        System.out.println("Number of Frames inside the Frame1:"+countIframesInFrame1);
        
        //Switch to child frame
        odriver.switchTo().frame(0);
        int countIframesInFrame2 =odriver. findElements(By. tagName("iframe")). size();
        System.out.println("Number of Frames inside the Frame2:"+countIframesInFrame2);
        
        //Locate the Element inside the Frame1
        WebElement frame1Element= odriver.findElement(By.tagName("body"));
       
        //Get the text for frame1 element
        String frame1Text=frame1Element.getText();
        
        //Try to Print the text present inside parent frame
        System.out.println("Frame1 is :"+frame1Text);
		
		
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		
		odriver.quit();
		
	}
	
	
	
	

}
