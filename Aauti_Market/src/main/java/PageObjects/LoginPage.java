package PageObjects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class LoginPage {
	
	
	
	AndroidDriver driver;
	 
	public  LoginPage(AndroidDriver driver) {
		
		this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
		
		
	}
	
	
	
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	 WebElement location;;;;
	
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	 WebElement Learners;;;;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/"
			+"android.view.ViewGroup[2]/android.view.ViewGroup")
	 WebElement educators;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+"android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
	 WebElement getStarted;
	
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/"
			+"android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
	 WebElement signIn;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@resource-id='login-textInput1-textInput']")
	 WebElement emailID;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@resource-id='login-textInput2-textInput']")
	 WebElement password;
	
	@AndroidFindBy(xpath ="//android.view.ViewGroup[@resource-id='login-button2']")
	 WebElement signInButton;
	
	
	public WebElement clickonlocation() throws InterruptedException {
		 return location;
         
	}
	
	public void clickonLearners() throws InterruptedException
	{
		Thread.sleep(5000);
		 Learners.click();
	}
	
	public void clickoneducators() {
		 educators.click();
	}
	
	public void getStarted() {
		getStarted.click();
	}
	
	public void clickonSignIn() {
		signIn.click();
	}
	
	public WebElement clickonEmailId() {
		return emailID;
	}
	
	public WebElement clickonPassword() {
		return password;
	}
    
	
	public void clickonSignInButton() throws InterruptedException {
		//Thread.sleep(2000);
		 signInButton.click();
	}
	

}
