package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest4 {
	@Test
	public void testHDFCFire() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\a07208trng_b4b.04.24\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions act1 = new Actions(driver);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).perform();
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']"))).click()
				.perform();
		
		//Assert.assertTrue(condition, message);

	}
}
