package Aauti_Test;

import org.openqa.selenium.JavascriptExecutor;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class AndroidActions extends Base {
	
	public AndroidDriver driver;
	
	public void scrollDown(AndroidDriver driver,String element) {
	 
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"element\"));"));
	}
	
	
	@SuppressWarnings("deprecation")
	public void scrollMore(AndroidDriver driver,WebElement element) throws InterruptedException
	{
		

		// Identify the element on the page which you want to scroll down to
		

		// Create an instance of the TouchAction class
		TouchAction touchAction = new TouchAction(driver);

		// Get the size of the screen
		Dimension size = driver.manage().window().getSize();

		// Set the starting point of the scroll
		int startY = (int) (size.height * 0.8);
		int startX = size.width / 2;

		// Set the ending point of the scroll
		int endY = (int) (size.height * 0.2);

		// Perform the scroll down action
		touchAction.press(PointOption.point(startX, startY))
		        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		        .moveTo(PointOption.point(startX, endY))
		        .release()
		        .perform();

		// Wait for the page to load
		Thread.sleep(2000);

		// Scroll down to the element
		element.click();

	}
	
	
	}


