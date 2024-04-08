package SeleniumSessions.com;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		 
		odriver.get("https://app.hubspot.com/login");
		
		odriver.manage().window().maximize();
		
		Thread.sleep(3000);
		odriver.navigate().back();
		odriver.get("https://google.com");
		odriver.navigate().back();
	
		Thread.sleep(3000);
		odriver.navigate().forward();
		odriver.navigate().to("https://app.hubspot.com/login");
		odriver.navigate().refresh();
		
		
		
		
		//Nvaigation methods
		
		//1.to()
		//2.back()
		//3.forward()
		//4.refresh()
		
		
		
		

	}

}
