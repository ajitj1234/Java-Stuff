package First1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues {

	
	//JavascriptExecutor jse;
	
	public void invokeBrowser( ) {
		
		try {
			WebDriver driver= new FirefoxDriver();
			//driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "D:\\\\\\\\Automata\\\\\\\\Windows\\\\\\\\geckodriver.exe");
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.shopclues.com/");
			
			 /*org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(500, 600);
			   driver.manage().window().setSize(d);
			   
			   Point p =new Point(200, 400);
			   driver.manage().window().setPosition(p);
			   */
			   
			   
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//li[@id=\"nav_4\"]")));
			a.perform();
			for(String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
			}
					
			driver.findElement(By.xpath("//a[@href=\"//www.shopclues.com/mens-clothing-jeans.html\"]")).click();
			//Thread.sleep(2000);
			
			//jse = (JavascriptExecutor)driver;
			
			//driver.findElement(By.xpath("//*[@id='sort_price_fct']/li[1]/label/text()")).click();
			//driver.findElement(By.xpath("//*[@id=sort_price_fct]/li[1]/label")).click();
			
			
		    //jse = (JavascriptExecutor) driver;
		    Thread.sleep(2000);
			//driver.findElement(By.xpath("//label[contains(text(),'Rs. 399 and Below')]")).click();
			//driver.findElement(By.xpath("//label[@for=\"Rs. 399 and Below\"]")).click();
			
		    
		    //driver.findElement(By.xpath("//*[@id=\"facet_shopclues_surety_fct\"]/li")).click();
		    for(String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
			}
		    //driver.findElement(By.xpath("//img[@title=\"ROAD ROCKERS Men's Slim Fit Blue Denim Jeans\"]")).click();
		    //JavascriptExecutor jse = (JavascriptExecutor) driver;
		    //driver.findElement(By.xpath("//label[contains(text(),'Rs. 399 and Below')]")).click();
		    //WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Rs. 399 and Below (2)')]"));
		    //jse.executeScript("arguments[2].click();", element);
			
			//Actions b = new Actions(driver);
			//b.moveToElement(driver.findElement(By.cssSelector("css=#sort_price_fct > li > label")))
			//b.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Rs. 399 and Below')]")));
			//*[@id="sort_price_fct"]/li[1]/label
			//b.moveToElement(driver.findElement(By.cssSelector("input#RS. 399 and Below")));
			//Thread.sleep(2000);
			//b.click();
			//b.perform();
		    
		    /*Actions b = new Actions(driver);
		    //b.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Rs. 399 and Below')]")));
		    //Thread.sleep(2000);
			//b.click();
			b.perform();*/
		    
			WebElement element =driver.findElement(By.xpath("//label[contains(text(),'Rs. 399 and Below')]"));
			Thread.sleep(2000);
			element.click();
			
			
			//*[@id="sort_price_fct"]/li[1]/label
			//*[@id="sort_price_fct"]/li[1]/label/text()
			//div[@class=\"scrollable mCustomScrollbar _mCS_18 mCS_no_scrollbar\
			//Thread.sleep(2000);
			//label[@for="Rs. 399 and Below"]
			//driver.findElement(By.xpath("//label[@for=\"Rs. 399 and Below\"]")).click();
			//List <WebElement> li= driver.findElements(By.cssSelector("css=#sort_price_fct > li > label"));
			//List <WebElement> li= driver.findElements(By.xpath("//label[@for=\"Rs. 399 and Below\"]"));
			//System.out.println(li.size());
	           //     for(int i=0;i<=li.size()-1;i++)
	            //    {
	             //       li.get(i).click();
	             //   }
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
		
	public static void main(String[] args) {
		
		Shopclues Myobj = new Shopclues();
		Myobj.invokeBrowser();
	

	}

}
