package Java;

public class Random {

	public void largest() {
		try {
			
			int array[]= {1,2,3,4,5,6,9};
			//System.out.println(array[2]);
			for(int i=array[0];i<=array.length;i++) {
				if(array[i]>=array.length) {
					System.out.println("largest no. is:"+ array[i]);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	public static void main(String[] args) {
	/*	for(int i=1;i<=9;i++) {
			System.out.print(i);
		System.out.print("  ");
			if(i==3||i==6)
				System.out.println();
		}*/

		

	Random Obj = new Random();
	Obj.largest();
	}
}
