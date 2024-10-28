package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitSam {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shagu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=  new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Sha");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Shagul");
		
		WebElement Login = driver.findElement(By.xpath("//div[text()='Log in']"));
		Login.click();
		
		driver.navigate().to("https://letcode.in/signin");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Ameed");
		
		WebElement psd = driver.findElement(By.name("password"));
		psd.sendKeys("Ameed@b");
		
		WebElement login = driver.findElement(By.xpath("//button[text()='LOGIN']"));
		login.click();
		
		WebElement toast = driver.findElement(By.id("toast-container"));
		String text = toast.getText();
		System.out.println(text);
		
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOf(toast));
		
		WebElement signup =driver.findElement(By.xpath("//{text()='Sign up']"));
		signup.click();
		
		
		
		
		
    
	}

}
