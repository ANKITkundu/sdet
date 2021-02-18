import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Activity5 {
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
      WebElement h2= driver.findElement(By.id("btnSave"));
      h2.click();
      WebElement s2=driver.findElement(By.id("personal_txtEmpFirstName"));
      s2.clear();
      s2.sendKeys("Ankit");
      WebElement s6=driver.findElement(By.id("personal_txtEmpMiddleName"));
      s6.clear();
      WebElement s3=driver.findElement(By.id("personal_txtEmpLastName"));
      s3.clear();
      s3.sendKeys("Kundu");
      WebElement s4=driver.findElement(By.id("personal_DOB"));
      s4.clear();
      s4.sendKeys("1989-05-29");
      WebElement s5= driver.findElement(By.id("personal_optGender_1"));
      s5.click();
      Select select = new Select(driver.findElement(By.id("personal_cmbNation")));
      select.selectByValue("82");
      h2.click();
      WebElement u1= driver.findElement(By.id("welcome"));
      u1.click();
      WebElement g2= driver.findElement(By.linkText("Logout"));
      g2.click();
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
