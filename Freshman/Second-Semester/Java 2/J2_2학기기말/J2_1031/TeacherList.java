//PersonList �� ��ӹ޴� TeacherList, �̷ν� TeacherList�� ����(����)����ȯ�� �� �� �ִ�.
public class TeacherList extends PersonList{
	//������ �迭 tcs, ������ �� number
	private Teacher[] tcs;
	private int number = 0;
	
	//������
	public TeacherList() {
		tcs = new Teacher[20];
	}
	public TeacherList(int n) {
		tcs = new Teacher[n];
	}
	
	//Ư�� index�� ���� Teacher �� ��ȯ
	public Teacher TeacherAt(int i) {
		return tcs[i];
	}
	
	//nm �� ���� �̸��� ���� ��ȯ
	public Teacher getByName(String nm) {
		for(int i = 0; i < number; i++) {
			if(tcs[i].getName().equals(nm)) return tcs[i];
		}
		return null;
	}
	
	//������ �� ��ȯ
	public int length() {
		return number;
	}
	
	//������ �߰�
	public void append(Teacher t) {
		if(number >= tcs.length) System.out.println("Error");
		else {
			tcs[number] = t;
			number++;
		}
	}
	
	//Teacher�迭 tcs ���
	public void print() {
		for(int i = 0; i < number; i++) {
			System.out.println(tcs[i]);
		}
	}
	
	//�迭 ���� �޼ҵ�
	public void swap(int i, int j) {
		Teacher temp;
		temp = tcs[i];
		tcs[i] = tcs[j];
		tcs[j] = temp;
	}
	
	//���� ����
	public void reverse() {
		int half = number/2;
		for(int i = 0; i < half; i++) {
			swap(i, number-1-i);
		}
	}
	
	//Id ������ �迭 ����
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