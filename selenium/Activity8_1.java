package vENDORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		driver.manage().window().maximize();
		List<WebElement> cols = driver.findElements(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/thead/tr[1]/th"));
		System.out.println("Size of the Column is :"+cols.size());
		List<WebElement> rows=driver.findElements(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/tbody/tr"));
		System.out.println("Size of the Row is:"+rows.size());
		String t=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/tbody/tr[3]")).getText();
		System.out.println("the element in T is:"+t);
		String g=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/tbody/tr[2]/td[2]")).getText();
		String x=driver.getTitle();
		System.out.println("the element in G is:"+g);
		driver.close();

	}

}
