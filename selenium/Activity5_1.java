package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String x=driver.getTitle();
		WebElement p=driver.findElement(By.xpath("//input[@class='willDisappear']"));
		boolean fg=p.isDisplayed();
		System.out.println("The element is displayed :"+fg);
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		WebElement q=driver.findElement(By.xpath("//input[@class='willDisappear']"));
		boolean fg2=q.isDisplayed();
		System.out.println("The element is displayed :"+fg2);
		driver.close();

	}

}
