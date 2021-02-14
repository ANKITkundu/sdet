package vENDORS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		String x=driver.getTitle();
		System.out.println("The element is displayed :"+x);
		WebElement z= driver.findElement(By.xpath("//button[@id='prompt']"));
		z.click();
		Alert sim =driver.switchTo().alert();
		sim.sendKeys("Yes you are!");
		sim.accept();
		driver.close();

	}

}
