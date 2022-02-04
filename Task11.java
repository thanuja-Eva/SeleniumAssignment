package com.ha.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Library/chromedriver/chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();

		driver.navigate().to("https://www.goto.com/meeting/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='Accept Recommended Settings']")).click();

		driver.findElement(By.linkText("Try Free")).click();

		driver.findElement(By.id("first-name")).sendKeys("John");

		driver.findElement(By.id("last-name")).sendKeys("wick");

		driver.findElement(By.id("login__email")).sendKeys("john@gmail.com");

		driver.findElement(By.id("contact-number")).sendKeys("78999456123");

		driver.findElement(By.id("login__password")).sendKeys("admin@123");

		Select selCompanySize = new Select(driver.findElement(By.name("CompanySize")));
		selCompanySize.selectByIndex(1);

		driver.findElement(By.xpath("//button[text()='Start My Trial']")).click();

		driver.findElement(By.xpath("//input[@value='Sign in']")).click();

	}

}
