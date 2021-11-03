//매개변수로 받은 a와 b 의 수를 계산하는 클래스와 정적메소드
class Ars {
	public static int lengthCompare(PersonList a, PersonList b) {
		return a.length() - b.length();
	}
}

public class J2_1031_HW1 {
	public static void main(String[] args) {
		//선생님들을 기록할 TeacherList 객체 생성
		TeacherList t1 = new TeacherList();
		
		//선생님 생성
		t1.append(new Teacher(123, "Joo0", 40));
		t1.append(new Teacher(234, "Joo1", 41));
		t1.append(new Teacher(345, "Joo2", 42));
		t1.append(new Teacher(456, "Joo3", 43));
		StudentList c = new StudentList();
		
		//학생 정보 입력, 선생님 연결
		Student s = new Student(783, "Hank", 98);
		s.setAdvisor((Teacher)t1.getByName("Joo0"));
		c.append(s);
		
		s = new Student(678, "Mike", 78);
		s.setAdvisor((Teacher)t1.getByName("Joo0"));
		c.append(s);
		
		s = new Student(710, "Joseph", 83);
		s.setAdvisor((Teacher)t1.getByName("Joo1"));
		c.append(s);
		
		s = new Student(690, "Susan", 96);
		s.setAdvisor((Teacher)t1.getByName("Joo2"));
		c.append(s);
		
		s = new Student(753, "Flora", 94);
		s.setAdvisor((Teacher)t1.getByName("Joo2"));
		c.append(s);
		
		s = new Student(820, "Cathy", 95);
		s.setAdvisor((Teacher)t1.getByName("Joo3"));
		c.append(s);
		
		System.out.println("---------------------------------");
		
		c.print();
		System.out.println("---------------------------------");
		
		//2번째 학생 출력
		System.out.println(c.studentAt(2));
		System.out.println("---------------------------------");
		
		//Id순 정렬, 출력
		c.sortById();
		c.print();
		System.out.println("---------------------------------");
		
		//역순 정렬, 출력
		c.reverse();
		c.print();
		System.out.println("---------------------------------");
		
		//1등한 학생의 정보 출력
		c.sortByScore();
		c.print();
		System.out.println("---------------------------------");
		
		//역순 출력
		c.reverse();
		c.print();
		System.out.println("---------------------------------");
		
		//2번째 학생의 교수님 이름 출력, 학생들의 점수 평균 출력
		System.out.println(c.studentAt(2).getAdvisor().getName());
		System.out.println(c.average());
		
		//TeacherList 객체 t1의 길이 - StudentList 객체 c의 길이 출력 
		System.out.println(Ars.lengthCompare(t1, c));
	}
}
