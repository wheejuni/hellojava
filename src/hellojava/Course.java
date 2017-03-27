package hellojava;

public class Course {
	
	private String name;
	private String grade;
	private String courseGroup;
	static String CREDIT_GENERAL = "general";
	static String CREDIT_MAJOR = "major";
	
	public Course(String a, String b, String c){
		this.name = a;
		this.courseGroup = b;
		this.grade = c;
	}
	
	String getName(){
		return this.name;
	}
	
	String getGrade(){
		return this.grade;
	}
	
	String getCourseGroup(){
		return this.courseGroup;
	}
	
	String getGpa(){
		return this.grade;
	}
}
