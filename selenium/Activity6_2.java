package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait (driver,10);
		driver.get("https://training-support.net/selenium/ajax");
		driver.manage().window().maximize();
		String x=driver.getTitle();
		System.out.println("The element is displayed :"+x);
		WebElement p=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/button"));
		p.click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
        String s=driver.findElement(By.id("ajax-content")).getText();
        System.out.println("The title is:"+s);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        String z=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/h3")).getText();
    	System.out.println("The title is:"+z);
		driver.close();
	}

}
