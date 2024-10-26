package other;

public class Student extends UniPerson{
	
	private int stNumber;

	public Student(String name, String surname, int stNumber, int tckNo) {
		super(name, surname, tckNo);
		System.out.println("Student constructor is executed");
		this.stNumber = stNumber;
	}

	public int getStNumber() {
		return stNumber;
	}

	public void setStNumber(int stNumber) {
		this.stNumber = stNumber;
	}
	
	@Override
	public void addCourse(Course crs) {
		for(Course course: courses) {
			if(course.code.equals(crs.code))
				return;
		}
		super.addCourse(crs);
	}
	
	public void addCourse(String title, String code) {
		Course crs = new Course(code, title);
		addCourse(crs);
	}
	
	public String toString(){
		return "STUDENT:" + stNumber + " " + super.toString();
	}
	
	
	
}
