import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity4 {
	WebDriver driver;
	
	  @Test
	  public void f() {
		  WebElement j=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		  j.sendKeys("orange");
		  WebElement s=driver.findElement(By.xpath("//input[@id='txtPassword']"));
	      s.sendKeys("orangepassword123");
	      WebElement u=driver.findElement(By.xpath("//input[@id='btnLogin']"));
	      u.click();
	      String h = driver.getTitle();
	      System.out.println("The title is:"+h);
	      Assert.assertEquals("OrangeHRM",h);
	      WebElement m1=driver.findElement(By.cssSelector("#menu_pim_viewPimModule > b:nth-child(1)"));
	      m1.click();
	      WebElement g1=driver.findElement(By.id("btnAdd"));
	      g1.click();
	      WebElement f1=driver.findElement(By.id("firstName"));
	      f1.sendKeys("Ankit");
	      WebElement f2=driver.findElement(By.id("lastName"));
	      f2.sendKeys("Kundu");
	      WebElement h2= driver.findElement(By.id("btnSave"));
	      h2.click();
	      WebElement r2=driver.findElement(By.id("menu_pim_viewEmployeeList"));
	      r2.click();
	      WebElement j2=driver.findElement(By.id("empsearch_employee_name_empName"));
	      j2.sendKeys("Ankit Kundu");
	      WebElement x2=driver.findElement(By.id("searchBtn"));
	      x2.click();
	      WebElement l2= driver.findElement(By.id("ohrmList_chkSelectRecord_2316"));
	      if(l2.isEnabled()) {
	    	  System.out.println("Employee Added is:"+l2.isEnabled());
	    	  }
	      else {
	    		  System.out.println("Employee not Added:"+l2.isEnabled());
	      }
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
