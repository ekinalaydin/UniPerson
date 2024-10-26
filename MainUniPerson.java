package other;
import java.util.ArrayList;

public class MainUniPerson {

	public static void main(String[] args) {
	
		Student st1 = new Student("Ali", "Veli", 1, 1);
		Teacher tc1 = new Teacher("Ahmet", "Mehmet", 1, 2);
		
		Course crs1 = new Course("SENG102", "Programming 2");
		Course crs2 = new Course("SENG101", "Programming 1");
		Course crs3 = new Course("SENG103", "Programming 3");
		
		st1.addCourse(crs1);
		st1.addCourse(crs2);
		tc1.addCourse(crs3);
		
		
		System.out.println(st1.toString());
		System.out.println(tc1.toString());
		
		boolean res = st1.removeCourse("SENG102");
		System.out.println(res);
		
		UniPerson person = new UniPerson("","", 0);
		person.addCourse(crs1);
		ArrayList<Course> courses = person.courses;
		System.out.println(courses.get(0).code);
	}

}
