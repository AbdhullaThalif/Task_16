package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_16_A3 {


		public static void main(String[] args) {
			
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.wikipedia.org/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Intelligence");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//li[@id='toc-History']//div[1]")).click();
			System.out.println(driver.getTitle());
}
}