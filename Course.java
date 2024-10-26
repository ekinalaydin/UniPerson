package other;

public class Course {

	public String code;
	public String title;
	
	public Course(String code, String title) {
		System.out.println("Course constructor is executed");
		this.code = code;
		this.title = title;
	}
	
	public Course() {
		this.code = "";
		this.title = "";
	}
	
	
}
