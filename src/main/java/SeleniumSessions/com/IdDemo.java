package SeleniumSessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdDemo {

	public static void main(String[] args) throws InterruptedException {
		//1.To launch the browser
		WebDriverManager.firefoxdriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		 
		//FirefoxDriver odriver=new FirefoxDriver();
		
		//2.Pass the url to open the app
		odriver.get("https://app.hubspot.com/login");
		
		//locate the web webelement
		
		odriver.findElement(By.id("username")).sendKeys("Nucot@gmail.com");
		
		odriver.findElement(By.id("password")).sendKeys("Bangalore");
		
		
		
		
		
		
		
		//3.close the app
		
		Thread.sleep(5000);
		
		odriver.close();


	}

}
