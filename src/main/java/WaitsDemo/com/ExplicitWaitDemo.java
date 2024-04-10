package WaitsDemo.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		
		
		
		//Syntax for Explicit wait
		
			/*	WebDriverWait wait=new WebDriverWait(odriver, Duration.ofSeconds(3));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
				
		*/
		
		
		WebDriverManager.firefoxdriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		 
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		WebDriverWait wait =new WebDriverWait(odriver,Duration.ofSeconds(3));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		
		odriver.findElement(By.name("username")).sendKeys("Admin");
		
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		odriver.findElement(By.name("password")).sendKeys("admin123");
		
		
		
		odriver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
