package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class loginTest {  
	String driverPath="C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe";
	
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate() throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
    	driver.manage().window().maximize();
    	Thread.sleep(2000);
	}
	
	@Test
	void login() throws InterruptedException   {
		
		
    	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	    	
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");	
	    driver.findElement(By.xpath("//button[@type='submit']")).click();	     
     
	    Thread.sleep(3000);
	
	
}
	@AfterTest
	void quit() {
		driver.quit();
	}
	
}