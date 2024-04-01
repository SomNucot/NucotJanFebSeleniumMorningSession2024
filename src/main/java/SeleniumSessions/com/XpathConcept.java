package SeleniumSessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//Two type sof xpath
		//1.Absolute Xpath--->/-->We have start from root
		//--?/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input
		//2.Relative Xpath--->//-->any where
		//--->//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input
		
		//syntax
		
		//-->//tagName[@attributeName='value']
		//-->example-->//input[@name='username']
		
		WebDriverManager.firefoxdriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		 
		//FirefoxDriver odriver=new FirefoxDriver();
		
		//2.Pass the url to open the app
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Maximize browser
		
		odriver.manage().window().maximize();
		
		
		
		
		//locate the web webelement
		Thread.sleep(5000);
		odriver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		odriver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		//odriver.findElement(By.linkText("Forgot my password")).click();
		
		
		odriver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//3.close the app
		
		Thread.sleep(5000);
		
		odriver.close();

		
		
		
		
		

	}

}
