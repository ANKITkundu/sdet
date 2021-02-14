package vENDORS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/selects");
		//WebElement f= driver.findElement(By.id("single-value"));
		Select select = new Select(driver.findElement(By.id("multi-select")));
        select.selectByVisibleText("Javascript");
        select.selectByValue("node");
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);
        select.selectByIndex(6);
        List <WebElement> elementCount = select.getOptions();
        for (WebElement element:elementCount) {
			System.out.println("Element is:"+element.getText());

}
        select.deselectAll();
        driver.close();
        
	}
	
	}

