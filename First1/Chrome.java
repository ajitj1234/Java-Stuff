package First1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chrome {
	WebDriver driver;
	
	public void invokeBrowser( ) {
		
		try {
			System.setProperty("WebDriver.chrome.driver", "D:\\Automata\\Windows\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
			
			Actions a = new Actions(driver);
			for(String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
			}
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/div/ul/li[4]/a/span")));
			a.perform();
			
			Thread.sleep(2000);
			
			
			Actions b = new Actions(driver);
			b.moveToElement(driver.findElement(By.xpath("//a[@href=\"/sarees/pr?sid=2oq,c1r,3pj,7od&otracker=nmenu_sub_Women_0_Sarees&otracker=nmenu_sub_Women_0_Sarees\"]")));
			
			b.click();
			b.perform();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Chrome myObj = new Chrome();
		myObj.invokeBrowser();

		

	}

}
