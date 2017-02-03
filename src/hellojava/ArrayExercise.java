package hellojava;

public class ArrayExercise {
	public static void main (String args[]){
		int [] intArray = new int [30];
		String remainders [] = new String[4];
		remainders [0] = "zero";
		remainders [1] = "one";
		remainders [2] = "two";
		remainders [3] = "three";
		
		
		int insertnum = 1001;
		for(int i = 0; i < 30; i++){
			intArray[i] = insertnum + i;
		}
		
		for (int i = 0; i < intArray.length; i++){
			switch(intArray[i] % 4){
			case 0: 
				System.out.println(remainders [0]);
				break;
			case 1:
				System.out.println(remainders [1]);
				break;
			case 2:
				System.out.println(remainders [2]);
				break;
			case 3:
				System.out.println(remainders [3]);
				break;
			}
			
			
		}
	}
	

}
