//PersonList 를 상속받는 StudentList, 이로써 StudentList는 상향(하향)형변환을 할 수 있다.
public class StudentList extends PersonList{
	//Student 배열 sts, 그 수인 number
	private Student[] sts;
	private int number = 0;
	
	//생성자
	public StudentList() {
		sts = new Student[20];
	}
	public StudentList(int n) {
		sts = new Student[n];
	}
	
	//i 번째 학생 반환
	public Student studentAt(int i) {
		return sts[i];
	}
	
	//학생 수 반환
	public int length() {
		return number;
	}
	
	//학생 추가
	public void append(Student s) {
		if(number >= sts.length) System.out.println("Error");
		else {
			sts[number] = s;
			number++;
		}
	}
	
	//nm과 일치하는 이름의 학생 반환
	public Student getByName(String nm) {
		for(int i = 0; i < number; i++) {
			if(sts[i].getName().equals(nm)) return sts[i];
		}
		return null;
	}
	
	//Student배열 sts 출력
	public void print() {
		for(int i = 0; i < number; i++) {
			System.out.println(sts[i]);
		}
	}
	
	//정렬 메소드
	public void swap(int i, int j) {
		Student temp;
		temp = sts[i];
		sts[i] = sts[j];
		sts[j] = temp;
	}
	
	//역순 정렬
	public void reverse() {
		int half = number/2;
		for(int i = 0; i < half; i++) {
			swap(i, number-1-i);
		}
	}
	
	//Id 순 정렬
	public void sortById() {
		int i, j, min;
		for(i = 0; i < number-1; i++) {
			min = i;
			for(j = 1+i; j < number; j++) {
				if(sts[j].getId() < sts[min].getId()) min = j;
			}
			swap(i, min);
		}
	}
	
	//Score 순  정렬
	public void sortByScore() {
		int i, j, min;
		for(i = 0; i < number-1; i++) {
			min = i;
			for(j = 1+i; j < number; j++) {
				if(sts[j].getScore() < sts[min].getScore()) min = j;
			}
			swap(i, min);
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