package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class WindowHandling {
	
	
	private static Object windowHandle;

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shagu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/?tag=googhydrabki-21ref=pd_5szpyfto9i_e&adgrpid=5524578567854225hbhjj//");
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		WebElement bestseller =driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		act.contextClick(bestseller).build().perform();
		
		
		Robot r =new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		act.contextClick(mobile).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement Fashion =driver.findElement(By.xpath("//a[text()='Fashion']"));
		act.contextClick(Fashion).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//Window Handling
		
		String windowHandle= driver.getWindowHandle();
		System.out.println(windowHandle);
		
		String title =driver.switchTo().window(windowHandle).getTitle();
		System.out.println(title);
		
		Set<String> windowHandles =driver.getWindowHandles();
		for(String string:windowHandles) {
			String currentUrl=driver.switchTo().window(string).getCurrentUrl();
			System.out.println(currentUrl);
		}
		
		
		
		
		
		
		
		
		
	}

}
