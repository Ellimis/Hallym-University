//Person ��ü���� ������ PersonList Ŭ����
public class PersonList {
	//Person ��ü �迭 ps, ���ڸ� �� number
	protected Person[] ps;
	protected int number;
	
	//������
	public PersonList() {
		number = 0;
		ps = new Person[20];
	}
	public PersonList(int n) {
		number = 0;
		ps = new Person[n];
	}
	
	//������� ��ȯ���� length �޼ҵ�
	public int length() {
		return number;
	}
	
	//Ư�� i ��° Person�� ������ ��ȯ
	public Person personAt(int i) {
		return ps[i];
	}
	
	//��ü�� �߰��� �� ���� ���� �� �ִ� �ε����� �迭 ũ�⺸�� ũ�� ����
	public void append(Person p) {
		if(number >= ps.length) System.out.println("Error");
		else {
			ps[number] = p;
			number++;
		}
	}
	
	//Person ��ü�� nm �� �̸��� ���� �� �� Person ��ü ��ȯ
	public Person getByName(String nm) {
		for(int i = 0; i < number; i++) {
			if(ps[i].getName().contentEquals(nm))
				return ps[i];
		}
		return null;
	}
	
	//Person �迭 ps ���
	public void print() {
		for(int i = 0; i < number; i++) {
			System.out.println(ps[i]);
		}
	}
	
	//������ ���� �޼ҵ�
	public void swap(int i, int j) {
		Person temp;
		temp = ps[i];
		ps[i] = ps[j];
		ps[j] = temp;
	}
	
	//���� ����
	public void reverse() {
		int half = number / 2;
		for(int i = 0; i < half; i++) {
			swap(i, number-1-i);
		}
	}
	
	//Id ������ ����
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
