package SeleniumSessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSDemo {

	//--><tagname>#<id value>
	//example-->input#username
		//-->#<id value>
	//example-->#username
		//--><tagname>[id=’<id value>’]
	//example-->input[id='username']
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		 
		odriver.get("https://app.hubspot.com/login");
		
		odriver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		//1.first way 
		String emailtextValue1=odriver.findElement(By.cssSelector("i18n-string[data-key='login.form.email']")).getText();
		
		System.out.println(emailtextValue1);
		
	}

}
