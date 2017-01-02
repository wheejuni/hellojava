package educast;
import java.util.*;

class billcalc{
	
	void billcalc1(int f){
	
	int geoseureum=0;
	
	
	geoseureum=f;
	

	int changebill []=new int [4];
	changebill[0]=50000;
	changebill[1]=10000;
	changebill[2]=5000;
	changebill[3]=1000;
	
	
	for (int z=0;z<changebill.length;z++){
		System.out.println(changebill[z]+"원:"+geoseureum/changebill[z]+"개");
		geoseureum=geoseureum%changebill[z];
		
		
		
	}
	
	}
	
}

public class geoseureum {
	
	int calculation (int payment, int cost){
		int charge=0;
		
		charge=payment-cost;
		
		return charge;
		
	}

	
	public static void main (String []args){
		
		int eolma1;
		
		
		
		int jipyeoption;
		int jipyecount;
		int sum = 0;
		int result=0;
		int option1=0;
		
		
		
		Scanner eolma=new Scanner(System.in);
		Scanner jipye=new Scanner(System.in);
		Scanner count=new Scanner(System.in);
		Scanner option=new Scanner(System.in);
		
		
		System.out.println("당신이 얼마짜리 물건을 팔았는가.");
		eolma1=eolma.nextInt();
		
		System.out.println("손놈이 총 몇장의 지폐를 지불했는가");
		jipyecount=count.nextInt();
		
		
		int jipye1[]=new int[jipyecount];
		
		for (int n=0;n<jipyecount;n++){
			System.out.println("손놈이 어떤 지폐를 지불했는지 입력하라. (지폐 "+jipyecount+"장 중 "+(n+1)+"번째 장)");
			System.out.println("1부터 5 사이의 정수로 입력하라. 1. 1000원 2. 5000원 3. 10000원 4. 50000원");
			jipyeoption=jipye.nextInt();
				switch(jipyeoption){
				
				case 1: jipye1[n]=1000;
				break;
				
				case 2: jipye1[n]=5000;
				break;
				
				case 3: jipye1[n]=10000;
				break;
				
				case 4: jipye1[n]=50000;
				break;
				
				
				
				}
		
		}
			
		for (int i=0;i<jipye1.length;i++){
			
			sum=sum+jipye1[i];
			
		}
			
		if (sum<eolma1){
			System.out.println("당신이 받아야할 돈은 "+eolma1+"인데 당신이 실제로 받은 돈은 "+sum+"에 불과하다.");
			System.out.println("당신은 호구인가? 뇌는 콧물 만드는 기계가 아니다.");
			
		}
		
		
		geoseureum finalcalc=new geoseureum();
		result=finalcalc.calculation(sum, eolma1);
		
		if (sum<eolma1){
			System.out.println("당신이 더 받아야할 금액은 "+Math.abs(result)+"원이다.");
		
			
			
		
		}
		
		else {
			System.out.println("손놈이 지불한 금액의 합계는 "+sum+"원이다.");
			System.out.println("당신이 거슬러줘야할 금액은 "+result+"원이다.");
			System.out.println("만약 당신이 너무나 빡대가리여서 얼마 짜리를 몇 장 거슬러줘야하는 것 까지 계산코자 한다면,");
			System.out.println("1을 입력하라.");
			option1=option.nextInt();
			
		
		}
		
		if (option1==1){
			
			billcalc finalresult = new billcalc();
			finalresult.billcalc1(result);
			
		
		}
		
		else {
			System.out.println("머리가 보기보다 좋구만");
		}
			
		}
		
}

		
		
		
				
		
	

	
	
	
	


