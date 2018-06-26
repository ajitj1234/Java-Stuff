package Java;

import java.io.File;
import java.util.Random;

import org.apache.commons.io.FileUtils;

public class FileCreation {
	 



	public static void main(String[] args) {
		
		try {
			File folder = new File("D:\\Auto Work\\First Folder");
			folder.mkdir();		
			
			
			System.out.println("Folder is created\n");
			/*File folder1 = new File("D:\\Auto Work\\Ajit Folder");
			folder1.mkdir();
			
			File folder2 = new File("D:\\Auto Work\\Radha Folder");
			folder2.mkdir();
			File folder3 = new File("D:\\Auto Work\\Ananya Folder");
			folder3.mkdir();*/
			
			
			/*for(int i=0; i<10; i++) {
			File f1 = new File("D:\\Auto Work\\First Folder\\ajit" +i+ ".txt");
			File f2 = new File("D:\\Auto Work\\First Folder\\radha" +i+ ".xlsx");
			File f3 = new File("D:\\Auto Work\\First Folder\\sujit" +i+ ".pdf");
			if(f1.createNewFile() & f2.createNewFile() & f3.createNewFile()) {
				System.out.println("File is created");	
				
			
			}			
			else {
				System.out.println("File is not created");
			}
			}
			*/
			Random rn = new Random();
			int minimum=65;
			int maximum=91;
			
			for(int j=1; j<10; j++) {
				int n =  maximum - minimum + 1;
				int i = rn.nextInt(n);
				int randomNum =  minimum + i;
				File f1 = new File("D:\\Auto Work\\First Folder\\" +(char)randomNum+ ".txt");
				f1.createNewFile();
			}
				
			File folder4 = new File("D:\\Auto Work\\First Folder");
			File[] listOfFiles = folder4.listFiles();

			
			    for (int i = 0; i < listOfFiles.length; i++) {
			    	
			      if (listOfFiles[i].isFile()) {
			        System.out.println("File " + listOfFiles[i].getName());
			        String str = listOfFiles[i].getName().substring(0, 1);
			        System.out.println(str);
			        File dir = new File("D:\\Auto Work\\" + str);
			        dir.mkdir();			    			        
		       
				      FileUtils.copyFileToDirectory((listOfFiles[i]), dir);
			       
			      } else if (listOfFiles[i].isDirectory()) {
			        System.out.println("Directory " + listOfFiles[i].getName());
			      }
			    }
			    
			    
		/*	File f1=new File("D:\\Auto Work\\First Folder\\ajit.txt");
			if(f1.createNewFile()) {
				if(f1.renameTo(new File("D:\\Auto Work\\Ajit Folder\\ajit.txt")))
				
				System.out.println("Text file created");
				
			}
			File f2=new File("D:\\Auto Work\\First Folder\\radha.pdf");
			if(f2.createNewFile()) {
				if(f2.renameTo(new File("D:\\Auto Work\\Radha Folder\\radha.pdf")))
				System.out.println("PDF file created");
				
			}
			
			
			
			File f3=new File("D:\\Auto Work\\First Folder\\ananya.xlsx");
			if(f3.createNewFile()) {
				if(f3.renameTo(new File("D:\\Auto Work\\Ananya Folder\\ananya.xlsx")))
				System.out.println("Excel file created");
				
			}*/
			
			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*
		int A=65;
		char value = 'A';
		for(int i=65;i<91;i++) {
			File folder = new File("D:\\Auto Work\\FileFolder" +i+".txt");
			//folder.mkdir();	
		}*/
			
			
			
		
		
	}

}
