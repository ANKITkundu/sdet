package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement p=driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement q= driver.findElement(By.xpath("//input[@id='lastName']"));
		p.sendKeys("Ankit");
		q.sendKeys("Kundu");
		WebElement z=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement a=driver.findElement(By.xpath("//input[@id='number']"));
		z.sendKeys("mmm.gmail.com");
		a.sendKeys("919876543210");
	    WebElement l=driver.findElement(By.xpath("//input[contains(@class, 'green')]"));
	    Actions actions = new Actions(driver);
	    actions.click(l);
	    Thread.sleep(2000);
		driver.close();

	}

}
