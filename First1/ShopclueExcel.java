package First1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopclueExcel {
 
 WebDriver driver;

 
 /*public void write() {
	 try {
		File f = new File("D:\\Auto Work\\shop.txt");
		
		//FileOutputStream fos = new FileOutputStream(f);
		 //PrintWriter pw = new PrintWriter(fos);
		 //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 //System.out.print(webElement);
		 //String str = br.readLine();
		 //pw.write(str);
		 //pw.flush();
		 //fos.close();
		 //pw.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
 }*/
 

public void invokeBrowser() throws IOException {
  
  try {
	try {
	   System.setProperty("webdriver.gecko.driver", "D:\\Automata\\Windows\\geckodriver.exe");
	   driver = new FirefoxDriver();
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
	         
	      //2nd method == Handling auto suggestions generic
	      
	      //enter the watch in search text box
	      WebElement element1 = driver.findElement(By.xpath("//input[@placeholder=\"What are you looking for?\"]"));
	      element1.sendKeys("watch");
	     
	      List<WebElement> list = driver.findElements(By.xpath("//ul[@id=\"search-result\"]//li/descendant::a[//*[text()=\"es for boy\"]]"));
	      
	      //To print the size of the list
	      System.out.println("Total suggestions are" + list.size());
	      
	      for(int i=0; i<=list.size(); i++) {
	       
	       //To print all the auto-suggestions
	       System.out.println(list.get(i).getText());
	       
	       //To compare the index as well as text with the text which I want search
	       if(list.get(i).getText().contains("watches for boy")) {
	        
	        //If the value of i(index) contains(watches for boy) at any location or index  in suggestion, it will click on it  
	        list.get(i).click();
	        
	        //To get out of the loop
	        break;
	       }
	       
	      }
	      
	      driver.findElement(By.xpath("//*[text()=\"Titan\"]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[@for=\"No_false\"]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[@for=\"1,001 - 2,500_P4\"]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[@for=\"Black_45583\"]")).click();
	      Thread.sleep(1000);
	      
	      List<WebElement> list1 = driver.findElements(By.xpath("//*[contains(text(),'Titan')]"));
	      System.out.println("Total products are" +list1.size());
	      ArrayList<String> obj1 = new ArrayList<String>();
	      
	      PrintWriter outputfile = new PrintWriter("D:\\Auto Work\\shop.txt");
	      for (WebElement webElement : list1) {
	          //System.out.println(webElement.getText());    
	    	  obj1.add(webElement.getText()); 
	         
	      }
	      
	      
	      
	      for(int i=1;i<obj1.size();i++) {
               System.out.println(obj1.get(i));
               outputfile.println();
 	    	   outputfile.print(obj1.get(i));
	       }
	      System.out.println(obj1.get(0));
	      outputfile.close();
	           
	    
	     } catch (InterruptedException e) {
	      
	      e.printStackTrace();
	     }
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
 
  
 }
 
 
 public static void main(String[] args) throws IOException {
	 ShopclueExcel myObj = new ShopclueExcel();
     myObj.invokeBrowser();
     
  

 }

}






/*   try {
//create a buffered reader that connects to the console, we use it so we can read lines
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

//read a line from the console
String lineFromInput = in.readLine();

//create an print writer for writing to a file
PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

//output to the file a line
out.println(lineFromInput);

//close the file (VERY IMPORTANT!)
out.close();
}
catch(IOException e1) {
  System.out.println("Error during reading/writing");
}*/