package SeleniumSessions.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationScript {

	public static void main(String[] args) throws InterruptedException {
		
		//1.To launch the browser
		WebDriverManager.firefoxdriver().setup();
		
		//ChromeDriver odriver=new ChromeDriver();
		 
		FirefoxDriver odriver=new FirefoxDriver();
		
		//2.Pass the url to open the app
		odriver.get("https://www.flipkart.com");
		
		//3.close the app
		
		Thread.sleep(3000);
		
		odriver.close();
		
		
		
		
		
		
		

	}

}
