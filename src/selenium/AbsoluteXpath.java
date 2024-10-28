package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shagu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement email=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]div/div/div/div[2]div/div[1]/div[1]/input"));
	    email.sendKeys("shagul");
	
	    WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1/form/div[1]/div[2]/div/input"));
	    password.sendKeys("Ameed")	;
	
	   WebElement login=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
	   login.click();	
	
	}

}
