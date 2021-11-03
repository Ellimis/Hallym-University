class Stu {
	//학번 이름 점수 필드
	private int id;
	private String name;
	private int score;
	
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

public class J2_0919_HW4 {
	public static void main(String[] args) {
		Students stus = new Students();
		
		Stu stu1 = new Stu(1111, "aaaa", 56);
		Stu stu2 = new Stu(2222, "bbbb", 32);
		Stu stu3 = new Stu(3333, "cccc", 86);
		Stu stu4 = new Stu(4444, "dddd", 65);
		Stu stu5 = new Stu(5555, "eeee", 13);
		Stu stutemp;
		
		stus.append(stu1);
		stus.append(stu2);
		stus.append(stu3);
		stus.append(stu4);
		stus.append(stu5);
		
		System.out.println("dddd학생의 정보");
		stutemp = stus.getByName("dddd");
		stutemp.println();
		System.out.println("---------------------------------");
		
		System.out.println("학생 목록");
		stus.print();
		System.out.println("---------------------------------");
		
		System.out.println("성적순 정렬");
		stus.sortByScore();
		stus.print();
		System.out.println("---------------------------------");
		
		System.out.println("가장 점수가 낮은 학생의 정보");
		stutemp = stus.StudentAt(0);
		stutemp.changeScore(90);
		stutemp.println();
		System.out.println("---------------------------------");
		
		System.out.println("학번순 정렬");
		stus.sortById();
		stus.print();
		System.out.println("---------------------------------");
		System.out.println("평균 점수 : " + stus.average());
	}
}
