package com.fsoft.jenkintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginContainer {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get("http://cituscontainerization.com/Login");
	}

	@Test
	public void inputUPcorrect() {
		driver.findElement(By.xpath(".//input[contains(@type,'text')]")).sendKeys("admin");
		driver.findElement(By.xpath(".//input[contains(@type,'password')]")).sendKeys("admin");
		driver.findElement(By.xpath(".//button [contains(@type,'submit') and contains(text(),'Sign In')]")).click();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}
