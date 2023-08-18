package Utility;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;






public class Base {
	
	
     AndroidDriver driver;

     public Properties prop;
		
     public AndroidDriver setUp() throws IOException {
    	 
    	 prop = new Properties();
 		String propath = System.getProperty("user.dir")+"\\src\\main\\java\\resource\\Aauti.properties";
 		FileInputStream fis = new FileInputStream(propath);
 		prop.load(fis);
 		
       DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
       desiredCapabilities.setCapability("appium:app", "C:\\Users\\vishal\\eclipse-workspace\\Aauti_Market\\Aauti_Market\\src\\main\\java\\resource\\Aautinew.apk");
       desiredCapabilities.setCapability("appium:deviceName", "VishalAauti");
       desiredCapabilities.setCapability("platformName", "android");
       desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
       desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
       desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
       desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
       desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
       desiredCapabilities.setCapability("Reset", true);
       
      // desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.aauti");
     //  desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.aauti.MainActivity");

       URL remoteUrl = new URL("http://127.0.0.1:4723");

       return driver = new AndroidDriver(remoteUrl, desiredCapabilities);
     }
	
	public void tearDown()
	{
	  driver.quit();
	}

}

