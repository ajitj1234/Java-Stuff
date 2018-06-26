package First1;

import java.awt.Dimension;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.javafx.scene.paint.GradientUtils.Point;

public class AmazonExcel {
	
	 WebDriver driver;

	 
	 public void invokeBrowser() throws IOException {
		 System.setProperty("webdriver.gecko.driver", "D:\\Automata\\Windows\\geckodriver.exe");
		   driver = new FirefoxDriver();
		   //driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   
		   driver.get("https://www.shopclues.com/");
		   org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(200, 200);
		   driver.manage().window().setSize(d);
		   
		   //Point p = new Point(400,400);
		   //driver.manage().window().setPosition(p);
		 
		 
		 
		 
		 
		 
	 }
	public static void main(String[] args) {
		

	}

}
