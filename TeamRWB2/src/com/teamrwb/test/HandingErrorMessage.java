package com.teamrwb.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandingErrorMessage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil-PC\\git\\corejava\\TeamRWB2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://members-staging.teamrwb.org/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='RWBButton_button__aRkSC RWBButton_primary__3ME7l']")).click();
		List<WebElement> error_message = driver.findElements(By.cssSelector("p.errorMessage"));
		for (int i = 0; i < error_message.size(); i++) {
			WebElement error_s = error_message.get(i);
			String Em = error_s.getAttribute("innerHTML");
			System.out.println(Em);
		}

	}

}
