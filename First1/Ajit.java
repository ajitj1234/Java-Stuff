package First1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajit {
	

	WebDriver driver;
	
	public void invokeBrowser( ) {
		
		try {
			System.setProperty("WebDriver.gecko.driver", "D:\\\\Automata\\\\Windows\\\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/search?q=womens%20top&otracker=start&as-show=on&as=off");
			driver.findElement(By.xpath("//img[@alt=\"Rare Casual 3/4th Sleeve Solid Women's Pink Top\"]")).click();
			
			Thread.sleep(300);
						
			//String winHandleBefore = driver.getWindowHandle();
			//System.out.println("winHandleBefore");

			// Perform the click operation that opens new window

			
			//driver.switchTo().window("winHandleBefore");
				// Switch to new window opened
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			
			//Actions a = new Actions(driver);
			//a.moveToElement(driver.findElement(By.xpath("//li[@class='_3XkO0t'][@id='swatch-1-size']")));  //medium size
			//a.click();
			//a.perform();
			driver.findElement(By.xpath("//li[@class='_3XkO0t'][@id='swatch-1-size']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[@class='_3XkO0t'][@id='swatch-0-size']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}
	

			   

	public static void main(String[] args) {
		
		Ajit myObj = new Ajit();
		myObj.invokeBrowser();		
		
	
	}

		
}


