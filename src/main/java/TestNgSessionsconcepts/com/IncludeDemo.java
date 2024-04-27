package TestNgSessionsconcepts.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncludeDemo {
	
WebDriver odriver;
	
	
	@BeforeSuite
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
	
		
		
	}
	
	//skip
	@Test(enabled=false)
	void getTitleOfThePage()
	{
		
		String title=odriver.getTitle();
		System.out.println(title);
		
		
	}
	
	@Test
	void getCurrentUrlOfThePage()
	{
		String url=odriver.getCurrentUrl();
		System.out.println(url);
		
	}
	
	
	@AfterSuite
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	

}
