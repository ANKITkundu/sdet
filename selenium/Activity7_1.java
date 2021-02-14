package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait (driver,10);
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		driver.manage().window().maximize();
		String x=driver.getTitle();
		System.out.println("The element is displayed :"+x);
		WebElement p=driver.findElement(By.xpath("//input[starts-with(@class,'username')]"));
		p.sendKeys("admin");
		WebElement q=driver.findElement(By.xpath("//input[starts-with(@class,'password')]"));
		q.sendKeys("password");
        WebElement w=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        w.click();
        WebElement r=driver.findElement(By.xpath("//*[@id='action-confirmation']"));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='action-confirmation']"),"Welcome"));
        String lm=r.getText();
        System.out.println("The element displayed:"+lm);
		driver.close();
	}

	}


