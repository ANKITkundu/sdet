package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/iframes");
		String x=driver.getTitle();
		System.out.println("The element is displayed :"+x);
		driver.switchTo().frame(0);
		WebElement f=driver.findElement(By.xpath("//*[@class='content']"));
		System.out.println("The value is:"+f.getText());
		WebElement n=driver.findElement(By.xpath("//button[contains(@class,'red')]"));
		String h=n.getText();
		System.out.println("The background color is:"+f.getCssValue("color"));
		System.out.println("The value is:"+h);
		n.click();
		WebElement n1=driver.findElement(By.xpath("//button[contains(@class,'blue')]"));
		String h1=n1.getText();
		System.out.println("The background color is:"+n1.getCssValue("color"));
		System.out.println("The value is:"+h1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement f1=driver.findElement(By.xpath("//*[@class='content']"));
		System.out.println("The value is:"+f1.getText());
		WebElement n2=driver.findElement(By.xpath("//button[contains(@class,'green')]"));
		String h2=n2.getText();
		System.out.println("The background color is:"+f1.getCssValue("color"));
		System.out.println("The value is:"+h2);
		n2.click();
		WebElement g1=driver.findElement(By.xpath("//button[contains(@class,'purple')]"));
		String g2=g1.getText();
		System.out.println("The background color is:"+g1.getCssValue("color"));
		System.out.println("The value is:"+g2);
		driver.switchTo().defaultContent();
		driver.close();
		
		
		}

}
