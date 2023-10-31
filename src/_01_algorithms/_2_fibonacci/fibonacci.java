package _01_algorithms._2_fibonacci;

public class fibonacci {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int sum;
//		System.out.println(String.valueOf(num1)+" "+String.valueOf(num2));
		for (int x = 2; x < 10; x++) {
		    sum=num1+num2;    
		    System.out.print(" "+sum);    
		    num1=num2;    
		    num2=sum; 
//			System.out.println(sum);
		}
		
	}

}
