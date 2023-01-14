package OopsDemo;

public class PolymorphismDemo {
	
	//Overload, //Override
	
	//Overload-> same method name but diff. parameter
	//Override-> same method name and same parameter // but return type should be same, 
	//           child class accessbility should be greater than or equal of parent class

	
public void sum(int a, int b){
		System.out.println("Sum of a,b: "+(a+b));
	}	

}

class ABCD extends PolymorphismDemo{
	
 public void sum(int x, int y){
		System.out.println("Hi hello");
		
	}

}
