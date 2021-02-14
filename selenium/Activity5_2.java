package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String x=driver.getTitle();
		WebElement p=driver.findElement(By.xpath("//input[@class='willDisappear']"));
		boolean fg=p.isSelected();
		System.out.println("The element is displayed :"+fg);
		p.click();
		WebElement q=driver.findElement(By.xpath("//input[@class='willDisappear']"));
		boolean fg2=q.isSelected();
		System.out.println("The element is displayed :"+fg2);
		driver.close();

	}

}
