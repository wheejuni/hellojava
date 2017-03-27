package hellojava;

public class Course {
	
	private String name;
	private String grade;
	private String courseGroup;
	static String CREDIT_GENERAL = "general";
	static String CREDIT_MAJOR = "major";
	
	public Course(String name, String course, String grade){
		this.name = name;
		this.courseGroup = course;
		this.grade = grade;
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
