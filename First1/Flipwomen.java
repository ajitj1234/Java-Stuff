package First1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipwomen {
	
	WebDriver driver;
	
	public void invokeBrowser( ) {
		try {
			driver = new FirefoxDriver();
			System.setProperty("WebDriver.gecko.driver", "D:\\\\Automata\\\\Windows\\\\geckodriver.exe");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			Long start = System.currentTimeMillis();
			System.out.println(start);
			
			//driver.get("https://www.google.com/");
			//driver.get("https://www.flipkart.com/mens-footwear/~minimum-60-percent-off/pr?sid=osp,cil&Param=1&fm=neo/merchandising&iid=M_24c36914-170b-4dcd-84bd-af3d9754bebc_6.48RA96DMZZST&ppt=Homepage&ppn=Homepage&otracker=hp_omu_Top+Fashion+Offers+_2_Min.60%25+Off_48RA96DMZZST_1&cid=48RA96DMZZST");
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
			//driver.findElement(By.xpath("//input[@class=\"_2zrpKA\"]")).sendKeys("ajitjagtap2008@gmail.com");
			//driver.findElement(By.xpath("//input[@class=\"_2zrpKA _3v41xv\"]")).sendKeys("matoshri");
			//driver.findElement(By.xpath("//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")).click();
			System.out.println(driver.getTitle());
			Actions a = new Actions(driver);
			for(String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
			}
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/div/ul/li[4]/a/span")));
			a.perform();
			
			Thread.sleep(2000);
			
			//List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"QPOmNK\"]/descendant::li[@class=\"_1KCOnI _1h5QLb\"]/descendant::a[//*[text()=\"Swim & Beachwear\"]]"));
			List<WebElement> list = driver.findElements(By.cssSelector("ul[class='QPOmNK']"));
			
			/*System.out.println("Total suggestions are" + list.size());
			
			for (WebElement WebElement : list)
		    {
				//System.out.println(WebElement.getText());
				
				for(int i=0; i<list.size(); i++) {
					if(i==10) {
						System.out.println(WebElement.getText());
					}
				}
				
			}*/
			
			
			
			
			//List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"QPOmNK\"]//li/descendant::a[@class=\"nsslWl\"]"));
			//List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"QPOmNK\"]/child::li/a"));
		      
		      //To print the size of the list
		    System.out.println("Total suggestions are" + list.size());
		      
		    for(int i=0; i<list.size(); i++) {
		    	
		    	if(i==16) {
		    		System.out.println("indix is i" +i+" "+list.get(i).getText());
			    	
		    	}
		    				     		     
		      }
		     System.out.println("loop ends");
			
			
			//Actions b = new Actions(driver);
			By by = By.xpath("//a[@href=\"/sarees/pr?sid=2oq,c1r,3pj,7od&otracker=nmenu_sub_Women_0_Sarees&otracker=nmenu_sub_Women_0_Sarees\"]");
			WebDriverWait wait = new WebDriverWait(driver,3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			for(String handle : driver.getWindowHandles()) {
				driver.switchTo().window(handle);
			}
			driver.findElement(by).click();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			/*b.moveToElement(driver.findElement(By.xpath("//a[@href=\"/sarees/pr?sid=2oq,c1r,3pj,7od&otracker=nmenu_sub_Women_0_Sarees&otracker=nmenu_sub_Women_0_Sarees\"]")));
			b.click();
			b.perform();*/
			
			driver.findElement(By.xpath("//*[@class=\"D_NGuZ _1KDdN8\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@title=\"Banarasi Silk\"]")).click();
			Thread.sleep(3000);
			
			//Actions b = new Actions(driver);
			WebElement element =driver.findElement(By.xpath("//*[@class=\"fPjUPw\"]"));
			element.click();
			Select select= new Select(element);
            select.selectByValue("2000");		
			/*Thread.sleep(2000);
			
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
			*/
            Long end = System.currentTimeMillis();
			System.out.println(end);
			Long finish = end-start;
			System.out.println(finish);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	public static void main(String[] args) {
		Flipwomen myObj = new Flipwomen();
		myObj.invokeBrowser();

		
	}

}
