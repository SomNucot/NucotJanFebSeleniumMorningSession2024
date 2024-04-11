package WaitsDemo.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	public static void main(String[] args) {
	
		
		
		
		WebDriverManager.firefoxdriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		 
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Top casting
				Wait<WebDriver> wait = new FluentWait<WebDriver>(odriver)
						//timeout of the wait
				       .withTimeout(Duration.ofSeconds(30L))
				       //polling time
				       .pollingEvery(Duration.ofSeconds(5L))
				       //exception to ignore
				       .ignoring(Exception.class);
				
				
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
			
	
		
		
		odriver.findElement(By.name("username")).sendKeys("Admin");
		
		
		odriver.close();
		
		
		
		
	}

}
