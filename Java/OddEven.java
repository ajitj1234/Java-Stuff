package Java;

import java.util.Scanner;

public class OddEven {

	public void numbers() {
	//odd and even no's
		for(int i=1;i<100;i++) {
			
			if(i%2==0) {
				System.out.print("even no's are : " +i);
			}
			else {
				System.out.println("		odd no's are : " +i);
			}
			
		}
		
	
	
	for(int i=1;i<=5;i++) {
		 
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		
	}
		System.out.println("");
	}
	
	for(int k=1;k<=4;k++) {
			for(int l=4;l>=k;l--) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	
	for(int i=1;i<=5;i++) {
		
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		
	}
		System.out.println("");
	
	}
	
	
	for(int i=1;i<=4;i++) {
		for(int j=3;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("m");
		}
		System.out.println("");
	}
	
	
	for(int i=1;i<=100;i++) {
	System.out.print(i+++",");
	}
	
	 
char  str[] = {'a','j','i','t','p'};
	//StringBuilder sb = new StringBuilder(str);
	//sb.reverse();
     int a=str.length;
     System.out.println(a);
	//System.out.println(str[3]);
	for(int i=a-1;i<str.length;i--) {
		if(i<=a & i>=0) {
				System.out.print(str[i]);
		}
	}

	String  str1 = "ajit";
	char[] aj=str1.toCharArray();
    System.out.println(aj.length);
	for(int i=aj.length-1;i>=0;i--) {
		System.out.print(aj[i]);
	}
	

	
	}
	public static void main(String[] args) {
		OddEven Obj = new OddEven();
		Obj.numbers();

	}

}
