package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HotelReservation {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shagu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement usern = driver.findElement(By.id("username"));
		usern.sendKeys("Shashagul1");
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys("Allah@00777");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select ls =new Select (location);
		ls.selectByVisibleText("Melbourne");
		
		
		
		WebElement Hotels = driver.findElement(By.id("hotels"));
		Select Hs =new Select (Hotels);
		Hs.selectByVisibleText("Hotel Sunshine");
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select rt =new Select (roomtype);
		rt.selectByVisibleText("Super Deluxe");
		
		WebElement ckn = driver.findElement(By.id("datepick_in"));
		ckn.clear();
		ckn.sendKeys("07/10/2024");
		
		WebElement dpo = driver.findElement(By.id("datepick_out"));
		dpo.clear();
		dpo.sendKeys("10/10/2024");
		
		
		WebElement nor = driver.findElement(By.id("room_nos"));
		nor.sendKeys("4-Four");
		
		WebElement cpr = driver.findElement(By.id("child_room"));
		cpr.sendKeys("3-Three");
		
		WebElement apr = driver.findElement(By.id("adult_room"));
		cpr.sendKeys("2-Two");
		
		WebElement Submit = driver.findElement(By.name("Submit"));
		Submit.click();
		
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		button.click();
		
		WebElement ctn = driver.findElement(By.id("continue"));
		ctn.click();
		
		WebElement Fstname = driver.findElement(By.id("first_name"));
		Fstname.sendKeys("Shagul Ameed");
		
		WebElement lstname = driver.findElement(By.id("last_name"));
		lstname.sendKeys("B");
		
		WebElement addrs = driver.findElement(By.id("address"));
		addrs.sendKeys("No:1/327 stnagar chennai-600000");
		
		WebElement ccn = driver.findElement(By.id("cc_num"));
		ccn.sendKeys("2312 3212 3212 2151");
		
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select cct = new Select (cardtype);
		cct.selectByVisibleText("Master Card");
		
		
		WebElement Expirydate = driver.findElement(By.id("cc_exp_month"));
		Select ed = new Select (Expirydate);
		ed.selectByVisibleText("November");
		
		WebElement Expirydate1 = driver.findElement(By.id("cc_exp_year"));
		Select ed1 = new Select (Expirydate1);
		ed1.selectByVisibleText("2026");
		
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys("2312");
		
		WebElement Booknow = driver.findElement(By.id("book_now"));
		Booknow.click();
		
		Thread.sleep(5000);
		
		
		WebDriverWait wait =new WebDriverWait (driver,30);
		WebElement orderid =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
		JavascriptExecutor Js=(JavascriptExecutor) driver;
		Js.executeScript("arguments[0].scrollIntoView(true);", orderid);
		String OrderID = orderid.getAttribute("value");
		System.out.println("orderId:"+ OrderID);
		
	
	   WebElement logout = driver.findElement(By.id("logout"));
	   logout.click();
	   System.out.println("Successfully logged out");
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		  
		
	}

}
