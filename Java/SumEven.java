package Java;

public class SumEven {

	//sum of even no's
	public void sum() {
		int sum = 0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				
				sum= sum+i;
	
			}
			
		}System.out.print(sum);
		
		
		//array initialisation 
		int array[] = new int[7];
		for(int i=0;i<7;i++)
		{
			array[i]=i+1;
			System.out.println(array[i]);
			
		}
		
		for(int i=0;i<7;i++) {
			System.out.println("array["+i+"]="+array[i]);
		}
		System.out.println(array.length);
		
		
	}
	
	//array passby reference
	public static void passByReference(String a[])
	{
		a[1]="changed";
	}
		
	public void apple() {
		String []b= {"Apple","mango","Orange"};
		System.out.println("Before function call "+b[0]);
		SumEven.passByReference(b);
		System.out.println("after function call "+b[0]);
	}
	public static void main(String[] args) {
		SumEven Obj =new SumEven();
		Obj.sum();
		Obj.apple();
	}

}
