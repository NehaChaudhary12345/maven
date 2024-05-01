package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BuzzTest {
String driverPath="C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe";
	
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	void navigate() throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
    	driver.manage().window().maximize();
    	Thread.sleep(2000);
}
	@Test(priority=1)
	void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
	}
	@Test(priority=2)
    void buzz() throws InterruptedException {
    	driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]")).click();
        Thread.sleep(5000);
//    	dr.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz");
    	driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]")).sendKeys("Neha");
driver.findElement(By.xpath("//bustton[@type=\"submit\"]")).click();
    } 
}
