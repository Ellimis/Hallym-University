
//Person Ŭ������ ��ӹ޴� Student Ŭ����
public class Student extends Person {
	protected double gpa;
	
	//������
	public Student() {
		gpa = 0.0;
	}
	
	public Student(String name, double gpa) {
		super(name);
		this.gpa = gpa;
	}
	
	//��¹�
	public String toString() {
		final String GPA = "    GPA : ";
		return (name + GPA + gpa);
	}
	
	//���� ���Ͽ� ũ�⿡ ���� return
	public int comparing(Object p) {
		Student s = (Student)p;
		if (gpa > s.gpa) return 1;
		else if (gpa < s.gpa) return -1; 
		else return 0;
	}
}
