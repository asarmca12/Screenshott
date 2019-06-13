package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-14\\eclipse\\java-oxygen\\eclipse\\June11\\Screenshot\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http:/www.facebook.com/");
	driver.manage().window().maximize();
	WebElement scrollDown= driver.findElement(By.xpath("//a[text()='தமிழ்']"));
	WebElement scrollUp= driver.findElement(By.id("email"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(5000);
	js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	Thread.sleep(5000);
	js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);

	
}
}
