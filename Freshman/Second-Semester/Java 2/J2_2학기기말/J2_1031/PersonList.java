//Person 객체들을 관리할 PersonList 클래스
public class PersonList {
	//Person 객체 배열 ps, 숫자를 셀 number
	protected Person[] ps;
	protected int number;
	
	//생성자
	public PersonList() {
		number = 0;
		ps = new Person[20];
	}
	public PersonList(int n) {
		number = 0;
		ps = new Person[n];
	}
	
	//몇명인지 반환해줄 length 메소드
	public int length() {
		return number;
	}
	
	//특정 i 번째 Person의 정보를 반환
	public Person personAt(int i) {
		return ps[i];
	}
	
	//객체를 추가할 때 현재 넣을 수 있는 인덱스가 배열 크기보다 크면 에러
	public void append(Person p) {
		if(number >= ps.length) System.out.println("Error");
		else {
			ps[number] = p;
			number++;
		}
	}
	
	//Person 객체가 nm 과 이름이 같을 때 그 Person 객체 반환
	public Person getByName(String nm) {
		for(int i = 0; i < number; i++) {
			if(ps[i].getName().contentEquals(nm))
				return ps[i];
		}
		return null;
	}
	
	//Person 배열 ps 출력
	public void print() {
		for(int i = 0; i < number; i++) {
			System.out.println(ps[i]);
		}
	}
	
	//정렬을 위한 메소드
	public void swap(int i, int j) {
		Person temp;
		temp = ps[i];
		ps[i] = ps[j];
		ps[j] = temp;
	}
	
	//역순 정렬
	public void reverse() {
		int half = number / 2;
		for(int i = 0; i < half; i++) {
			swap(i, number-1-i);
		}
	}
	
	//Id 순으로 정렬
	public void sortById() {
		int i, j, min;
		for(i = 0; i < number-1; i++) {
			min = i;
			for(j = 1+i; j < number; j++) {
				if(ps[j].getId() < ps[min].getId())
					min = j;
			}
			swap(i, min);
		}
	}
}
