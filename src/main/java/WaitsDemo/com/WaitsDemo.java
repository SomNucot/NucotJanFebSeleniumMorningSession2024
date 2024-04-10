package WaitsDemo.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {

	
	
	
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.firefoxdriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		 
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//implicit wait
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		
		odriver.findElement(By.name("username")).sendKeys("Admin");
		
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		odriver.findElement(By.name("password")).sendKeys("admin123");
		
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		odriver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		odriver.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
