package com.ha.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Library/chromedriver/chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();

		driver.navigate().to("https://github.com/");

		driver.manage().window().maximize();

		driver.findElement(By.partialLinkText("Sign in")).click();

		driver.findElement(By.id("login_field")).sendKeys("Admin");

		driver.findElement(By.id("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@value='Sign in']")).click();

	}

}
