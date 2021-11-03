//PersonList 를 상속받는 TeacherList, 이로써 TeacherList는 상향(하향)형변환을 할 수 있다.
public class TeacherList extends PersonList{
	//선생님 배열 tcs, 선생님 수 number
	private Teacher[] tcs;
	private int number = 0;
	
	//생성자
	public TeacherList() {
		tcs = new Teacher[20];
	}
	public TeacherList(int n) {
		tcs = new Teacher[n];
	}
	
	//특정 index에 대한 Teacher 을 반환
	public Teacher TeacherAt(int i) {
		return tcs[i];
	}
	
	//nm 과 같은 이름의 교수 반환
	public Teacher getByName(String nm) {
		for(int i = 0; i < number; i++) {
			if(tcs[i].getName().equals(nm)) return tcs[i];
		}
		return null;
	}
	
	//교수님 수 반환
	public int length() {
		return number;
	}
	
	//선생님 추가
	public void append(Teacher t) {
		if(number >= tcs.length) System.out.println("Error");
		else {
			tcs[number] = t;
			number++;
		}
	}
	
	//Teacher배열 tcs 출력
	public void print() {
		for(int i = 0; i < number; i++) {
			System.out.println(tcs[i]);
		}
	}
	
	//배열 정렬 메소드
	public void swap(int i, int j) {
		Teacher temp;
		temp = tcs[i];
		tcs[i] = tcs[j];
		tcs[j] = temp;
	}
	
	//역순 정렬
	public void reverse() {
		int half = number/2;
		for(int i = 0; i < half; i++) {
			swap(i, number-1-i);
		}
	}
	
	//Id 순으로 배열 정렬
	public void sortById() {
		int i, j, min;
		for(i = 0; i < number-1; i++) {
			min = i;
			for(j = 1+i; j < number; j++) {
				if(tcs[j].getId() < tcs[min].getId()) min = j;
			}
			swap(i, min);
		}
	}
}