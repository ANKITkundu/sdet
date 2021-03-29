package examples;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity2_2 {
	AppiumDriver<MobileElement> driver= null;
  @Test
  public void divide() {
      driver.findElementById("com.android.calculator2:id/digit_5").click();
      driver.findElementById("com.android.calculator2:id/digit_0").click();
      driver.findElementById("com.android.calculator2:id/op_div").click();
      driver.findElementById("com.android.calculator2:id/digit_2").click();
	  driver.findElementById("com.android.calculator2:id/eq").click();
	  String result = driver.findElementById("com.android.calculator2:id/result").getText();
	  System.out.println(result);
	  Assert.assertEquals(result, "25");
	
  }
  
  @Test
  public void multiply() {
      driver.findElementById("com.android.calculator2:id/digit_5").click();
  	  driver.findElementById("com.android.calculator2:id/op_mul").click();
	  driver.findElementById("com.android.calculator2:id/digit_1").click();
	  driver.findElementById("com.android.calculator2:id/digit_0").click();
	  driver.findElementById("com.android.calculator2:id/digit_0").click();
	  driver.findElementById("eq").click();
	  String result = driver.findElementById("com.android.calculator2:id/result").getText();
	  System.out.println(result);
	  Assert.assertEquals(result, "500");
  }
  
  @Test
  public void add() {
  driver.findElementById("com.android.calculator2:id/digit_5").click();
  driver.findElementById("com.android.calculator2:id/op_add").click();
  driver.findElementById("com.android.calculator2:id/digit_9").click();
  driver.findElementById("com.android.calculator2:id/eq").click();
  String result = driver.findElementById("com.android.calculator2:id/result").getText();
  System.out.println(result);
  Assert.assertEquals(result, "14");
  
  }
  
  @Test
  public void subtract() {
      driver.findElementById("com.android.calculator2:id/digit_1").click();
  	  driver.findElementById("com.android.calculator2:id/digit_0").click();
      driver.findElementById("com.android.calculator2:id/op_sub").click();
	  driver.findElementById("com.android.calculator2:id/digit_5").click();
	  driver.findElementById("com.android.calculator2:id/eq").click();
      String result = driver.findElementById("com.android.calculator2:id/result").getText();
	  System.out.println(result);
      Assert.assertEquals(result, "5");
  }
  
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  DesiredCapabilities caps = new DesiredCapabilities();
  	  caps.setCapability("deviceName", "Pixel4emulator");
  	  caps.setCapability("deviceId","emulator-5554");
	  caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "com.android.calculator2");
      caps.setCapability("appActivity", ".Calculator");
      caps.setCapability("noReset", true);
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
  	  driver = new AndroidDriver<MobileElement>(appServer, caps);
	
  }


  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
