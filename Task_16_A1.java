package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task_16_A1 {
	
	
		public static void main(String[] args) {
			
			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().refresh();
			driver.close();
		
			}

	}



