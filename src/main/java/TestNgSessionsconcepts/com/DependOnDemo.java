package TestNgSessionsconcepts.com;

import org.testng.annotations.Test;

public class DependOnDemo {
	
	

	@Test
    public void login() { 
      System.out.println("Running login page test.");
    }
   
    @Test(dependsOnMethods={"login"}) 
    public void homepage() { 
      System.out.println("Running dependent homepage test.");
    } 

}
