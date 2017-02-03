package hellojava;
import java.util.Scanner;



public class IfElseExercise {
	
	    public static void main(String[] args) {
	    	
	    	Scanner scankey = new Scanner(System.in);
	    	System.out.println("숫자를 입력하세요. a: ");
	    	int a = scankey.nextInt();
	    	System.out.println("숫자를 입력하세요. b: ");
	    	int b = scankey.nextInt();
	    	
	    	
	     
	       if (a == b){
	    	   System.out.println("a와 b가 같습니다. a = b = " + a);}
	       else if (a > b){
	    	   System.out.println("a와 b는 같지 않습니다.");
	    	   System.out.println("a가 b보다 " + (a - b) + "만큼 더 큽니다.");}
	       else if (b > a){
	    	   System.out.println("a와 b는 같지 않습니다.");
	    	   System.out.println("b가 a보다 " + (b - a) + "만큼 더 큽니다.");}
	       }
	    }
	


