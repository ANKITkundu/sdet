package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity3 {
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://training-support.net/selenium/simple-form");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			WebElement p=driver.findElement(By.id("firstName"));
			WebElement q= driver.findElement(By.id("lastName"));
			p.sendKeys("Ankit");
			q.sendKeys("Kundu");
			WebElement z=driver.findElement(By.id("email"));
			WebElement a=driver.findElement(By.id("number"));
			z.sendKeys("mmm.gmail.com");
			a.sendKeys("919876543210");
		    WebElement l=driver.findElement(By.cssSelector(".ui.green.button"));
		    Actions actions = new Actions(driver);
		    actions.click(l);
		    Thread.sleep(2000);
			driver.close();
		}

	}
