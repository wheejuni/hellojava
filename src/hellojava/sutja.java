package hellojava;
import java.util.*;

class randint{
	
	int createrandint(){
	int a=0;
	Random random=new Random();
	
	
	a=random.nextInt(20);
	
	
	return a;	
		
	}
	
	
		
}

class chulje{
	
	int chance(){
		
		int chance1=0;
		Scanner chance2=new Scanner(System.in);
		
		
		System.out.println("몇 번의 기회를 줄 생각입니까.");
		chance1=chance2.nextInt();
		
		return chance1;
		
		
		
	}
	
}



public class sutja {
	
	public static void main(String args[]){
		
		int number=0;
		int repeat=0;
		int answer=0;
		
		Scanner answerinput=new Scanner(System.in);
		
		
		randint createrandom=new randint();
		number=createrandom.createrandint();
		
		
		chulje fetchquestion=new chulje();
		repeat=fetchquestion.chance();
		
		for (int i=0;i<repeat;i++){
			
		
			
			System.out.println(repeat-i+"번의 기회가 남았습니다. 숫자를 맞혀보세요. 힌트: 20 이하임.");
			answer=answerinput.nextInt();
			if (answer == number){
				System.out.println("당신은 천재입니다. "+(i+1)+"번만에 이걸 맞췄음. 개천재");
				break;}
			
			if (i == repeat-1){
				
				System.out.println("ㅄ");
				break;	
				}
					
				
				
				else if (answer < number){
					System.out.println("좀만 더 써보세요");
					
				}
				else if (answer > number){
					System.out.println("너무 많이 썼음");
				}
			
		
				
					
				}

	
	}
}
		
	
	
	
	
		
		
	


