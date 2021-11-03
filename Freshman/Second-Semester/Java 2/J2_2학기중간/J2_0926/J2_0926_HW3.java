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
		temp = sts[j];
		sts[j] = sts[j-1];
		sts[j-1] = temp;
	}
	
	//�й��� �������� ����
	public void sortById() {
		for(int i = 0; i < number; i++) {
			for(int j = 1; j < number; j++) {
				if(sts[j-1].getId() >= sts[j].getId()) swap(i, j);
			}
		}
	}
	
	//������ �������� ����
	public void sortByScore() {
		for(int i = 0; i < number; i++) {
			for(int j = 1; j < number; j++) {
				if(sts[j-1].getScore() >= sts[j].getScore()) swap(i, j);
			}
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
		temp = fts[j];
		fts[j] = fts[j-1];
		fts[j-1] = temp;
	}
	
	//�迭�� ���� ������ �������� ����
	public void reverse() {
		for(int i = 0; i < number; i++) {
			for(int j = 1; j < number; j++) {
				if(fts[j-1].getId() <= fts[j].getId()) swap(i, j);
			}
		}
	}
	
	//id ������ �迭 ����
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
		
		//������ ������
		f1.append(new Teacher(123, "Joo0", 40));
		f1.append(new Teacher(234, "Joo1", 41));
		f1.append(new Teacher(345, "Joo2", 42));
		
		Students c = new Students();
		
		//�л� ���� �Է�, ������ ����
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
		
		//���� ���
		f1.reverse();
		f1.print();
		System.out.println("---------------------------------");
		
		//id �� ���
		f1.sortById();
		f1.print();
		System.out.println("---------------------------------");
		
		//3��° �л��� ������ ���
		c.StudentAt(2).getAdvisor().println();
		
		
		//Ư�� ������ ���
		System.out.println("---------------------------------");
		System.out.println(f1.getByName("Joo1"));
	}
}
