class Stu {
	//학번 이름 점수 필드
	private int id;
	private String name;
	private int score;
	private Teacher advisor;
	
	//생성자
	public Stu(int i, String n, int sc) {
		id = i;
		name = n;
		score = sc;
	}
	
	//id return 메소드
	public int getId() {
		return id;
	}
	
	//name return 메소드
	public String getName(Stu s) {
		return s.name;
	}
	
	//score return 메소드
	public int getScore() {
		return score;
	}
	
	//score 바꾸는 메소드
	public void changeScore(int sc) {
		this.score = sc;
	}
	
	//설정자
	public void setAdvisor(Teacher tConect) {
		advisor = tConect;
	}
	
	//접근자
	public Teacher getAdvisor() {
		return advisor;
	}
	
	//id, name, score 출력 메소드
	public void println() {
		System.out.println("id : " + this.id + " Name : " + this.name + " Score : " + this.score);
	}
}

class Students {
	//Stu 배열, 현재 배열에 있는 Stu 객체 수
	private Stu[] sts;
	private int number = 0;
	
	//생성자
	public Students() {
		sts = new Stu[100];
	}
	
	//배열의 크기가 n 이 되도록 생성
	public Students(int n) {
		sts = new Stu[n];
	}
	
	//i 번째 학생 return
	public Stu StudentAt(int i) {
		return sts[i];
	}
	
	//학생 추가
	public void append(Stu s) {
		sts[number] = s;
		number++;
	}
	
	//nm과 일치하는 이름의 학생 return
	public Stu getByName(String nm) {
		for(int i = 0; i < number; i++) {
			if(sts[i].getName(sts[i]) == nm) return sts[i];
		}
		return null;
	}
	
	//배열 출력
	public void print() {
		for(int i = 0; i < number; i++) {
			System.out.println("id : " + sts[i].getId() + " Name : " + sts[i].getName(sts[i]) + " Score : " + sts[i].getScore());
		}
	}
	
	//sort 를 위한 메소드
	public void swap(int i, int j) {
		Stu temp;
		temp = sts[j];
		sts[j] = sts[j-1];
		sts[j-1] = temp;
	}
	
	//학번순 오름차순 정렬
	public void sortById() {
		for(int i = 0; i < number; i++) {
			for(int j = 1; j < number; j++) {
				if(sts[j-1].getId() >= sts[j].getId()) swap(i, j);
			}
		}
	}
	
	//성적순 오름차순 정렬
	public void sortByScore() {
		for(int i = 0; i < number; i++) {
			for(int j = 1; j < number; j++) {
				if(sts[j-1].getScore() >= sts[j].getScore()) swap(i, j);
			}
		}
	}
	
	//전체 학생 평균 return
	public double average() {
		double sum = 0;
		
		for(int i = 0; i < number; i++) {
			sum += sts[i].getScore();
		}
		return (sum/number);
	}
}

class Teacher {
	//id age name 입력받게 설정
	private int id, age;
	private String name;
	
	//생성자, 선생님 정보
	public Teacher(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	//선생님 id return
	public int getId() {
		return id;
	}
	
	//선생님 이름 return
	public String getName(Teacher t) {
		return t.name;
	}
	
	//선생님 나이 return
	public int getAge() {
		return age;
	}
	
	//특정 선생님 return
	public void println() {
		System.out.println("id : " + this.id + " Name : " + this.name + " Age : " + this.age);
	}
	
	//객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
	public String toString() {
		return ("Id : " + id + " Name : " + name + " Age : " + age);
	}
}

class TeacherList {
	//선생님 배열 fts, 선생님 수 number
	private Teacher[] fts;
	private int number = 0;
	
	//생성자, 배열 크기는 기본 100
	public TeacherList() {
		fts = new Teacher[100];
	}
	
	//생성자, 배열 크기는 사용자가 입력한 n
	public TeacherList(int n) {
		fts = new Teacher[n];
	}
	
	//특정 index에 Teacher 을 return
	public Teacher TeacherAt(int n) {
		return fts[n];
	}
	
	//파라미터로 받은 String 과 일치하는 이름의 학생 return
	public Teacher getByName(String sName) {
		for(int i = 0; i < number; i++) {
			if(fts[i].getName(fts[i]) == sName) return fts[i];
		}
		return null;
	}
	
	//선생님 추가
	public void append(Teacher tAdd) {
		fts[number] = tAdd;
		number++;
	}
	
	//배열 출력
	public void print() {
		for(int i = 0; i < number; i++) {
			System.out.println("Id : " + fts[i].getId() + " Name : " + fts[i].getName(fts[i]) + " Age : " + fts[i].getAge());
		}
		
	}
	
	//sort 를 위한 메소드
	public void swap(int i, int j) {
		Teacher temp;
		temp = fts[j];
		fts[j] = fts[j-1];
		fts[j-1] = temp;
	}
	
	//배열을 현재 순서의 역순으로 정렬
	public void reverse() {
		for(int i = 0; i < number; i++) {
			for(int j = 1; j < number; j++) {
				if(fts[j-1].getId() <= fts[j].getId()) swap(i, j);
			}
		}
	}
	
	//id 순으로 배열 정렬
	public void sortById() {
		for(int i = 0; i < number; i++) {
			for(int j = 1; j < number; j++) {
				if(fts[j-1].getId() >= fts[j].getId()) swap(i, j);
			}
		}
	}
}

public class J2_0926_HW3 {
	public static void main(String[] args) {
		TeacherList f1 = new TeacherList();
		
		//선생님 보내기
		f1.append(new Teacher(123, "Joo0", 40));
		f1.append(new Teacher(234, "Joo1", 41));
		f1.append(new Teacher(345, "Joo2", 42));
		
		Students c = new Students();
		
		//학생 정보 입력, 선생님 연결
		Stu s = new Stu(783, "Hank", 98);
		s.setAdvisor(f1.getByName("Joo0"));
		c.append(s);
		
		s = new Stu(678, "Joseph", 83);
		s.setAdvisor(f1.getByName("Joo1"));
		c.append(s);
		
		s = new Stu(710, "Flora", 94);
		s.setAdvisor(f1.getByName("Joo2"));
		c.append(s);
		
		s = new Stu(690, "Cathy", 95);
		s.setAdvisor(f1.getByName("Joo2"));
		c.append(s);
		
		System.out.println("---------------------------------");
		
		f1.print();
		System.out.println("---------------------------------");
		
		//역순 출력
		f1.reverse();
		f1.print();
		System.out.println("---------------------------------");
		
		//id 순 출력
		f1.sortById();
		f1.print();
		System.out.println("---------------------------------");
		
		//3번째 학생의 선생님 출력
		c.StudentAt(2).getAdvisor().println();
		
		
		//특정 선생님 출력
		System.out.println("---------------------------------");
		System.out.println(f1.getByName("Joo1"));
	}
}
