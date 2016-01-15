package com.fsoft.jenkintest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AppTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		String driverName = "Chrome";
		WebDriver driver = null;
		if ("Safari".equals(driverName)) {
			driver = new SafariDriver();
		} else if ("Firefox".equals(driverName)) {
			driver = new FirefoxDriver();
		} else if ("Chrome".equals(driverName)) {
			System.setProperty("webdriver.chrome.driver", "D:/github/jenkin/chromedriver");
			driver = new ChromeDriver();
		}  	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://valor-software.github.io/ng2-select/index-bs4.html");
		driver.findElement(By.xpath("/html/body/app/div/div/selection/h1/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select\"]/div[1]/tabset/ul/li[2]/a/span")).click();
	}
}