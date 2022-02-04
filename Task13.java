package com.ha.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Library/chromedriver/chromedriver.exe");

		WebDriver driver;

		driver = new ChromeDriver();

		driver.navigate().to("http://demo.openemr.io/b/openemr/");

		driver.manage().window().maximize();

		driver.findElement(By.name("authUser")).sendKeys("admin");
		driver.findElement(By.name("clearPass")).sendKeys("pass");
		Select selLanguage = new Select(driver.findElement(By.name("languageChoice")));
		selLanguage.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button/i")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Messages')]")).click();
		
		driver.switchTo().frame(driver.findElement(By.name("msg")));
		
		driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
		
		driver.findElement(By.xpath("//textarea[@id='note']")).sendKeys("Hello");
		
		Select selectType = new Select(driver.findElement(By.name("form_note_type")));
		selectType.selectByVisibleText("Pharmacy");
		
		Select selectMessageStatus = new Select(driver.findElement(By.name("form_message_status")));
		selectMessageStatus.selectByVisibleText("New");
		
		Select selectUser = new Select(driver.findElement(By.name("users")));
		selectUser.selectByIndex(0);
		
		driver.findElement(By.xpath("//button[@value='Send message']")).click();
		
		String errorMessage=driver.findElement(By.xpath("//span[contains(text(),' Please choose a patient')]")).getText();
		System.out.println(errorMessage);
		
		

	}

}
