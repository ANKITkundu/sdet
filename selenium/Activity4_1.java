package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Activity4_1 {
		  
	   
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String x=driver.getTitle();
		System.out.println("The title of the page is:"+x);
		WebElement p=driver.findElement(By.xpath("html/body/div/div/div/a"));
		p.click();
		String y=driver.getTitle();
		System.out.println("The title of the page is:"+y);
        //Assert.assertEquals(x,y);
		System.out.println("Comparing " + x + " and " + y
                + " : " + x.equals(y)); 
	    driver.close();
}
}
