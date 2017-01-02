package educast;
import java.util.Scanner;




public class gpa {
	public static void main(String []args){
		
		
		
		float gpa;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("당신의 이수학점을 입력하세요");
		int total=scanner.nextInt();
		
		System.out.println("당신의 이번학기 수강과목은 총 몇개입니까?");
		int subjectcount=scanner.nextInt();
		
		float subjectgrade[]=new float [subjectcount];
		
		for (int n=0;n<subjectcount;n++){
			
			System.out.println(n+1+"번째 과목의 등급을 입력하여 주십시오");
			System.out.println("등급은 평점으로 입력하여 주십시오.");
			System.out.println("A+는 4.5, A는 4, B+은 3.5,B는 3, C+은 2.5 입니다");
				subjectgrade[n]=scanner.nextFloat();
				
		}
		
		float gradesum=0;
		
		for (int j=0;j<subjectgrade.length;j++){
		gradesum+=subjectgrade[j];
		
		
			
		}
		
		gpa=gradesum/subjectcount;
		System.out.println("당신의 이번학기 전공 평점은 "+gpa+"입니다. ㅅㄱ");
		
	}

}
