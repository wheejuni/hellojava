/*숫자 맞추기 게임에 이어, 숫자 야구 게임을 만들려고 합니다. 룰은 다음과 같습니다.

컴퓨터는 0과 9 사이의 서로 다른 세 숫자를 임의의 순서로 뽑습니다. 사용자는 컴퓨터가 뽑은 숫자의 값과 위치를 맞추려고 합니다.
컴퓨터는 사용자가 입력한 세 숫자에 대해서, 아래의 규칙대로 스트라이크(S)와 볼(B)의 개수를 알려줍니다.

숫자의 값과 위치가 모두 일치하면 S입니다.
숫자의 값은 일치하지만 위치가 틀렸으면 B입니다.
예를 들어 컴퓨터가 1, 2, 3을 생성하였는데, 사용자가 1, 3, 5를 입력하면, 1S(1의 값과 위치가 일치) 1B(3의 값만 일치)입니다.
기회는 무제한입니다. 하지만 몇번의 시도 끝에 맞췄는지 기록됩니다.
3S(세 숫자의 값과 위치를 모두 맞춘 경우)일 때 게임이 끝납니다.
진행 방식

"0과 9 사이의 서로 다른 세 숫자를 랜덤한 순서로 뽑았습니다."가 출력됩니다.
"세 수를 하나씩 차례대로 입력하세요."가 출력됩니다.
"1번째 수를 입력하세요: "가 출력되고, 사용자로부터 입력을 받습니다. 마찬가지로 "2번째 수를 입력하세요: ", "3번째 수를 입력하세요: "가 출력되고, 사용자로부터 각각 입력을 받습니다. 만약 사용자가 중복되는 수를 입력하거나 범위에 벗어나는 수를 입력할 경우, 사용자로부터 입력을 다시 받습니다.
사용자가 올바르게 서로 다른 세 수를 입력한 경우, 규칙에 따라 "*S *B"가 출력됩니다. 만약 3S가 아닌 경우 (2)번줄부터 다시 진행됩니다.
사용자가 3S를 달성했을 때, "축하합니다. *번 만에 세 숫자의 값과 위치를 모두 맞추셨습니다."가 출력됩니다.
예시는 아래와 같습니다.*/

package hellojava;
import java.util.*;


class makearray{
	
	int [] throwball(){
		Random randomize=new Random();
		
		int ballcontrol[]=new int [3];
		for (int i=0;i<ballcontrol.length;i++){
			ballcontrol[i] = randomize.nextInt(9);
			
			for (int j=0;j<i;j++){
				if (ballcontrol[i] == ballcontrol[j]){
					i = i -1;	
				}
				
			}
			
			}
			
		Arrays.sort(ballcontrol);
		
		return ballcontrol;	
	}
}

class userball{
	
	int [] userthrows(){
		
				
		int userball[] = new int [3];
		Scanner makeinput=new Scanner(System.in);
		for (int z=0;z<userball.length;z++){
			System.out.println((z+1)+"번째 공을 던지세요!");
			userball[z] = makeinput.nextInt();			
		}
		return userball;
		
		
	}
	
}

class umpire{
	int strike_count(int []a, int []b){
		int strikecount = 0;
		
		int computerball[] = new int [3];
		int userthrewball[] = new int [3];
		
		computerball = a;
		userthrewball = b;
		
		for(int n=0;n<computerball.length;n++){
			
			if (computerball[n] == userthrewball[n]){
				strikecount += 1;
			}
		}
		
		
		
		return strikecount;
	}
	
	int ball_count(int []a, int []b){
		int ball_count=0;
		int userball1; int userball2; int userball3;
		int computerball1; int computerball2; int computerball3;
		
		int computersball[] = new int [3];
		int usersball[] = new int [3];
		
		computersball = a;
		usersball = b;
		
		userball1 = usersball[0]; userball2= usersball[1]; userball3= usersball[2];
		computerball1 = computersball[0]; computerball2 = computersball[1]; computerball3 = computersball[2];
		
		Arrays.sort(computersball);
		
		if (Arrays.binarySearch(computersball, userball1) >= 0 && usersball[0] != computersball[0] ){
			ball_count += 1;
			
		}
		
		if (Arrays.binarySearch(computersball, userball2) >= 0 && usersball[1] != computersball[1]) {
			ball_count += 1;
			
		}
	
		if (Arrays.binarySearch(computersball, userball3) >= 0 && usersball[2] != computersball[2]){
			ball_count += 1;
			
		}
		
		return ball_count;
		
		
	}
}


public class NumBaseball {
	
	public static void main (String args[]){
		
		int [] computer_ball = new int [3];
		int [] user_ball = new int [3];
		int strikecall=0;
		int ballcount=0;
		
		makearray printcomputerball=new makearray();
		computer_ball = printcomputerball.throwball();
		
		
		
		userball printuserball=new userball();
		System.out.println("=============================================");
		System.out.println("재미 있는 숫자 야구 게-임");
		System.out.println("당신의 논증력과 추리력을 평가하겠다");
		System.out.println("규칙: 당신이 알아맞힐 숫자는 0~9까지의 정수입니다.");
		System.out.println("=============================================");
		user_ball = printuserball.userthrows();
		
	
		umpire ballpanjeong=new umpire();
		int chance=0;
		while (chance<4){
			
		
			strikecall = ballpanjeong.strike_count(computer_ball, user_ball);
			ballcount = ballpanjeong.ball_count(computer_ball, user_ball);
			if (strikecall == 3){
				System.out.println("삼진 아웃!");
				break;
				
			}
			else {System.out.println("당신의 투구내용은 "+Arrays.toString(user_ball)+"입니다.");
				System.out.println("스뚜라익! 현재 "+strikecall+"S "+ballcount+"B 입니다. ("+(chance+1)+"번째 타석)");
			}
			
			user_ball = printuserball.userthrows();
			
			chance += 1;
					
			if (chance == 3){
				System.out.println("다음 기회에.... 답은 "+Arrays.toString(computer_ball)+"이었습니다.");
				break;
			}
			
			
			
		}
		
	
		}
			
		}
	


