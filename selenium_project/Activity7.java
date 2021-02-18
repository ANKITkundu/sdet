import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity7 {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement j=driver.findElement(By.xpath("//input[@id='txtUsername']"));
	  j.sendKeys("orange");
	  WebElement s=driver.findElement(By.xpath("//input[@id='txtPassword']"));
      s.sendKeys("orangepassword123");
      WebElement u=driver.findElement(By.xpath("//input[@id='btnLogin']"));
      u.click();
      WebElement m1=driver.findElement(By.cssSelector("#menu_pim_viewMyDetails > b:nth-child(1)"));
      m1.click();
      WebElement m2=driver.findElement(By.linkText("Qualifications"));
      m2.click();
      WebElement m3=driver.findElement(By.xpath("//input[@id='addWorkExperience']"));
      m3.click();
      WebElement m4=driver.findElement(By.xpath("//input[@id='experience_employer']"));
      m4.sendKeys("IBM");
      WebElement m5=driver.findElement(By.xpath("//input[@id='experience_jobtitle']"));
      m5.sendKeys("Associate System Engineer");
      WebElement m6=driver.findElement(By.xpath("//input[@id='experience_from_date']"));
      m6.clear();
      m6.sendKeys("2013-08-05");
      WebElement m7=driver.findElement(By.xpath("//input[@id='experience_to_date']"));
      m6.clear();
      m6.sendKeys("2021-02-17");
      WebElement m8=driver.findElement(By.xpath("//textarea[@id='experience_comments']"));
      m8.sendKeys("Selenium is good");
      WebElement m9=driver.findElement(By.xpath("//input[@id='btnWorkExpSave']"));
      m9.click();
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
