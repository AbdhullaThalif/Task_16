package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_16_A2 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String x = driver.getTitle();
		System.out.println(x);
		if(x.equalsIgnoreCase("Store")) {
			System.out.println("Page landed on correct website");
		} 
		else
		{
			System.out.println("Page not landed on correct website");
		}
}
}