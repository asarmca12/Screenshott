package org.sample;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesample {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-14\\eclipse\\java-oxygen\\eclipse\\June11\\Screenshot\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http:/www.facebook.com/");
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src=tk.getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	File desc=new File("Desktop\\pavi\\jpeg");
	FileUtils.copyFile(src,desc);
	
	}
	

}
