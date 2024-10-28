package selenium;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotakeScreenshot {
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shagu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://x.com/?lang=en-in");
		
		driver.manage().window().maximize();
		
		
		
		TakesScreenshot t=(TakesScreenshot) driver;
		
		File screenshotAs =t.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("C:\\Users\\shagu\\eclipse-workspace\\Selenium\\Driver\\Screenshot\\ss.png");
	
		
		FileUtils.copyFile(screenshotAs, dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
