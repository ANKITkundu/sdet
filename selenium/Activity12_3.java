package vENDORS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.training-support.net/selenium/popups");
		String x=driver.getTitle();
		System.out.println("The element is displayed :"+x);
		Actions builder = new Actions(driver);
		WebElement f1=driver.findElement(By.xpath("//button[contains(@class,'orange')]"));
		builder.moveToElement(f1).pause(Duration.ofSeconds(1)).build().perform();
        String tooltipText = f1.getAttribute("data-tooltip");
    	System.out.println("Tooltip text: " + tooltipText);
    	f1.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);
	    driver.close();
	
    }
		
		

	}


