package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mukeshKumar {

	public static void main(String[] args) throws InterruptedException 
	{
	
	System.setProperty("WebDriver.Chrome.driver","C:\\Users\\ARUNKUMAR\\esclipse new\\First\\Driver\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement  col6 = driver.findElement(By.className("_2KpZ6l _2doB4z"));
	 driver.close();
	
	 WebElement  col = driver.findElement(By.className("_3704LK"));
	 col.sendKeys("iphone 11");
	 
	
	 WebElement  col1 = driver.findElement(By.className("L0Z3Pu"));
	 col1.click();
	 

	
	 
	// WebElement  col2 = driver.findElement(By.xpath("//*[@id=\"6917529660599021393\"]/div[2]/a/picture/img"));
	// col2.click();
	}  
}
