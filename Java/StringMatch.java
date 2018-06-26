package Java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StringMatch {
	String equal;
	public void match() throws IOException {
		try {
			FileReader reader = new FileReader("D:\\Java Result\\JAVA Fun\\java.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            
            System.out.println(line + "\nlength is " +line.length());
			
            String str = line;
           
            String strArray[] = str.split("");
            int i = 0;
			System.out.println("String converted to String array" +strArray);
			
            System.out.println(strArray[i+2]);
            System.out.println(strArray.length); 
			int a = strArray.length;
			System.out.println(a); 
			
			
           System.out.println("Enter string");
			Scanner scan = new Scanner(System.in);
			String string = scan.nextLine();
			System.out.println("string is :" +string);
				   
			String strArray1[] = string.split("");
			
			
			int diff1=line.length()-string.length(); 
			System.out.println("diff is "+ diff1);
			
			for(int j=0;j<diff1;j++) {
			string= string+string.charAt(j);
			}
			System.out.println(string);
			
			
			/*//second method
			int count = line.length() / string.length();
			System.out.println("count" +count);
			   for(int k = 0; k < count; k++) 
			    string = string +string;
			   System.out.println("string is "+ string);
			   if (line.length() < (string.length())) {
			    int dif = string.length() - line.length();
			    string = string.substring(0, (string.length() - dif));
			    System.out.println(string);
				
			
			   }*/		
					
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		StringMatch obj =new StringMatch();
		try {
			obj.match();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
