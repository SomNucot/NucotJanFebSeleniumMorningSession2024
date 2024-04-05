package SeleniumSessions.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameDemo {

	public static void main(String[] args) throws InterruptedException {
		//1.To launch the browser
				WebDriverManager.firefoxdriver().setup();
				
				
				
				
				WebDriver odriver=new ChromeDriver();
				 
				
				odriver.get("https://amazon.com");
				
				Thread.sleep(5000);
				
				
				
				
				List<WebElement> olist=odriver.findElements(By.tagName("a"));
				System.out.println(olist.size());
			/*	
				for(int i=1;i<olist.size();i++)
				{
					System.out.println(olist.get(i).getText());
					
				}
			*/
				
				
				for(WebElement olist1:olist)
				{
					System.out.println(olist1.getText());
					
				}
				
				
				//3.close the app
				
				Thread.sleep(5000);
				
				odriver.close();
				
				
				
				
				
				

	}

}
