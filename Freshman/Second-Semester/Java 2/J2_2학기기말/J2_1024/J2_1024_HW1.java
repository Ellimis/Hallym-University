
//�߻� Ŭ����
abstract class Person {
	protected String name;
	
	//�̸��� ���־����� �� ������
	public Person() {
		name = "";
	}
	
	//�̸��� �־����� �� ������
	public Person(String name) {
		this.name = name;
	}
	
	//�߻� �޼ҵ� �ΰ�
	public abstract int compare(Person p);
	public abstract boolean equals(Person p);
}

//�߻�Ŭ������ ��ӹ��� Student Ŭ����
class Student extends Person {
	protected double gpa;
	
	//�־��� �̸��� ���� �� ������
	public Student() {
		super();
	}
	
	//�־��� �̸��� ���� �� ������
	public Student(String name, double gpa) {
		super(name);
		this.gpa = gpa;
	}
	
	//���� ��ü�� ���޹��� ��ü���� gpa ��
	public int compare (Person p) {
		if(this.gpa > ((Student)p).gpa) return 1;
		else if(this.gpa < ((Student)p).gpa) return -1;
		else return 0;
	}
	
	//���� ��ü�� ���޹��� ��ü���� gpa ������ �Ǵ�
	public boolean equals (Person p) {
		if(this.gpa == ((Student)p).gpa) return true;
		else return false;
	}
	
	//��½� ���� ����
	public String toString() {
		return "Student Name = " + name + ",  GPA: " + gpa;
	}
}

//�߻�Ŭ������ ��ӹ��� Employee Ŭ����
class Employee extends Person {
	protected double grossPay;
	
	//�־��� �̸��� ���� �� ������
	public Employee() {
		super();
	}
	
	//�־��� �̸��� ���� �� ������
	public Employee(String name, double grossPay) {
		super(name);
		this.grossPay = grossPay;
	}
	
	//���� ��ü�� ���޹��� ��ü���� grossPay ũ�� ��
	public int compare (Person p) {
		if(this.grossPay > ((Employee)p).grossPay) return 1;
		else if(this.grossPay < ((Employee)p).grossPay) return -1;
		else return 0;
	}
	
	//���� ��ü�� ���޹��� ��ü���� grossPay�� ������ �Ǵ�
	public boolean equals (Person p) {
		if(this.grossPay == ((Employee)p).grossPay) return true;
		else return false;
	}
	
	//��½� ���� ����
	public String toString() {
		return "Employee Name = " + name + ",  $" + grossPay;
	}
}

//���� ��ü�� ���ؼ� ���İ� Ž���� �� �� �ִ� Ŭ����
class Ars {
	//���� �޼ҵ� �ΰ�, ����� Ŭ�����̸�.�޼ҵ��̸�
	//���޹��� �迭���� ���޹��� key�� gpa �Ǵ� grossPay���� ���� �� �� �ε����� ��ȯ
	public static int sequentialSearch(Person[] a, Person key) {
		int ind = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(key instanceof Student) {
				if((a[i]).equals(key)) ind = i;
			} else {
				if((a[i]).equals(key)) ind = i;
			}
		}
		return ind;
	}
	
	//���޹��� �迭���� ������������ gpa�Ǵ� grossPay ���� ����
	public static void sort(Person[] p) {
		int min;
		
		for(int i = 0; i < p.length-1; i++) {
			min = i;
			for(int j = 1+i; j < p.length; j++) {
				if(p[i] instanceof Student) {
					if((p[i]).compare(p[j]) == 1) min = i;
					else if((p[i]).compare(p[j]) == -1) min = j;
					else min = j;
				} else {
					if((p[i]).compare(p[j]) == 1) min = i;
					else if((p[i]).compare(p[j]) == -1) min = j;
					else min = j;
				}
				Person temp;
				temp = p[i];
				p[i] = p[min];
				p[min] = temp;
			}
		}
	}
}

public class J2_1024_HW1 {
	public static void main(String[] args) {
		//�л��� ���� ��ü �迭 ����
		Student[] s = new Student[10];
		Employee[] e = new Employee[10];
		
		//�л� 10�� ���� �ֱ�
		s[0] = new Student("Kim", 2.3);
		s[1] = new Student("Lee", 3.0);
		s[2] = new Student("Park", 1.3);
		s[3] = new Student("Choi", 4.0);
		s[4] = new Student("Jung", 3.1);
		s[5] = new Student("Seok", 4.4);
		s[6] = new Student("Yoon", 3.7);
		s[7] = new Student("Cho", 3.9);
		s[8] = new Student("Ryu", 3.2);
		s[9] = new Student("Ji", 2.7);
		
		//���� 10�� ���� �ֱ�
		e[0] = new Employee("Kim", 300.0);
		e[1] = new Employee("Lee", 450.0);
		e[2] = new Employee("Park", 200.0);
		e[3] = new Employee("Choi", 440.0);
		e[4] = new Employee("Jung", 700.0);
		e[5] = new Employee("Seok", 250.0);
		e[6] = new Employee("Yoon", 100.0);
		e[7] = new Employee("Cho", 650.0);
		e[8] = new Employee("Ryu", 500.0);
		e[9] = new Employee("Ji", 310.0);
		
		//�л� ������ ����ִ� ���� �˱� ���� ����
		int ind;
		
		//�л� ���� �˻�
		ind = Ars.sequentialSearch(s, new Student("", 3.9));
		
		//�л� ������ �ִ� �ε��� �� ���
		if(ind > 0) System.out.println(s[ind]);
		else System.out.println("Not Found");
		
		//�л� ���� �������� ����
		System.out.println();
		Ars.sort(s);
		
		//�������� ������ �迭 ���
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("-----------------------------------");
		
		//���� ���� �˻�
		ind = Ars.sequentialSearch(e, new Employee("", 650.0));
		
		//���� ������ �ִ� �ε��� �� ���
		if(ind > 0) System.out.println(e[ind]);
		else System.out.println("Not Found");
		
		//���� ���� �������� ����
		System.out.println();
		Ars.sort(e);
		
		//�������� ������ �迭 ���
		for(int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
	}
}
