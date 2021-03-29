package examples;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Activity2 { 
	
	
  @Test
  public void f1()  {
	  
      DesiredCapabilities caps = new DesiredCapabilities();
  	  caps.setCapability("deviceName", "Pixel4emulator");
  	  caps.setCapability("deviceId","emulator-5554");
	  caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "com.android.calculator2");
      caps.setCapability("appActivity", ".Calculator");
      caps.setCapability("noReset", true);
      AppiumDriver<MobileElement> driver= null;
      
   try {
	   driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
       System.out.println("Calculator is open");

   }
   catch (MalformedURLException e) {
	   System.out.println(e.getMessage());
   }
  }

}
