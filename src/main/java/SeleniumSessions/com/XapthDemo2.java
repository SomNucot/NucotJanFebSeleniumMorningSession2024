package SeleniumSessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XapthDemo2 {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.firefoxdriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		 
		odriver.get("https://app.hubspot.com/login");
		
		odriver.manage().window().maximize();
		
		odriver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		
		odriver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
		
		odriver.findElement(By.xpath("//i18n-string[@data-key='login.form.button']")).click();
		
		odriver.close();

		
		
		
		
		
		

	}

}
