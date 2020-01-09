package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver","/Users/mastero/Downloads/chromedriver");
		

		WebDriver driver=new ChromeDriver();
		 
		//Login web application
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		 
		//Entering username in username field
		driver.findElement(By.name("userName")).sendKeys("test");
		
		//Entering password in password field
		driver.findElement(By.name("password")).sendKeys("test");
		
		//Clicking submit button
		driver.findElement(By.name("login")).click();
		
		//Interepting execution for 5 secs
		Thread.sleep(5000);
		
		// Close browser
		driver.close();
		
		
		
	}

}
