import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity2 {
	WebDriver driver;
  @Test
  public void f() {
	WebElement d=  driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div[1]/img"));
	String m=d.getAttribute("src");
	System.out.println("The title is:"+m);
			}
  @BeforeMethod
  public void beforeMethod() {
	  driver=new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/orangehrm");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
