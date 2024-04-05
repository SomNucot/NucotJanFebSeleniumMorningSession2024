package SeleniumSessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XapthDemo5 {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//4.By using text() method
		
		//syntax
		//-->//tagName[text()='value']
		
		//->example-->//i18n-string[text()='Email address']
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		 
		odriver.get("https://app.hubspot.com/login");
		
		odriver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		//1.first way 
		String emailtextValue1=odriver.findElement(By.xpath("//i18n-string[text()='Email address']")).getText();
		
		System.out.println(emailtextValue1);
		
		
		//2.Second way 
		WebElement emailText2=odriver.findElement(By.xpath("//i18n-string[text()='Email address']"));
		
		String emailtextValue2=emailText2.getText();
		
		System.out.println(emailtextValue2);
		
		
		WebElement emailTextinput=odriver.findElement(By.xpath("//input[@id='username']"));
		
		emailTextinput.sendKeys("Nucot@gmail.com");
		
		
		
		WebElement passWordText=odriver.findElement(By.xpath("//i18n-string[text()='Password']"));
		
		String passstextValue=passWordText.getText();
		
		System.out.println(passstextValue);
		
		
		WebElement passwordTextinput=odriver.findElement(By.xpath("//input[@id='password']"));
		
		passwordTextinput.sendKeys("Nucot@1234");
		
	
		
		odriver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
