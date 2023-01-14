package Tutorial;

import java.util.Arrays;

public class TutorialOne {

	public static void main(String[] args) {


		String name = "Akhlesh is a Gupta tutor";
		
		String output = "";
		
		//char[] abc = name.toCharArray();
		
		String[] xyz =   name.split(" ");  //[Akhilesh, is, a, Gupta, tutor]
		
		
		
		//System.out.println(Arrays.toString(xyz));
		
		//System.out.println(xyz[0]);
		//System.out.println(xyz[1]);
		
		for(int i = 0 ; i< xyz.length; i++){
			
		String word = xyz[i]; //
		
		
		StringBuffer wordRev = new StringBuffer(word);
		
		String revWord = wordRev.reverse().toString(); //si
		
        output = output+ revWord+" ";
        
                    
		}	
	
		System.out.println(output);
		
		
		
		
		
		
		
		
		
	}

}
