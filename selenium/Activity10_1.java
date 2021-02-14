package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		String x=driver.getTitle();
		System.out.println("The element is displayed :"+x);
		WebElement b= driver.findElement(By.xpath("//*[@id='D3Cube']"));
		Actions actions = new Actions(driver);
		actions.click(b);
		WebElement s3=driver.findElement(By.xpath("//*[@id='side4']"));
		System.out.println("The value on the side is:"+s3.getText());
		Actions heat = new Actions(driver);
		heat.doubleClick(b).perform();
		WebElement a4=driver.findElement(By.xpath("//*[@id='side5']"));
		System.out.println("The value on the random side is:"+a4.getText());
		Actions heat1 = new Actions(driver);
		heat1.contextClick(b).perform();
		WebElement d4=driver.findElement(By.xpath("//*[@id='side4']"));
		System.out.println("The value on the random side is:"+d4.getText());
		driver.close();
		
	}

}
