package TestNgSessionsconcepts.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AsserationDemo2 {
	
WebDriver odriver;
	
	
	@BeforeMethod
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
		
	}
	
	/*
	 * 	Assert.assertEqual(String actual, String expected): Pass the actual string value and the expected string value as parameters.
	 *  Validates if the actual and expected values are the same or not.
		Assert.assertEqual(String actual, String expected, String message):
		 Similar to the previous method just that when the assertion fails, the message displays along with the exception thrown.
		Assert.assertEquals(boolean actual, boolean expected): 
		Takes two boolean values as input and validates if they are equal or not.
		Assert.assertTrue(condition):
		 This method asserts if the condition is true or not.
		  If not, then the exception error is thrown.
		Assert.assertTrue(condition, message): 
		 Similar to the previous method with an addition of message,
		 which is shown on the console when the assertion
		  fails along with the exception.
		Assert.assertFalse(condition):
		 This method asserts if the condition is false or not. If not, then it throws an exception error.
		Assert.assertFalse(condition, message): Similar to the previous method but with an addition of a message string which is shown on the console when the assertion fails, i.e., the condition is true*.
	 */
	/*
	Below we would be discussing most of the commonly used assertions in testng framework:

		Assert.assertEqual(String actual, String expected): This assertion method accepts two parameters i.e. the actual value and expected value to validate if the actual string is equal to the expected string or not. The assertion exception is thrown if both the strings are not equal.
		Assert.assertEqual(String actual, String expected, String message): This assertion method is similar to the assertion method discussed above, the only difference is that this method can accept one more string parameter as a message. In case the assertion condition is not met, the assertion error is thrown along with a message passed here.
		Assert.assertEquals(boolean actual, boolean expected): This assertion method accepts two boolean values and validates if both are equal or not.
		Assert.assertTrue(condition): This assertion method is used to assert whether the condition passed in a parameter returns true or not. If the condition returns false, the assertion error is thrown. 
		Assert.assertTrue(condition, message): This assertion method is similar to the assertion method discussed in previous one, the only difference is that this method can accept one more string parameter as a message. In case the assertion condition is passed as false, the assertion error is thrown along with a message passed here.
		Assert.assertFalse(condition): This assertion method is used to assert whether the condition passed in a parameter returns false or not. If the condition returns true, the assertion error is thrown. 
		Assert.assertFalse(condition, message): This assertion method is similar to the assertion method discussed in the previous one, the only difference is that this method can accept one more string parameter as a message. In case the assertion condition is passed as true, the assertion error is thrown along with a message passed here.
		Assert.assertNull(condition): This assertion method is used to assert whether the condition passed in a parameter returns null or not. If the condition doesn’t return null, the assertion error is thrown. 
		Assert.assertNotNull(condition): This assertion method is used to assert whether the condition passed in a parameter returns value except null or not. If the condition returns null, the assertion error is thrown. 
	*/
	@Test
	void getTitleOfThePage()
	{
		
		String actualTitle=odriver.getTitle();
		String expectedTitle="OrangeHRM";
		Assert.assertEquals(actualTitle,expectedTitle,"Actual value is not equal to expexted value");
		System.out.println("Testing");
	}
	
	@Test
	void getCurrentUrlOfThePage()
	{
		
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
