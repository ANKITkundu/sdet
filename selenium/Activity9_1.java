package vENDORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/selects");
		WebElement f= driver.findElement(By.id("single-value"));
		Select select = new Select(driver.findElement(By.id("single-select")));
		select.selectByVisibleText("Option 2");
		String s=f.getText();
		System.out.println("The value at the string:"+s);
		select.selectByIndex(2);
		String z=f.getText();
		System.out.println("The value at the string:"+z);
		String l=f.getText();
		select.selectByValue("3");
		System.out.println("The value at the string:"+l);
		List <WebElement> elementCount = select.getOptions();
		System.out.println(elementCount.size());
		for (WebElement element:elementCount) {
			System.out.println("Element is:"+element.getText());
		}
		driver.close();
		

}
}
