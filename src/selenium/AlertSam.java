package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSam {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shagu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//SimpleAlert:
		
		WebElement Simplealert = driver.findElement(By.xpath("//butto[@onclick='alertbox()']"));
		Simplealert.click();
		
	
		//switchTo
		
		//driver.switchTo().alert().accept();
		
		Alert alert1=driver.switchTo().alert();
		 
		System.out.println(alert1.getText());
		alert1.accept();
		
		//confirm alert:
		WebElement alertmessage = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alertmessage.click();
		
		Alert alert2=driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		
		//PeomptAlert:
		
		WebElement alertmessage1 = driver.findElement(By.xpath("(//a[@class=a'nalystic'])[3]"));
		alertmessage1.click();
		
		WebElement promptalert = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		promptalert.click();
		
		Alert alert3=driver.switchTo().alert();
		System.out.println(alert3.getText());
		
		alert3.sendKeys("done");
		
		alert3.accept();
		
		
		
		
		
		
		
		
	}

}
