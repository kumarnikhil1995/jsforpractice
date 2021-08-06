package com.teamrwb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RWBLogin2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil-PC\\NIKHIL'SWorkspace\\TeamRWB2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://members-staging.teamrwb.org/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("retrorwbtest+24@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("retronyms@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.RWBButton_button__aRkSC.RWBButton_primary__3ME7l")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='My Profile']")).click();
	}

}
