package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String x=driver.getTitle();
		System.out.println("The element is displayed :"+x);
		WebElement p=driver.findElement(By.xpath("//*[@id=\"dynamicText\"]"));
		boolean fg=p.isEnabled();
		System.out.println("The element is displayed :"+fg);
		WebElement q=driver.findElement(By.xpath("//*[@id=\"toggleInput\"]"));
		q.click();
		System.out.println("The element is displayed :"+p.isEnabled());
		driver.close();

	}

}
