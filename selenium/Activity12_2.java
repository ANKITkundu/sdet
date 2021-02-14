package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/nested-iframes");
		String x=driver.getTitle();
		System.out.println("The element is displayed :"+x);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		WebElement f=driver.findElement(By.xpath("//*[@class='content']"));
		System.out.println("The heading is:"+f.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		WebElement f2=driver.findElement(By.xpath("//*[@class='content']"));
		System.out.println("The heading is:"+f2.getText());
		driver.close();
		
		

	}

}
