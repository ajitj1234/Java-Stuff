package Java;

import java.util.Scanner;

public class Alphabets {

	public void letter() {
	   char array[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				     's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		for(char i=0; i<=26;i++) {
			for(char a=array[i];a<'z';a++)
			{
			System.out.print(a+"");
			}
		
		if(i>0)
		{
			for(char j=0;j<i;j++) 
				System.out.print(array[j]+"");
			
		}
			}
		
			System.out.println("");
			}
			
		
		/*		
		for(char i=65;i<69;i++) {
			for(char j=65;j<69;j++) {
				System.out.print(j);
				
			}
			System.out.println("");
			
		}*/
		
		
/*		  try {
			   char array1[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			     's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
			   char alphamatrix[][] = new char[26][26];
			   int i, j;

			   for (i = 0; i <array1.length; i++) {

			    if (i > 0) {
			     for (j = 0; j <array1.length; j++) {

			      alphamatrix[i][j] = array1[j+1];
			     }
			    } else {
			     
			    for (j = 0; j <array1.length; j++) {

			      alphamatrix[i][j] = array1[j];
			     }
			    }

			   //}

			   System.out.println("Elements in Matrix are : ");
			   System.out.println("");
			   for (i = 0; i <= 25; i++) {
			    for (j = 0; j <= 25; j++) {
			     System.out.print(alphamatrix[i][j] + "\t");
			    }
			    System.out.println();
			   }
			  } catch (NumberFormatException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }*/
		
		
	
	public static void main(String[] args) {
		Alphabets Obj = new Alphabets();
		Obj.letter();

	}

}
