package com.teamrwb.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil-PC\\NIKHIL'SWorkspace\\TeamRWB2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");

		List<WebElement> values = driver.findElements(By.xpath("//input[@class='custom-control-input']"));

		for (int i = 0; i < values.size(); i++) {
			WebElement r = values.get(i);
			String name = r.getAttribute("id");
			System.out.println(name);
			if (name.equalsIgnoreCase("yesRadio")) {
				Actions act = new Actions(driver);
				act.moveToElement(r).click().build().perform();

			}
		}

	}

}
