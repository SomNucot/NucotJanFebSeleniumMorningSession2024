package SeleniumSessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	//Locators in Selenium--* types of locators
	
	//1.By.id
	//2.By.Name
	//3.By.className
	//4.By.tagName
	//5.By.partialLinkText
	//6.By.LinkText
	//7.CSS selector
	//8.Xpath-->a.Abs  xpath
			   //b. relative xpath
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//1.To launch the browser
				WebDriverManager.firefoxdriver().setup();
				
				ChromeDriver odriver=new ChromeDriver();
				 
				//FirefoxDriver odriver=new FirefoxDriver();
				
				//2.Pass the url to open the app
				odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
				
				//locate the web webelement
				
				odriver.findElement(By.id("RESULT_TextField-1")).sendKeys("Nucot");
				
				odriver.findElement(By.id("RESULT_TextField-2")).sendKeys("Bangalore");
				
				odriver.findElement(By.id("RESULT_TextField-3")).sendKeys("9986453663");
				
				odriver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
				
				odriver.findElement(By.id("RESULT_TextField-5")).sendKeys("Banaglore");
				
				odriver.findElement(By.id("RESULT_TextField-6")).sendKeys("somaautomation@gmail.com");
				
				
				
				
				
				
				
				//3.close the app
				
				Thread.sleep(5000);
				
				odriver.close();
		
		
		
		
		
		
		
		
		

	}

}
