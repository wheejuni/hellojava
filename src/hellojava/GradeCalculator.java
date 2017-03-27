package hellojava;	
import java.util.*;

	public class GradeCalculator {
		
		ArrayList <Course> CourseList = new ArrayList<>();//과목을 입력받을 ArrayList 선언
		
		String name;
		int prevCredit;//직전학기까지 이수학점
		int grade;//성적
		double prevGpa;//직전학기까지 평점
		double finalGpa = 0;//최종 평점
		double creditSum = 0;//당해학기 이수학점 합계
		double finalCreditSum = 0;//총 이수학점 합계
		double gpaSum = 0;//총 평점
		
		public GradeCalculator(String name, double prevGpa, int prevCredit){
			this.name = name;
			this.prevGpa = prevGpa;
			this.prevCredit = prevCredit;
		}
		void addCourse(Course newcourse){
			CourseList.add(newcourse);
		}
		
		//각 과목별 초기화
		void CourseInit(){
			setCreditSum();
			calculateGpaSum();
			
		}
		//이번학기 평점 계산
		void calculateGpaSum(){
			
			double gpaResult = 0;
			String getGpaAlphabet;
			int gpaMultiplier = 0;
			
			double gpaStore [] = new double[CourseList.size()];
			double multiplyStore [] = new double[CourseList.size()];

			for (int i = 0; i < CourseList.size(); i++){
				double gpaTemp = 0;
				getGpaAlphabet = CourseList.get(i).getGpa();
				
				switch(getGpaAlphabet){
					case "A+":
						gpaTemp = 4.5;
						break;
					case "A":
						gpaTemp = 4.0;
						break;
					case "B+":
						gpaTemp = 3.5;
						break;
					case "B":
						gpaTemp = 3.0;
						break;
					case "C+":
						gpaTemp = 2.5;
						break;
					//C+ 아래는 2.0으로 처리.
					default:
						gpaTemp = 2.0;
						break;

				}
				gpaStore[i] = gpaTemp;//등급-평점 환산치를 Array gpaStore에 저장 
			}
				for (int z = 0; z < CourseList.size(); z++){
					if (CourseList.get(z).getCourseGroup() == "major") gpaMultiplier = 3;
					if (CourseList.get(z).getCourseGroup() == "general") gpaMultiplier = 2;
					multiplyStore[z] = gpaMultiplier;//전공-교양 학점 가중치를 multiplyStore에 저장
					
				}
				
				for (int c = 0; c < gpaStore.length ; c++){
						gpaResult += gpaStore[c] * multiplyStore[c];//차례대로 곱한 후 gpaResult에 저장
						
				}
			
				gpaSum = gpaResult;//gpaSum에 저장
			}
		
		
		//이수학점 합계 계산
		void setCreditSum(){
			double tempSum = 0;
			
			for (int i = 0; i < CourseList.size(); i++){
				if (CourseList.get(i).getCourseGroup() == "major") tempSum += 3;
				else if (CourseList.get(i).getCourseGroup() == "general") tempSum += 2;
				
			}
		creditSum = tempSum;
		finalCreditSum = prevCredit + creditSum;
		}

		void calculateGpaAvg(){		
			this.finalGpa = gpaSum / creditSum;

		}
		//이전학기 합산 평점 계산
		double calculateTotalGpaEstimate(){
			double prevGpaSum = prevGpa * prevCredit;
			
			return (gpaSum + prevGpaSum) / finalCreditSum;
		}

		//결과 표시
		void print(){
			CourseInit();
			calculateGpaAvg();

			System.out.println(name + " 학생의 평점 계산 결과. 참담합니다.");
			System.out.println("직전 학기 성적: " + prevGpa + " (총 " + prevCredit + "학점)"); 
			
			System.out.println("이번 학기 성적: " + finalGpa + " (총 " + creditSum + "학점)");
			System.out.println("전체 예상 학점: " + calculateTotalGpaEstimate() + " (총 " + finalCreditSum + "학점)");
		}
	}


