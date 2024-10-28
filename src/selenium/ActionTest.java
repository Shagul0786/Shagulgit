package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTest {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shagu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions act =new Actions (driver);
		
		WebElement doubleclick =driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doubleclick).build().perform();
		
		 WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		 act.contextClick(rightclick).build().perform();
		 
		 WebElement clickme =driver.findElement(By.xpath("//button[@type='button'](4)"));
		 act.click(clickme).build().perform();
			
		 driver.navigate().to("https://www.amazon.in/amazonprime?ref_=nav_cs_primelink_nonmember");
		 
		 
	
				
			  
		
		
		
		
		
		
		
	}

}
