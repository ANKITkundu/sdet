package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String x=driver.getTitle();
		WebElement p=driver.findElement(By.xpath("//h3[@id ='third-header']"));
		System.out.println("The title of the element is:"+p);
		String s=driver.findElement(By.xpath("//h5[contains(@class,'green')]")).getCssValue("color");
		System.out.println("The Color of the element is:"+s);
		String z=driver.findElement(By.xpath("//button[contains(@class,'violet')]")).getAttribute("class");
		System.out.println("The Color of the element is:"+z);
		String l=driver.findElement(By.xpath("//html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("The title of the element is:"+x);
		System.out.println("The title of the Element is:"+l);
		driver.close();
		// TODO Auto-generated method stub

	}

}
