class Stu {
	//�й� �̸� ���� �ʵ�
	private int id;
	private String name;
	private int score;
	private Teacher advisor;
	
	//������
	public Stu(int i, String n, int sc) {
		id = i;
		name = n;
		score = sc;
	}
	
	//id return �޼ҵ�
	public int getId() {
		return id;
	}
	
	//name return �޼ҵ�
	public String getName(Stu s) {
		return s.name;
	}
	
	//score return �޼ҵ�
	public int getScore() {
		return score;
	}
	
	//score �ٲٴ� �޼ҵ�
	public void changeScore(int sc) {
		this.score = sc;
	}
	
	//������
	public void setAdvisor(Teacher tConect) {
		advisor = tConect;
	}
	
	//������
	public Teacher getAdvisor() {
		return advisor;
	}
	
	//id, name, score ��� �޼ҵ�
	public void println() {
		System.out.println("id : " + this.id + " Name : " + this.name + " Score : " + this.score);
	}
}

class Students {
	//Stu �迭, ���� �迭�� �ִ� Stu ��ü ��
	private Stu[] sts;
	private int number = 0;
	
	//������
	public Students() {
		sts = new Stu[100];
	}
	
	//�迭�� ũ�Ⱑ n �� �ǵ��� ����
	public Students(int n) {
		sts = new Stu[n];
	}
	
	//i ��° �л� return
	public Stu StudentAt(int i) {
		return sts[i];
	}
	
	//�л� �߰�
	public void append(Stu s) {
		sts[number] = s;
		number++;
	}
	
	//nm�� ��ġ�ϴ� �̸��� �л� return
	public Stu getByName(String nm) {
		for(int i = 0; i < number; i++) {
			if(sts[i].getName(sts[i]) == nm) return sts[i];
		}
		return null;
	}
	
	//�迭 ���
	public void print() {
		for(int i = 0; i < number; i++) {
			System.out.println("id : " + sts[i].getId() + " Name : " + sts[i].getName(sts[i]) + " Score : " + sts[i].getScore());
		}
	}
	
	//sort �� ���� �޼ҵ�
	public void swap(int i, int j) {
		Stu temp;
		temp = sts[i];
		sts[i] = sts[j];
		sts[j] = temp;
	}
	
	//�й��� �������� ����
	public void sortById() {
		int min;
		for(int i = 0; i < number-1; i++) {
			min = i;
			for(int j = i+1; j < number; j++) {
				if(sts[j].getId() >= sts[min].getId()) min = j;
			}
			swap(i, min);
		}
	}
	
	//������  ����
	public void sortByScore() {
		int min;
		for(int i = 0; i < number-1; i++) {
			min = i;
			for(int j = i+1; j < number-1; j++) {
				if(sts[j].getScore() <= sts[min].getScore()) min = j;
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
	
	public void reverse() {
		int half = number/2;
		for(int i = 0; i < half; i++) {
			swap(i, number-1-i);
		}
	}
}

class Teacher {
	//id age name �Է¹ް� ����
	private int id, age;
	private String name;
	
	//������, ������ ����
	public Teacher(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	//������ id return
	public int getId() {
		return id;
	}
	
	//������ �̸� return
	public String getName(Teacher t) {
		return t.name;
	}
	
	//������ ���� return
	public int getAge() {
		return age;
	}
	
	//Ư�� ������ return
	public void println() {
		System.out.println("id : " + this.id + " Name : " + this.name + " Age : " + this.age);
	}
	
	//��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�
	public String toString() {
		return ("Id : " + id + " Name : " + name + " Age : " + age);
	}
}

class TeacherList {
	//������ �迭 fts, ������ �� number
	private Teacher[] fts;
	private int number = 0;
	
	//������, �迭 ũ��� �⺻ 100
	public TeacherList() {
		fts = new Teacher[100];
	}
	
	//������, �迭 ũ��� ����ڰ� �Է��� n
	public TeacherList(int n) {
		fts = new Teacher[n];
	}
	
	//Ư�� index�� Teacher �� return
	public Teacher TeacherAt(int n) {
		return fts[n];
	}
	
	//�Ķ���ͷ� ���� String �� ��ġ�ϴ� �̸��� �л� return
	public Teacher getByName(String sName) {
		for(int i = 0; i < number; i++) {
			if(fts[i].getName(fts[i]) == sName) return fts[i];
		}
		return null;
	}
	
	//������ �߰�
	public void append(Teacher tAdd) {
		fts[number] = tAdd;
		number++;
	}
	
	//�迭 ���
	public void print() {
		for(int i = 0; i < number; i++) {
			System.out.println("Id : " + fts[i].getId() + " Name : " + fts[i].getName(fts[i]) + " Age : " + fts[i].getAge());
		}
		
	}
	
	//sort �� ���� �޼ҵ�
	public void swap(int i, int j) {
		Teacher temp;
		temp = fts[i];
		fts[i] = fts[j];
		fts[j] = temp;
	}
	
	//�迭�� ���� ������ �������� ����
	public void reverse() {
		int half = number/2;
		for(int i = 0; i < half; i++) {
			swap(i, number-1-i);
		}
	}
	
	//id ������ �迭 ����
	public void sortById() {
		int min;
		for(int i = 0; i < number-1; i++) {
			min = 1;
			for(int j = i+1; j < number; j++) {
				if(fts[j].getId() >= fts[min].getId()) min = j;
			}
			swap(i, min);
		}
	}
}

public class J2_1010_HW3 {
	public static void main(String[] args) {
		TeacherList f1 = new TeacherList();
		
		//������ ������
		f1.append(new Teacher(123, "Joo0", 40));
		f1.append(new Teacher(234, "Joo1", 41));
		f1.append(new Teacher(345, "Joo2", 42));
		f1.append(new Teacher(456, "Joo3", 43));
		
		Students c = new Students();
		
		//�л� ���� �Է�, ������ ����
		Stu s = new Stu(783, "Hank", 98);
		s.setAdvisor(f1.getByName("Joo0"));
		c.append(s);
		
		s = new Stu(678, "Mike", 78);
		s.setAdvisor(f1.getByName("Joo0"));
		c.append(s);
		
		s = new Stu(710, "Joseph", 83);
		s.setAdvisor(f1.getByName("Joo1"));
		c.append(s);
		
		s = new Stu(690, "Susan", 96);
		s.setAdvisor(f1.getByName("Joo2"));
		c.append(s);
		
		s = new Stu(753, "Flora", 94);
		s.setAdvisor(f1.getByName("Joo2"));
		c.append(s);
		
		s = new Stu(820, "Cathy", 95);
		s.setAdvisor(f1.getByName("Joo3"));
		c.append(s);
		
		System.out.println("---------------------------------");
		
		c.print();
		System.out.println("---------------------------------");
		
		//���� ���
		c.reverse();
		c.print();
		System.out.println("---------------------------------");
		
		//1���� �л��� ���� ���
		c.sortByScore();
		System.out.println("1���� �л��� ����");
		c.StudentAt(0).println();
		System.out.println("---------------------------------");
		
		//���� �л� ������ ������ ��� ����
		double hap = 0;
		for(int temp = 0; temp < 3; temp++) {
			hap += c.StudentAt(temp).getAdvisor().getAge();
		}
		System.out.println("���� �� ���� �������� ��� ����");
		System.out.println(hap/3);
	}
}
