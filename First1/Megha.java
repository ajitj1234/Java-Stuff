package First1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Megha {
 
 WebDriver driver;
 
 public void invokeBrowser() {
  
  try {
   System.setProperty("webdriver.gecko.driver", "D:\\Automata\\Windows\\geckodriver.exe");
   driver = new FirefoxDriver();
   //driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
   
   driver.get("https://www.flipkart.com/search?q=womens%20top&otracker=start&as-show=on&as=off");
   driver.findElement(By.xpath("//img[@alt=\"Rare Casual 3/4th Sleeve Solid Women's Pink Top\"]")).click();
   //driver.get("https://www.flipkart.com/rare-casual-3-4th-sleeve-solid-women-s-pink-top/p/itmf3z3zch3gqm8w?pid=TOPEQEWETDKKFZV4&lid=LSTTOPEQEWETDKKFZV4SCS8DB&marketplace=FLIPKART&srno=s_1_1&otracker=search&fm=SEARCH&iid=6babdad4-a67d-4cf1-9cd0-0211a5f27d51.TOPEQEWETDKKFZV4.SEARCH&ppt=Search%20Page&ppn=Search%20Page&ssid=lqtv4hsua80000001526424023385&qH=e176ea8a70a3f262");
   
   Thread.sleep(300);
   
   //String winHandleBefore = driver.getWindowHandle();
   
     //    for(String winHandle : driver.getWindowHandles()){
        	 
       //      driver.switchTo().window(winHandle);
         //}
   
   Actions a = new Actions(driver);
   a.moveToElement(driver.findElement(By.xpath("//li[@class='_3XkO0t'][@id='swatch-1-size']")));  //medium size
   a.click();
   a.perform();
   
   Thread.sleep(2000);
   
   Actions b = new Actions(driver);
   b.moveToElement(driver.findElement(By.xpath("//li[@class='_3XkO0t'][@id='swatch-0-size']")));  //small size
   b.click();
   b.perform();
   
   //driver.navigate().to("small");
   //Thread.sleep(20000);
   //driver.findElement(By.xpath("//*[@id=\"swatch-1-size\"]/a")).click();
   driver.findElement(By.xpath("//button[@class='_2AkmmA 2Npkh4 2MWPVK']")).click();
   //WebDriverWait wait = new WebDriverWait(driver, 30);

   //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2AkmmA 2Npkh4 2MWPVK']"))).click();
   //driver.quit();
   
  } catch (Exception e) {

   e.printStackTrace();
  }
  
 }
 
 
 public static void main(String[] args) {
  
  Megha myObj = new Megha();
  myObj.invokeBrowser(); 
  

 }

}
