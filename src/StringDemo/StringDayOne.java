package StringDemo;

import java.util.Scanner;

public class StringDayOne {

	public static void main(String[] args) {
		
		Scanner abc = new Scanner(System.in);
		
		System.out.println("Please enter the value of a");
		
		int a = abc.nextInt();
		
        System.out.println("Please enter the value of b");
		
		int b = abc.nextInt();
		
		System.out.println(" Total Sum : "+(a+b));
			
		/*int n = abc.nextInt();
		
		//5*4*3*2*1 = 120
		
		int fact = 1;
		
		for(int i = n; i>0; i--){
			
			fact =fact* i; //5*4*3*2*1
			
		}
		
		
		System.out.println(fact);
		*/

	}

}
