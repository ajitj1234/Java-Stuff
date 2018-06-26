package First1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart {

	WebDriver driver;
	
	public void ajit() {
		driver = new FirefoxDriver();
		System.setProperty("WebDriver.gecko.driver", "D:\\\\Automata\\\\Windows\\\\geckodriver.exe");
		//driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.get("https://www.flipkart.com/mens-footwear/~minimum-60-percent-off/pr?sid=osp,cil&Param=1&fm=neo/merchandising&iid=M_24c36914-170b-4dcd-84bd-af3d9754bebc_6.48RA96DMZZST&ppt=Homepage&ppn=Homepage&otracker=hp_omu_Top+Fashion+Offers+_2_Min.60%25+Off_48RA96DMZZST_1&cid=48RA96DMZZST");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		//driver.get("http://toolsqa.com/selenium-webdriver/switch-commands/");
		driver.get("https://www.flipkart.com/mens-footwear/~minimum-60-percent-off/pr?sid=osp,cil&Param=1&fm=neo/merchandising&iid=M_24c36914-170b-4dcd-84bd-af3d9754bebc_6.48RA96DMZZST&ppt=Homepage&ppn=Homepage&otracker=hp_omu_Top+Fashion+Offers+_2_Min.60%25+Off_48RA96DMZZST_1&cid=48RA96DMZZST");
		driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/312/312/shoe/j/c/z/wpcs00003-provogue-7-original-imaemzstkrgmfqdf.jpeg?q=70']")).click();
		
		for(String handle : driver.getWindowHandles()) {
			
			System.out.println("handle");
			driver.switchTo().window(handle);
		}
		
			
	}
	
	
	public static void main(String[] args) {
		
		flipkart myObj = new flipkart();
		myObj.ajit();
		
	}

}
