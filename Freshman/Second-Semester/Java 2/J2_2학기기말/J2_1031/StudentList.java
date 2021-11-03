//PersonList �� ��ӹ޴� StudentList, �̷ν� StudentList�� ����(����)����ȯ�� �� �� �ִ�.
public class StudentList extends PersonList{
	//Student �迭 sts, �� ���� number
	private Student[] sts;
	private int number = 0;
	
	//������
	public StudentList() {
		sts = new Student[20];
	}
	public StudentList(int n) {
		sts = new Student[n];
	}
	
	//i ��° �л� ��ȯ
	public Student studentAt(int i) {
		return sts[i];
	}
	
	//�л� �� ��ȯ
	public int length() {
		return number;
	}
	
	//�л� �߰�
	public void append(Student s) {
		if(number >= sts.length) System.out.println("Error");
		else {
			sts[number] = s;
			number++;
		}
	}
	
	//nm�� ��ġ�ϴ� �̸��� �л� ��ȯ
	public Student getByName(String nm) {
		for(int i = 0; i < number; i++) {
			if(sts[i].getName().equals(nm)) return sts[i];
		}
		return null;
	}
	
	//Student�迭 sts ���
	public void print() {
		for(int i = 0; i < number; i++) {
			System.out.println(sts[i]);
		}
	}
	
	//���� �޼ҵ�
	public void swap(int i, int j) {
		Student temp;
		temp = sts[i];
		sts[i] = sts[j];
		sts[j] = temp;
	}
	
	//���� ����
	public void reverse() {
		int half = number/2;
		for(int i = 0; i < half; i++) {
			swap(i, number-1-i);
		}
	}
	
	//Id �� ����
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
	
	//Score ��  ����
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
	
	//��ü �л� ��� return
	public double average() {
		double sum = 0;
		
		for(int i = 0; i < number; i++) {
			sum += sts[i].getScore();
		}
		return (sum/number);
	}
}