package TestNgSessionsconcepts.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondOrderExecutionTestNg {

	ChromeDriver odriver;
	@BeforeMethod
	void test4()
	{
		WebDriverManager.firefoxdriver().setup();
		
		 odriver=new ChromeDriver();
		 
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	void atest()
	{
		System.out.println("test-A");
	}
	@Test
	void btest()
	{
		System.out.println("test-B");
	}
	@Test
	void ctest()
	{
		System.out.println("test-C");
	}
	@AfterMethod
	void test6()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
