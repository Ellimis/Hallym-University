
//Person 클래스를 상속받는 Student 클랫스
public class Student extends Person {
	protected double gpa;
	
	//생성자
	public Student() {
		gpa = 0.0;
	}
	
	public Student(String name, double gpa) {
		super(name);
		this.gpa = gpa;
	}
	
	//출력문
	public String toString() {
		final String GPA = "    GPA : ";
		return (name + GPA + gpa);
	}
	
	//값을 비교하여 크기에 따라 return
	public int comparing(Object p) {
		Student s = (Student)p;
		if (gpa > s.gpa) return 1;
		else if (gpa < s.gpa) return -1; 
		else return 0;
	}
}
