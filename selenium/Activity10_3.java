package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		    WebDriver driver = new FirefoxDriver();
			driver.get("https://training-support.net/selenium/drag-drop");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			String x=driver.getTitle();
			System.out.println("The element is displayed :"+x);
			Actions action1 = new Actions(driver);
			Actions action2 = new Actions(driver);
			WebElement z= driver.findElement(By.xpath("//*[@id='draggable']"));
			WebElement z1=driver.findElement(By.xpath("//*[@id='droppable']"));
			WebElement z2= driver.findElement(By.xpath("//*[@id='dropzone2']"));
			action1.dragAndDrop(z, z1).build().perform(); 
	        wait.until(ExpectedConditions.attributeToBeNotEmpty(z1, "background-color"));
	    	System.out.println("ENTERED DROPZONE 1");
	    	action2.dragAndDrop(z1,z2).build().perform();
	        wait.until(ExpectedConditions.attributeToBeNotEmpty(z2, "background-color"));
	        System.out.println("ENTERED DROPZONE 2");
	        driver.close();
	}

}
