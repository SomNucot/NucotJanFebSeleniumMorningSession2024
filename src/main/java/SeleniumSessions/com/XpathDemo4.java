package SeleniumSessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo4 {

	public static void main(String[] args) {
		
		
		//-->//tagName[@attribute='value']
		
		
		
		//index postion
		//-->(//tagName[@attribute='value'])[index]
		//-->example-->
		
		

		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		 
		odriver.get("https://flipkart.com");
		
		odriver.manage().window().maximize();
		

		odriver.findElement(By.xpath("(//a[@class='_1krdK5 _3jeYYh'])[1]")).click();
		
		
		
		odriver.close();

		
		
		
		
		
		
		
		
		
	}

}
