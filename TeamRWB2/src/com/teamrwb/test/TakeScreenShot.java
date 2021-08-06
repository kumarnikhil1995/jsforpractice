package com.teamrwb.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakeScreenShot {
	@Test
	public void ScreenShot() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil-PC\\git\\teamRWB\\TeamRWB2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://members-staging.teamrwb.org/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='RWBButton_button__aRkSC RWBButton_primary__3ME7l']")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snapshots/new.png");
		FileHandler.copy(source, dest);
		driver.quit();
	}

}
