package First1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipList {
	
	WebDriver driver;
	
	public void invokeBrowser() {
	
			try {
				driver = new FirefoxDriver();
				System.setProperty("webdriver.gecko.driver", "D:\\Automata\\Windows\\geckodriver.exe");
				//driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.get("https://www.flipkart.com/mens-watches-store?otracker=nmenu_sub_Men_0_Watches");
				//WebElement element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div[2]/div[2]/div/section[2]/div[4]/div[3]/select"));
				
				List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div[2]/div[2]/div/section[2]/div[4]/div[3]/select"));
				
				System.out.println("Total suggestions are" + list.size());
				
				for (WebElement WebElement : list)
				{
					System.out.println(WebElement.getText());
					
				}
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		
	}
		
	

	public static void main(String[] args) {
		FlipList myObj = new FlipList();
		myObj.invokeBrowser();

	}

}
