package hellojava;

public class WhileExercise {
	 public static void main(String[] args) {
	        int num = 10000;
	        int key = 153;
	        int i = 0;
	        int answer = 0;

	        while (i <= num){
	        	
	        	if(i % key == 0){
	        		
	        		answer = i;
	        	}
	        i += 1;
	        }
	    System.out.println("Á¤´äÀº: " + answer);
	        
	    }


}
