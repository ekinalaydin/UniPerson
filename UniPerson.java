package other;
import java.util.ArrayList;

public class UniPerson {
	private String name;
	private String surname;
	private int tckNo;
	protected ArrayList<Course> courses;
	
	
	
	public UniPerson(String name, String surname, int tckNo) {
		System.out.println("UniPerson constructor is executed");
		this.name = name;
		this.surname = surname;
		this.tckNo = tckNo;
		courses = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getTckNo() {
		return tckNo;
	}

	public void setTckNo(int tckNo) {
		this.tckNo = tckNo;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	
	public void addCourse(Course crs) {
		courses.add(crs);
	}
	
	public boolean removeCourse(String courseCode) {
		for(Course crs:courses) {
			if(crs.code.equals(courseCode)) {
				return courses.remove(crs);
			}
		}
		return false;
	}

	public String toString() {
       String res =  tckNo + " " + name + " " + surname + " ";
       for(Course crs: courses){
    	   res += " " + crs.code;
       }
       
       return res;
    }
	
	
	
	
	
	
	
	
	
	
}
