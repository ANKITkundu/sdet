package vENDORS;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.training-support.net/selenium/tab-opener");
		String x=driver.getTitle();
		System.out.println("The element is displayed :"+x);
		String s=driver.getWindowHandle();
		System.out.println("The handle is:"+s);
		WebElement z= driver.findElement(By.xpath("//a[@id='launcher']"));
		z.click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String>x2=driver.getWindowHandles();
		for (String Handle:x2) {
			driver.switchTo().window(Handle);
			
		}
		System.out.println("Current window handle: " + driver.getWindowHandle());
		wait.until(ExpectedConditions.titleIs("Newtab"));
		System.out.println("New Tab Title is: " + driver.getTitle());
		String newTabText = driver.findElement(By.xpath("//*[@class='content']")).getText();
    	System.out.println("New tab heading is: " + newTabText);
    	WebElement z3= driver.findElement(By.xpath("//a[@id='actionButton']"));
        z3.click();
    	
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
	
        Set <String>allWindowHandles = driver.getWindowHandles();
        for (String Handle1:allWindowHandles) {
			driver.switchTo().window(Handle1);
			
		}
	
        System.out.println("All window handles: " + allWindowHandles);
        System.out.println("New tab handle: " + driver.getWindowHandle());
	    wait.until(ExpectedConditions.titleIs("Newtab2"));
	    System.out.println("New Tab Title is: " + driver.getTitle());
        newTabText = driver.findElement(By.cssSelector("div.content")).getText();
	    System.out.println("New tab heading is: " + newTabText);
	    driver.quit();
		
		
	}

}
