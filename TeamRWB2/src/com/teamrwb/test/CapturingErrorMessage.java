package com.teamrwb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil-PC\\NIKHIL'SWorkspace\\TeamRWB2\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.workmarket.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button#login_page_button")).click();
		Thread.sleep(3000);
		String actual_error = driver.findElement(By.xpath("(//div[@data-attr-id='wm-typography'])[1]"))
				.getAttribute("innerHTML");
		System.out.println(actual_error);

	}

}
