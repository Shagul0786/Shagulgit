package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shagu\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement createnewacc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createnewacc.click();
		
		Thread.sleep(5000);
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByValue("7");
		
		Thread.sleep(5000);
		
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select (month);
		s1.selectByIndex(10);
		
		Thread.sleep(5000);
		
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1997");
		
		
		
		
		
	}

}
