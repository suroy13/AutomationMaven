
package com.Amazon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import com.pageobject.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonEcom {
	static WebDriver driver;
	LandingPage lndpage = new LandingPage();

	/*
	 * @BeforeTest public void loaddriver() throws Exception {
	 * 
	 * 
	 * 
	 * 
	 * // WebDriver driver = new EdgeDriver();
	 * 
	 * String browser = "EDGE"; switch (browser.toUpperCase()) { case "CHROME": {
	 * driver = new ChromeDriver(); break; } case "EDGE": { driver = new
	 * EdgeDriver(); break; } case "FIREFOX": { driver = new FirefoxDriver(); break;
	 * } default: { System.out.
	 * println("OPPS, No Driver Selected, You need To select atleast one Broswer!");
	 * }
	 */
	@BeforeTest(groups = { "amazon" })

	public void StartBrowser() {
		String browser = "CHROME";
		switch (browser.toUpperCase()) {
		case "CHROME": {
			System.setProperty("Webdriver.chrome.driver",
					"C:\\Development\\Target2024\\Drivers\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		case "EDGE": {
			driver = new EdgeDriver();
			break;
		}
		case "FIREFOX": {
			driver = new FirefoxDriver();
			break;
		}
		default: {
			System.out.println("OPPS, No Driver Selected, You need To select atleast one Broswer!");
		}
		}
		System.out.println(browser + " Browser Launched for Test");
		driver.manage().window().maximize();
	}

	@Test(groups = { "amazon" })
	public void amazonPageland() throws InterruptedException {
		driver.get("https://www.amazon.in/gp/history?ref_=nav_cs_timeline");
		driver.findElement(LandingPage.landinglogo).click();
		System.out.println(driver.getTitle());
	

	Thread.sleep(5000);
		driver.findElement(LandingPage.allMenu).click();
		System.out.println("All Menu Dropdown Clicked!");

		List<WebElement> menumain = driver.findElements(LandingPage.allMenu);
		for (WebElement a : menumain) {
			String values = a.getText().trim();
			System.out.println(a);
		

		WebElement cata1 = driver.findElement(LandingPage.catNameShop);
		String cata1_print = cata1.getText().trim();
		System.out.println(cata1_print);
		//Assert.assertEquals(driver.findElement(LandingPage.catNameShop).getText(), "Shop by Category");
	}
	}
	@AfterTest(groups = { "amazon" })

	public void TearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
		System.out.println("Browser Closed, Test Concluded!");
	}

	public String browserInvoke(String B) {
		return B;

	}

}
