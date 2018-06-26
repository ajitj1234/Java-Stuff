	
	import java.io.File;
	import java.io.FileInputStream;

	import java.io.FileOutputStream;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class CorruptFile {	

	 public static void main(String[] args){
	 try {
	  
	  String filePath = "D:\\Shop1.xlsx";
	  
	  File A = new File(filePath);
	  FileInputStream fis = new FileInputStream(A);
	 
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  
	  XSSFSheet Sheet1= wb.getSheetAt(0);
	  
	  
	  Sheet1.getRow(0).createCell(2).setCellValue("Meg");

	  FileOutputStream fos = new FileOutputStream(A);
	  
	  wb.write(fos);
	  fos.close();
	  wb.close();
	  
	 }
	 catch(Exception e)
	 {
	  e.getMessage();
	  }
	 }
	}


