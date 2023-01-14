package OopsDemo;

public class ParentDemo {

	 int balance = 100000000;
	 
	 public void sum(){
		 
		 System.out.println("Hello Sum There is some modifications");
		 
	 }
	 
}


class Tutorial extends ParentDemo{
	
	public void mul(){
		
		 System.out.println("Hi Mul");
		
	}
	
   
	
	
	
}


class ABC extends Tutorial{
	

}