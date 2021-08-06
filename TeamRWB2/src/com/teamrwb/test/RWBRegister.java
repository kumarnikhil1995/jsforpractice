package com.teamrwb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RWBRegister {
	By Email = By.xpath("//input[@class='TextInput_textInput__1ZPI7 formInput'][@type='text']");
	By Pass = By.xpath("/html/body/div[1]/div/div[4]/div[2]/input");
	By Sign = By.className("RWBButton_button__aRkSC RWBButton_primary__3ME7l");

	static WebDriver driver;

	public RWBRegister() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		RWBRegister r = new RWBRegister();
		// r.BrowserSetup();

		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"RWBButton_button__aRkSC RWBButton_secondary__2GsSe\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div[1]/div[1]/input"))
				.sendKeys("hawkins");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div[1]/div[2]/input"))
				.sendKeys("jacks");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div[1]/div[3]/input"))
				.sendKeys("retrorwbtest+automation1@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div[1]/div[4]/input"))
				.sendKeys("retrorwbtest+automation1@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div[1]/div[5]/input"))
				.sendKeys("retronyms@123");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/div[1]/div[6]/input"))
				.sendKeys("retronyms@123");
		driver.findElement(By.xpath("//button[@class=\"RWBButton_button__aRkSC RWBButton_primary__3ME7l\"]")).click();

	}

	/*
	 * public RWBRegister(String uemail, String uPassword) {
	 * driver.findElement(Email).sendKeys(uemail);
	 * driver.findElement(Pass).sendKeys(uPassword);
	 * driver.findElement(Sign).click(); }
	 */

	public void BrowserSetup(String browser, String URL) {
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Nikhil-PC\\NIKHIL'SWorkspace\\TeamRWB2\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Nikhil-PC\\NIKHIL'SWorkspace\\TeamRWB2\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else {
			System.out.print("Please enter the browser name");

		}

		driver.manage().window().maximize();
		driver.get(URL);
	}

	public void CloseBrowser() {
		driver.quit();

	}

}
