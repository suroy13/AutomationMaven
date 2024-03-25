package practice.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeA {
	
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
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='autosuggest']")).sendKeys("Ind");
		Thread.sleep(5000);
		List <WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for (WebElement option: options) {
			
			if (option.getText().equalsIgnoreCase("India")) {
				
				System.out.println(option.getText());
				Thread.sleep(2000);
				option.click();
				break;
			}
		}
	}

}
