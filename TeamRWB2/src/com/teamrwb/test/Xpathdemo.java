package com.teamrwb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil-PC\\git\\corejava\\TeamRWB2\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo123");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testpassword");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());

	}

}
