package vENDORS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		String x=driver.getTitle();
		System.out.println("The element is displayed :"+x);
		WebElement z= driver.findElement(By.xpath("//button[@id='simple']"));
		z.click();
		Alert sim =driver.switchTo().alert();
		String m=sim.getText();
		System.out.println("The value is:"+m);
		sim.accept();
		driver.close();
		}

}
