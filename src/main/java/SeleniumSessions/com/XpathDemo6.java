package SeleniumSessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo6 {

	public static void main(String[] args) throws InterruptedException {
		//5.By using contains method
		
				//syntax
				//-->//tagName[contains(@attribure,'Value')]
				
		      //-->//tagName[contains(text()='value')]
				
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver odriver=new ChromeDriver();
				 
				odriver.get("https://app.hubspot.com/login");
				
				odriver.manage().window().maximize();
				
				
				Thread.sleep(3000);
				
				//1.first way 
				String emailtextValue1=odriver.findElement(By.xpath("//i18n-string[contains(text(),'Email')]")).getText();
				
				System.out.println(emailtextValue1);
				
				
				//2.Second way 
				WebElement emailText2=odriver.findElement(By.xpath("//i18n-string[contains(text(),'Email')]"));
				
				String emailtextValue2=emailText2.getText();
				
				System.out.println(emailtextValue2);
				
				
				WebElement emailTextinput=odriver.findElement(By.xpath("//input[contains(@id,'username')]"));
				
				emailTextinput.sendKeys("Nucot@gmail.com");
				
				
				
				WebElement passWordText=odriver.findElement(By.xpath("//i18n-string[contains(text(),'Password')]"));
				
				String passstextValue=passWordText.getText();
				
				System.out.println(passstextValue);
				
				
				WebElement passwordTextinput=odriver.findElement(By.xpath("//input[contains(@id,'password')]"));
				
				passwordTextinput.sendKeys("Nucot@1234");
				
				Thread.sleep(3000);
				
				odriver.quit();
				

	}

}
