package com.qa.git.practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartGitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		System.out.println("parent " + driver.getWindowHandle());
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone 12",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'APPLE iPhone 12 (Blue, 128 GB)')]")).click();
		Thread.sleep(5000);
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		System.out.println("child " + driver.getWindowHandle());
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@type='button'][@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("7684841500", Keys.ENTER);
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[contains(text(),'CONTINUE')]")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rkkamila@123", Keys.ENTER);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='RAJANI KANTA KAMILA']")).click();
		driver.findElement(By.xpath("//button[text()='Deliver Here']")).click();

	}

}
