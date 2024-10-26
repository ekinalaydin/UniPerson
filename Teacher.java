package other;
import java.util.ArrayList;

public class Teacher extends UniPerson {
	private int sicilNo;

	public Teacher(String name, String surname, int sicilNo, int tckNo) {
		super(name,surname, tckNo);
		System.out.println("Teacher Constructor is executed");
		this.sicilNo = sicilNo;
	
	}
	
	public int getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}
	
	public String toString(){
		return "TEACHER:" + sicilNo + " " + super.toString();
	}

}
