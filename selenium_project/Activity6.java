import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity6 {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement j=driver.findElement(By.xpath("//input[@id='txtUsername']"));
	  j.sendKeys("orange");
	  WebElement s=driver.findElement(By.xpath("//input[@id='txtPassword']"));
      s.sendKeys("orangepassword123");
      WebElement u=driver.findElement(By.xpath("//input[@id='btnLogin']"));
      u.click();
      WebElement m1=driver.findElement(By.cssSelector("#menu_directory_viewDirectory > b:nth-child(1)"));
      if (m1.isDisplayed()){
      System.out.println("Element is visible");}
      
      else {
    	  System.out.println("Element is not visible");
      }
      m1.click();
      WebElement g2=driver.findElement(By.xpath("//html/body/div[1]/div[3]/div[1]/div[1]/h1"));
      String h3=g2.getText();
      System.out.println("The title is:"+h3);
      Assert.assertEquals(h3,"Search Directory");
      WebElement u1= driver.findElement(By.id("welcome"));
      u1.click();
      WebElement g3= driver.findElement(By.linkText("Logout"));
      g3.click();
}
      
  @BeforeMethod
  public void beforeMethod() {
	  driver= new FirefoxDriver();
	  driver.get("http://alchemy.hguy.co/orangehrm");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
