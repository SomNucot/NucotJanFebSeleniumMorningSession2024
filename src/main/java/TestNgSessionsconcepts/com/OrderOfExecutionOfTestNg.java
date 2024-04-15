package TestNgSessionsconcepts.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderOfExecutionOfTestNg {
	
	ChromeDriver odriver;
	
	@BeforeSuite
	void test1()
	{
		System.out.println("test1");
		
	}
	
	@BeforeTest
	void test2()
	{
		System.out.println("test2");
	}
	@BeforeClass
	void test3()
	{
		System.out.println("test3");
		
	}
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
		System.out.println("test6");
	}
	@AfterClass
	void test7()
	{
		System.out.println("test7");
	}
	@AfterTest
	void test8()
	{
		System.out.println("test8");
	}
	@AfterSuite
	void test9()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
