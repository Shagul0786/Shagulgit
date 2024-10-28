package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMe {
	
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shagu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		
		WebElement email =driver.findElement(By.name("username"));
		email.sendKeys("Shagul@gmail");
		
		boolean dispalayed1 =email.isDisplayed();
		System.out.println("Touched");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Sha");
		
		email.clear();
		
		WebElement Login = driver.findElement(By.name("login"));
		
		boolean selected =Login.isSelected();
		System.out.println(selected);
		
		Login.click();
		
		
		
		
		
		
		
		
	}

}
