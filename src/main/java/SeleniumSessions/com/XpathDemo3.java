package SeleniumSessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo3 {

	public static void main(String[] args) throws InterruptedException {
		//-->//tagName[@attribute='value']
		
		
		
				//index postion
				//-->(//tagName[@attribute='value'])[index]
				//-->example-->
			
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		 
		odriver.get("https://flipkart.com");
		
		odriver.manage().window().maximize();
		
		odriver.findElement(By.xpath("//input[@name='q']")).sendKeys("watches");
		Thread.sleep(3000);
		
		/*
		WebElement element = odriver.findElement(By.xpath("//div[text()='watch for boys']"));
		JavascriptExecutor executor = (JavascriptExecutor)odriver;
		executor.executeScript("arguments[0].click();", element);
*/
		odriver.findElement(By.xpath("//div[text()='watch for boys']")).click();
		
		
		
		odriver.close();

		
		
				


	}

}
