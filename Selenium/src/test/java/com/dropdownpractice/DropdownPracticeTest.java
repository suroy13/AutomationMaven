package com.dropdownpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobject.Spicejet;

public class DropdownPracticeTest {

	protected static WebDriver driver;
	// public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	String appURL = "https://spicejet.com";
	String noofPAX;
	String currencySelect;
	String originAirportSelect;
	String validateFlightDetails;

	@BeforeTest(groups = { "smoke" })

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

	@BeforeMethod

	public void testPrerequisites() throws InterruptedException {
		System.out.println(" Lets runs Before Each Test case");
		Thread.sleep(2000);
	}

	@Test(groups = { "smoke" }, priority = 0)

	public void spiceJetLaunchApp() throws InterruptedException {
		// Adding Implicit wait time of 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String aplogValidate = driver.findElement(Spicejet.labelWelcome).getText();
		System.out.println(aplogValidate);
		Assert.assertEquals(aplogValidate, "Welcome aboard");
		Thread.sleep(2000);
		driver.findElement(Spicejet.rdOneWay).click();

	}

	@Test(groups = { "smoke" }, priority = 1)

	public void spiceJetSelectDestination() throws InterruptedException {
		// Setting destinations

		System.out.println("Airport Selection Begins");
		Thread.sleep(2000);
		driver.findElement(Spicejet.drpdnFromDestination).click();
		originAirportSelect = "CCU";
		Thread.sleep(2000);
		switch (originAirportSelect) {

		case "CCU": {

			driver.findElement(By.xpath("//div[text()='Kolkata']")).click();
			System.out.println("Airport Selected:" + originAirportSelect);
			break;
		}
		case "AGR": {

			driver.findElement(By.xpath("//div[text()='Agra']")).click();
			System.out.println("Airport Selected:" + originAirportSelect);
			break;
		}
		case "DEL": {

			driver.findElement(By.xpath("//div[text()='Delhi']")).click();
			System.out.println("Airport Selected:" + originAirportSelect);
			break;
		}
		default: {

			System.out.println("Please select Origin Airport!");
		}
		}

		System.out.println("origin Airport Selected");
		Thread.sleep(2000); //
		// driver.findElement(Spicejet.drpdnToDestination).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='DEL']/parent::div[1]")).click();
		System.out.println("Desination Airport Selected");
		System.out.println("Airport Selection Completed");
		Thread.sleep(2000);
		driver.findElement(Spicejet.currentDate).click();
		System.out.println("The start date has been clicked");
		Thread.sleep(2000);

	}

	@Test(groups = { "smoke" }, priority = 2)

	public void spiceJetNoOfPax() throws InterruptedException {

		driver.findElement(Spicejet.drpdnPassenger).click();
		int i = 1;
		int j = 5;
		while (i < j) {
			driver.findElement(Spicejet.incrementPassenger).click();
			i++;
		}
		System.out.println("Passengers Incremented");
		Thread.sleep(5000);
		noofPAX = driver.findElement(Spicejet.drpdnNoOfPAX).getText();
		System.out.println("Passengers Incremented To:" + noofPAX);
		int x = 5;
		int y = 1;
		while (x > y) {
			driver.findElement(Spicejet.decrementPassenger).click();
			x--;
		}
		System.out.println("Passengers Decremented");
		Thread.sleep(5000);
		noofPAX = driver.findElement(Spicejet.drpdnNoOfPAX).getText();
		System.out.println("Passengers Decremented To:" + noofPAX);
		for (i = 1; i < j; i++) {
			driver.findElement(Spicejet.incrementPassenger).click();

		}
		System.out.println("Passengers RE- Incremented");
		noofPAX = driver.findElement(Spicejet.drpdnNoOfPAX).getText();
		System.out.println("Passengers REIncremented To:" + noofPAX);

		System.out.println("About to select currency!");
		Thread.sleep(4000);
		driver.findElement(Spicejet.drpdnCurrency).click();

		currencySelect = "AED";
		Thread.sleep(2000);
		switch (currencySelect) {

		case "INR": {

			driver.findElement(By.xpath(" //div[contains(text(),'INR')]")).click();
			System.out.println("Currency Selected:" + currencySelect);
			break;
		}
		case "USD": {

			driver.findElement(By.xpath(" //div[contains(text(),'USD')]")).click();
			System.out.println("Currency Selected:" + currencySelect);
			break;
		}
		case "AED": {

			driver.findElement(By.xpath(" //div[contains(text(),'AED')]")).click();
			System.out.println("Currency Selected:" + currencySelect);
			break;
		}
		default: {

			System.out.println("Please select Currency!");
		}
		}

		// Select Checkbox
		Thread.sleep(2000);
		// driver.findElement(Spicejet.radioFamilynFrnds).click();
		Thread.sleep(2000);
		driver.findElement(Spicejet.buttonSearchFlight).click();
		/*
		 * Thread.sleep(4000);
		 * driver.findElement(Spicejet.radioFamilynFrndsterms).click();
		 * Thread.sleep(2000); driver.findElement(Spicejet.buttonContinue).click();
		 */
		Thread.sleep(7000);
		validateFlightDetails = driver.findElement(Spicejet.labelFlighDetailspage).getText();
		System.out.println(validateFlightDetails);
		Assert.assertEquals("Compare Fares", validateFlightDetails);

	}

	@AfterTest(groups = { "smoke" })

	public void TearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
		System.out.println("Browser Closed, Test Concluded!");
	}

	@Test(groups = { "printing" })

	public void secondgroup() throws InterruptedException {
		// Setting destinations

		System.out.println("This is group 2");

	}

}
