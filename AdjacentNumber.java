import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class AdjacentNumber {
	
	int count=0;
	public void star() {
		try {
			/*File fileName = new File("D:\\Java Result\\JAVA Fun\\numbees.txt");
			
		     Scanner scanner = new Scanner(fileName);
		     scanner.useDelimiter("\\Z");
		     System.out.println(scanner.next());
		     	*/	     
		     
		    
		     /*  FileReader reader = new FileReader("D:\\Java Result\\JAVA Fun\\numbees.txt");
	            int character;
	 
	            while ((character = reader.read()) != -1) {
	                System.out.print((char) character);
	            }
	            reader.close();*/
		    
	            FileReader reader = new FileReader("D:\\Java Result\\JAVA Fun\\num.txt");
	            BufferedReader bufferedReader = new BufferedReader(reader);
	            String line = bufferedReader.readLine();
	            
	            System.out.println(line);
               
	            String str = line;
	            System.out.println(str);
	            String strArray[] = str.split("");
	            System.out.println("String converted to String array");
	            
	            int[] array = new int[strArray.length];
	            for(int i=0;i<str.length();i++) {
	            	String str2= strArray[i];
	            	array[i]= Integer.parseInt(str2);
	            System.out.println(array[i]);
	            }
	            System.out.println("integer array");
                                
                for(int j=0; j < array.length; j++){
                     if(array[j]  == array[j]) {
                        
                        System.out.println(array[j]);
                           
                        }
                                        
                    }
               /* boolean[] b = new boolean[array.length];
                for (int j = 1; j < array.length; j++) {
                    if (array[j - 1] == array[j]) {
                        b[j - 1] = b[j] = true;
                        System.out.println(b[j]);
                    }
                }
                
                //for sum of consecutive elements
               int sum= 0;
                for (int j = 0; j < b.length; j++) {
                    if (b[j]) {
                        sum += array[j];
                    }
                }

                System.out.println(sum);*/
                
                
                for(int j=1;j<array.length;j++) {
                	if(array[j-1] == array[j]) {
                		
                		count++;
                		
                		System.out.println(array[j]+" matching element is" +array[j]+array[j]);
                		
                	}
                	
                	}
                	
                System.out.println("\ncount is:"+count);
                    
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public static void main(String[] args) {
		AdjacentNumber obj = new AdjacentNumber();
		obj.star();
			
		
	}


}
