package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		    WebDriver driver = new FirefoxDriver();
			driver.get("https://www.training-support.net/selenium/input-events");
			String x=driver.getTitle();
			System.out.println("The element is displayed :"+x);
			Actions action1 = new Actions(driver);
			action1.sendKeys("S").build().perform();
			WebElement z= driver.findElement(By.xpath("//*[@id='keyPressed']"));
			String z1=z.getText();
			System.out.println("The string is :"+z1);
			Actions action2 = new Actions(driver);
			action2.keyDown(Keys.CONTROL);
			action2.sendKeys("a");
			action2.sendKeys("c");
			action2.keyUp(Keys.CONTROL);
			action2.build().perform();
	        String z2 = z.getText();
	    	System.out.println("Pressed key is: " + z2);
	    	driver.close();
			}

}
