
//추상 클래스
abstract class Person {
	protected String name;
	
	//이름이 안주어졌을 떄 생성자
	public Person() {
		name = "";
	}
	
	//이름이 주어졌을 때 생성자
	public Person(String name) {
		this.name = name;
	}
	
	//추상 메소드 두개
	public abstract int compare(Person p);
	public abstract boolean equals(Person p);
}

//추상클래스를 상속받은 Student 클래스
class Student extends Person {
	protected double gpa;
	
	//주어진 이름이 없을 때 생성자
	public Student() {
		super();
	}
	
	//주어진 이름이 있을 때 생성자
	public Student(String name, double gpa) {
		super(name);
		this.gpa = gpa;
	}
	
	//현재 객체와 전달받은 객체에서 gpa 비교
	public int compare (Person p) {
		if(this.gpa > ((Student)p).gpa) return 1;
		else if(this.gpa < ((Student)p).gpa) return -1;
		else return 0;
	}
	
	//현재 객체와 전달받은 객체에서 gpa 같음을 판단
	public boolean equals (Person p) {
		if(this.gpa == ((Student)p).gpa) return true;
		else return false;
	}
	
	//출력시 편한 선언
	public String toString() {
		return "Student Name = " + name + ",  GPA: " + gpa;
	}
}

//추상클래스를 상속받은 Employee 클래스
class Employee extends Person {
	protected double grossPay;
	
	//주어진 이름이 없을 때 생성자
	public Employee() {
		super();
	}
	
	//주어진 이름이 있을 때 생성자
	public Employee(String name, double grossPay) {
		super(name);
		this.grossPay = grossPay;
	}
	
	//현재 객체와 전달받은 객체에서 grossPay 크기 비교
	public int compare (Person p) {
		if(this.grossPay > ((Employee)p).grossPay) return 1;
		else if(this.grossPay < ((Employee)p).grossPay) return -1;
		else return 0;
	}
	
	//현재 객체와 전달받은 객체에서 grossPay가 같은지 판단
	public boolean equals (Person p) {
		if(this.grossPay == ((Employee)p).grossPay) return true;
		else return false;
	}
	
	//출력시 편한 선언
	public String toString() {
		return "Employee Name = " + name + ",  $" + grossPay;
	}
}

//현재 객체에 관해서 정렬과 탐색을 할 수 있는 클래스
class Ars {
	//동적 메소드 두개, 선언시 클래스이름.메소드이름
	//전달받은 배열에서 전달받은 key의 gpa 또는 grossPay값이 같을 때 그 인덱스를 반환
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
	
	//전달받은 배열에서 내림차순으로 gpa또는 grossPay 값을 정렬
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
		//학생과 직원 객체 배열 생성
		Student[] s = new Student[10];
		Employee[] e = new Employee[10];
		
		//학생 10명 정보 넣기
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
		
		//직원 10명 정보 넣기
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
		
		//학생 정보가 들어있는 곳을 알기 위한 변수
		int ind;
		
		//학생 정보 검색
		ind = Ars.sequentialSearch(s, new Student("", 3.9));
		
		//학생 정보가 있는 인덱스 값 출력
		if(ind > 0) System.out.println(s[ind]);
		else System.out.println("Not Found");
		
		//학생 정보 내림차순 정렬
		System.out.println();
		Ars.sort(s);
		
		//내림차순 정렬한 배열 출력
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("-----------------------------------");
		
		//직원 정보 검색
		ind = Ars.sequentialSearch(e, new Employee("", 650.0));
		
		//직원 정보가 있는 인덱스 값 출력
		if(ind > 0) System.out.println(e[ind]);
		else System.out.println("Not Found");
		
		//직원 정보 내림차순 정렬
		System.out.println();
		Ars.sort(e);
		
		//내림차순 정렬한 배열 출력
		for(int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
	}
}
