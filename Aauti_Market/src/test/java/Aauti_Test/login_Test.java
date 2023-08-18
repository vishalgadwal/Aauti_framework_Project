package Aauti_Test;


import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Utility.Base;
import io.appium.java_client.android.AndroidDriver;


public class login_Test extends Base {
	
	AndroidDriver driver;
	
	@BeforeMethod
	public void openApp() throws  IOException 
	{
		driver=setUp();
	
        
         
	
	}
	
	@Test
	   public void login() throws InterruptedException {
		Thread.sleep(4000);
		
         LoginPage lp =new LoginPage(driver);
       //  lp.clickonlocation().click();
       //  lp.clickonLearners();
 		//lp.clickoneducators();
 		//lp.getStarted();
 		//lp.clickonSignIn();
 		lp.clickonEmailId().sendKeys(prop.getProperty("emailId"));
 		lp.clickonPassword().sendKeys(prop.getProperty("password"));
 		lp.clickonSignInButton();
         
	}

}
