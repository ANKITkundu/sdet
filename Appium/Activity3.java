package examples;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
    AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
  @Test
  public void f() {
      driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout").click();
  	  MobileElement firstName = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]");
	  MobileElement lastName = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[2]");
      MobileElement phoneNumber = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
	  firstName.sendKeys("XYZ");
      lastName.sendKeys("Varma");
	  phoneNumber.sendKeys("9991284783");
	  driver.findElementById("com.android.contacts:id/editor_menu_save_button").click();
	  wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("toolbar_parent")));
	  MobileElement mobileCard = driver.findElementById("toolbar_parent");
	  Assert.assertTrue(mobileCard.isDisplayed());
      String contactName = driver.findElementById("large_title").getText();
      Assert.assertEquals(contactName, "XYZ Varma");
      }
	


  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  DesiredCapabilities caps = new DesiredCapabilities();
  	  caps.setCapability("deviceName", "Pixel4emulator");
  	  caps.setCapability("deviceId","emulator-5554");
	  caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "com.android.contacts");
      caps.setCapability("appActivity", "activities.PeopleActivity");
      caps.setCapability("noReset", true);
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
  	  driver = new AndroidDriver<MobileElement>(appServer, caps);
  }

  @AfterClass
  public void afterClass() {
  }

}
