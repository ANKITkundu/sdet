package vENDORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.training-support.net");
			Thread.sleep(1000);
			String x=driver.getTitle();
			WebElement y=driver.findElement(By.linkText("About Us"));
			WebElement z= driver.findElement(By.className("green"));
			WebElement p=driver.findElement(By.id("about-link"));
			WebElement q= driver.findElement(By.cssSelector(".green"));
			System.out.println("The element is:"+q.getText());
			System.out.println("The title is:"+p.getText());
			System.out.println("The page title is:"+z.getText());
			System.out.println("Pge title is:"+x);
			System.out.println("The partial link test is:"+y.getText());
			driver.close();


			// TODO Auto-generated method stub

		}

	}
	
