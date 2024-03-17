package com.AutomationTalks.demoProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestClass1 {
	public static WebDriver driver;
	@BeforeMethod
	public void launchDriver() {


		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();



	}

	@Test
	public void Test1() {


		driver.navigate().to("https://www.AutomationTalks.com");

		System.out.println("Test 1 Title is "+driver.getTitle());

	}
	@Test
	public void Test2() {
		driver.get("https://www.AutomationTalks.com");

		System.out.println("Test 2 Title is "+driver.getTitle());


	}
	@Test
	public void Test3() {

		driver.get("https://www.AutomationTalks.com");
		System.out.println("Test 3 Title is "+driver.getTitle());

	}
	@AfterMethod
	public void quit() {

		driver.close();


	}

}
