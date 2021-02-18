import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Activity8 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  	
	  WebElement j=driver.findElement(By.xpath("//input[@id='txtUsername']"));
	  j.sendKeys("orange");
	  WebElement s=driver.findElement(By.xpath("//input[@id='txtPassword']"));
      s.sendKeys("orangepassword123");
      WebElement u=driver.findElement(By.xpath("//input[@id='btnLogin']"));
      u.click();
      WebElement m1=driver.findElement(By.xpath("//a[@id='menu_dashboard_index']/b"));
      m1.click();
      WebElement m2=driver.findElement(By.xpath("//span[text()='Apply Leave']"));
      m2.click();
      Thread.sleep(5000);
      WebElement m11=driver.findElement(By.id("applyleave_txtLeaveType"));
      Select leaveType =new Select(m11);
      leaveType.selectByValue("1");
      WebElement m3=driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']"));
      m3.clear();
      m3.sendKeys("2021-02-17");
      WebElement m4=driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']"));
      m3.clear();
      m4.sendKeys("2021-02-18");
      WebElement m5=driver.findElement(By.xpath("//textarea[@id='applyleave_txtComment']"));
      m5.sendKeys("Personal reasons");
      WebElement m6=driver.findElement(By.xpath("//input[@id='applyBtn']"));
      m6.click();
      WebElement m7=driver.findElement(By.cssSelector("#menu_leave_viewMyLeaveList"));
      m7.click();
      WebElement m8=driver.findElement(By.xpath("//input[@id='calFromDate']"));
      m8.sendKeys("2021-02-17");
      WebElement m9=driver.findElement(By.xpath("//input[@id='calToDate']"));
      m9.sendKeys("2021-02-18");
      WebElement m10=driver.findElement(By.xpath("//input[@id='btnSearch']"));
      m10.click();
      
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