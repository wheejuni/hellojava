public class GradeCalculator {
	
	ArrayList <Course> CourseList = new ArrayList<>();
	
	String name;
	int prevCredit;
	int credit;
	int grade;
	double prevGpa;
	double finalGpa = 0;
	double creditSum = 0;
	double finalCreditSum = 0;
	double gpaSum = 0;
	
	public GradeCalculator(String name, double prevGpa, int prevCredit){
		this.name = name;
		this.prevGpa = prevGpa;
		this.prevCredit = prevCredit;
	}
	
	
	void addCourse(Course newcourse){
		CourseList.add(newcourse);
		

	}
	
	void prevSemesterGpa(){
		
	}
	
	void CourseInit(){
		setCreditSum();
		calculateGpaSum();
		
	}
	
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
				default:
					gpaTemp = 2.0;
					break;

			}
			gpaStore[i] = gpaTemp;
		}
			for (int z = 0; z < CourseList.size(); z++){
				if (CourseList.get(z).getCourseGroup() == "major") gpaMultiplier = 3;
				if (CourseList.get(z).getCourseGroup() == "general") gpaMultiplier = 2;
				multiplyStore[z] = gpaMultiplier;
				
			}
			
			for (int c = 0; c < gpaStore.length ; c++){
					gpaResult += gpaStore[c] * multiplyStore[c];
					
			}
		
			gpaSum = gpaResult;
		}
	
	
	
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
	
	double calculateTotalGpaEstimate(){
		double prevGpaSum = prevGpa * prevCredit;
		
		return (gpaSum + prevGpaSum) / finalCreditSum;
	}

	
	void print(){
		CourseInit();
		calculateGpaAvg();

		System.out.println(name + " 학생의 평점 계산 결과. 참담합니다.");
		System.out.println("직전 학기 성적: " + prevGpa + " (총 " + prevCredit + "학점)"); 
		
		System.out.println("이번 학기 성적: " + finalGpa + " (총 " + creditSum + "학점)");
		System.out.println("전체 예상 학점: " + calculateTotalGpaEstimate() + " (총 " + finalCreditSum + "학점)");
	}
}
