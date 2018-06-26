package First1;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Shopcluesentireflow {
	
	WebDriver driver;
	String textToSelect ="watches for men";
	public void invokeBrowser() {
		
		try {
			driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "D:\\Automata\\Windows\\geckodriver.exe");
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.shopclues.com/");
			/*driver.findElement(By.xpath("//a[text()='Sign In']")).click();
			driver.findElement(By.xpath("//a[@class=\"gp width50\"]")).click();
			 for(String handle : driver.getWindowHandles()) {
					driver.switchTo().window(handle);
				}
			driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("");
			driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("");
			driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();*/
			Thread.sleep(10000);
			//Alert alert =driver.switchTo().alert();
			//Thread.sleep(4000);
			
			Actions a = new Actions(driver);
			 for(String handle : driver.getWindowHandles()) {
					driver.switchTo().window(handle);
				}
			a.moveToElement(driver.findElement(By.xpath("//button[@class=\"moe-chrome-style-notification-btn moe-btn-close moe-block-class\"]")));
			a.click();
			a.perform();			
			//alert.dismiss();
			//String MainWindow=driver.getWindowHandle();
			//driver.switchTo().window(MainWindow);
			
			WebElement element=driver.findElement(By.xpath("//input[@placeholder=\"What are you looking for?\"]"));
			element.sendKeys("watch");
			Thread.sleep(5000);
			element.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			element.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			element.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			element.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			element.sendKeys(Keys.ARROW_DOWN);
			element.click();
			//By ajit = By.xpath("//input[@placeholder=\"What are you looking for?\"]");
			//WebDriverWait wait = new WebDriverWait(driver,3000);
			//wait.until(ExpectedConditions.presenceOfElementLocated(by));
			//WebElement textBoxElement = driver.findElement(by);
			//textBoxElement.sendKeys("watch");
			//selectOptionWithText("watches for boy");
			
			
			//WebDriverWait wait = new WebDriverWait(driver,3000);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			
			//wait.until(ExpectedConditions.visibilityOf(element));
			//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
            
			/*List<WebElement> optionsToSelect = element.findElements(By.xpath("//a[@onclick=\"setValue(watches for men)\"]"));
			
			for(WebElement option : optionsToSelect){
		        if(option.getText().equals(textToSelect)) {
		        	System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            break;
		        }
			}*/
			/*Thread.sleep(5000);
			for(int i=0;i<=optionsToSelect.size();i++) {
				if(i==3)
				{
					optionsToSelect.get(i).click();
				}
			}*/
			//List<WebElement> list=driver.findElements(By.xpath("//input[@placeholder=\"What are you looking for?\"]")).sendKeys("watch");
			 for(String handle : driver.getWindowHandles()) {
					driver.switchTo().window(handle);
				}
			driver.findElement(By.xpath("//*[contains(text(),'IIK Round Dial Black Metal Strap Men Quartz Watch for M')]")).click();
			driver.findElement(By.xpath("//input[@id=\"zip\"]")).sendKeys("411041");
			driver.findElement(By.xpath("//input[@id=\"check_shipping\"]")).click();
			for(String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
			}
			
			WebElement element2 =driver.findElement(By.xpath("//button[contains(text(),'Add To Cart')]"));
			Thread.sleep(2000);
			element.click();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		Shopcluesentireflow myObj = new Shopcluesentireflow();
		myObj.invokeBrowser();

	}

}
