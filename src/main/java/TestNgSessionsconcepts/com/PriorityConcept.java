package TestNgSessionsconcepts.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
	When all the methods are without priority
	When all the methods are with priority
	When all the methods are with the same priority
	When there are both methods with and without priority
*/

public class PriorityConcept {
	
	
	 ChromeDriver odriver;
	
	 //precondition
	@BeforeMethod
	void lauanchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
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
	void doLogin()
	{
		
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement userName=odriver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
		WebElement passWord=odriver.findElement(By.xpath("//input[@name='password']"));
		passWord.sendKeys("admin123");
		WebElement loginBtn=odriver.findElement(By.xpath("//button[@type='submit']"));
		loginBtn.click();
			
		
	}
	
	
	
	@AfterMethod
	void closeAPP()
	{
		
		odriver.quit();
		
	}
	
	
	
	
	
	
	
	
	

}
