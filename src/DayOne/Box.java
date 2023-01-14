package DayOne;

public class Box {
	
    int l = 10; //12
	int b = 20;  //
	int h = 30; 
	
	Box(int x, int y){
		
		l = x;
		b = y;
	}
	
	Box(){
		
	}
	

	public static void main(String[] args) {
		
	   Box tifin  = new Box(); //10,20,30
	  
	   tifin.l++;
	   tifin.b++;
	   tifin.h++;
	   
	   
	   System.out.println(tifin.l);//11
	   System.out.println(tifin.b);//21
	   System.out.println(tifin.h);//31
	   
	   System.out.println("====================");
	   
	   Box suiteCase = new Box();//11,20,30 
	   
	   System.out.println(suiteCase.l); //
	   System.out.println(suiteCase.b);
	   System.out.println(suiteCase.h);
	   
       System.out.println("====================");
	   
	   Box defectiveTifin = new Box(50,70); // 50, 70,
	   
	   defectiveTifin.l++;
	   defectiveTifin.b++;
	   defectiveTifin.h++;
	   
	   System.out.println(defectiveTifin.l); //12
	   System.out.println(defectiveTifin.b); //21
	   System.out.println(defectiveTifin.h); //31
		
	}
	
	
	
	
	
}
