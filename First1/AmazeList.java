package First1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.functors.IfClosure;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellFill;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazeList {
	
	WebDriver driver;
	XSSFWorkbook workbook;
	String str;
	public XSSFSheet input() throws IOException {
		File file1 = new File("C:\\Users\\Admin\\Desktop\\Rambo.xlsx");
		FileInputStream inputStream1 = new FileInputStream(file1);
		 XSSFWorkbook workbook = new XSSFWorkbook(inputStream1);
		 XSSFSheet sheet = workbook.getSheetAt(1);
		 XSSFRow row ;
		 XSSFCell cell;
		 return(sheet);		
	}
	
	public void invokeBrowser() {
		
		try {
			driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "D:\\Automata\\Windows\\geckodriver.exe");
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			FileReader reader = new FileReader("D:\\Auto Work\\eclipse-workspace\\Iquadra\\src\\config\\configuration.properties");
			Properties props = new Properties();
			props.load(reader);
			 
			String projecturl = props.getProperty("URL");
			driver.get(projecturl);
			 
			//driver.findElement(By.xpath("//div[@class=\"nav-search-facade\"]")).sendKeys("iphone");
			
			//input(); 	
			
            XSSFSheet sheet1 = input();
			String str = sheet1.getRow(0).getCell(0).getStringCellValue();
			System.out.println(str);			
			 WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
			 element.sendKeys(str);
			
			driver.findElement(By.id("nav-search-submit-text")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
			
			//XSSFSheet sheet2 = input();
	
			 
			 String emailxpath = sheet1.getRow(1).getCell(0).getStringCellValue();
			System.out.println(emailxpath); 
			String array[]=emailxpath.split("=",2);
			System.out.println(array[0]);
			System.out.println(array[1]);
			
			WebElement element1;
			if( array[0].equals("xpath")){
			
			element1=driver.findElement(By.xpath(array[1]));
			
			String stremail = sheet1.getRow(2).getCell(0).getStringCellValue();
			 System.out.println(stremail);
			element1.sendKeys(stremail);
			}
			
			else if( array[0].equals("id")){
				//WebElement element1=driver.findElement(By.id(emailxpath));
				element1=driver.findElement(By.id(array[1]));
				
				String stremail = sheet1.getRow(1).getCell(0).getStringCellValue();
				 System.out.println(stremail);
				element1.sendKeys(stremail);
				}
			
			
			List<WebElement> list =driver.findElements(By.xpath("//*[contains(text(),'Apple')]"));
			System.out.println("Total suggestions are" +  list.size());
			ArrayList<String> obj1 = new ArrayList<String>();
			for(WebElement webElement : list) {
			
			//System.out.println(WebElement.getText());
			obj1.add(webElement.getText());
						
		    }
			for(int i=0;i<obj1.size();i++)
		      {
		    	  System.out.println(obj1.get(i));   
		      }
			
			File file = new File("C:\\Users\\Admin\\Desktop\\Rambo.xlsx");
			FileInputStream inputStream = new FileInputStream(file);
			XSSFWorkbook workbook1 = new XSSFWorkbook(inputStream);
			XSSFSheet sheet3 = workbook1.getSheetAt(0);
			int rowCount = sheet3.getLastRowNum();
		    System.out.println(rowCount);
			
			for(int i=0; i <obj1.size(); i++){
		  
									  
			  Row row1 = sheet3.createRow(i);
			  row1.createCell(0).setCellValue(obj1.get(i));
						    		    
		        
			}
			//inputStream.close();
			FileOutputStream fileOutput = new FileOutputStream(file);
			workbook1.write(fileOutput);
			fileOutput.close();
			workbook1.close();
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		AmazeList myObj = new AmazeList();
		myObj.invokeBrowser();
	   

	}

}
