package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait (driver,10);
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		driver.manage().window().maximize();
		String x=driver.getTitle();
		System.out.println("The element is displayed :"+x);
		WebElement p=driver.findElement(By.xpath("//*[@id=\"dynamicText\"]"));
		WebElement q=driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]"));
		q.click();
		wait.until(ExpectedConditions.invisibilityOf(p));
		q.click();
		wait.until(ExpectedConditions.visibilityOf(p));
		p.click();
		driver.close();

	}

}
