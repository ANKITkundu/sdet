package examples;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity2_1 {
    WebDriverWait wait;
	AppiumDriver<MobileElement> driver = null;
  @Test
  public void f() {
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	  driver.get("https://www.training-support.net/");
	  String pageTitle = driver.findElementByXPath("//android.view.View[@content-desc=\"Training Support\"]").getText();
	  System.out.println("Title on Homepage: " + pageTitle);
	  MobileElement aboutButton = driver.findElementByAccessibilityId("About Us");
	  aboutButton.click();
	  String newPageTitle=driver.findElementByXPath("//android.view.View[@content-desc=\"About Us\"]").getAttribute("content-desc");
	  System.out.println("Title on new page: " + newPageTitle);
	  Assert.assertEquals(pageTitle, "Training Support");
	  Assert.assertEquals(newPageTitle, "About Us");
  }
  @BeforeClass
  public void beforeClass()throws MalformedURLException {
	    	DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("deviceName", "Pixel4emulator");
		    caps.setCapability("platformName", "Android");
		    caps.setCapability("appPackage", "com.android.chrome");
		    caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	        caps.setCapability("noReset", true);
		    driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		    wait = new WebDriverWait(driver, 10);
		
	    }
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
