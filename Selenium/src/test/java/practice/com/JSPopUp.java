package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JSPopUp {
	
	static WebDriver driver;
	@BeforeTest
	public void login() {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Development\\Target2024\\Drivers\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void dynamicdopdown() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
        driver.findElement(By.id("alertbtn")).click();
        driver.switchTo().alert().accept();
        System.out.println("Alert OK Clicks!");
        Thread.sleep(2000);
        driver.findElement(By.id("confirmbtn")).click();
        driver.switchTo().alert().dismiss();
        System.out.println("Alert Cancel Clicks!");
}
	
	@AfterTest
	public void Close() throws InterruptedException {
		driver.quit();
	}
	
}
