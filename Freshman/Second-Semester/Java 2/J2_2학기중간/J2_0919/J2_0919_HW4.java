class Stu {
	//�й� �̸� ���� �ʵ�
	private int id;
	private String name;
	private int score;
	
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
		
		System.out.println("dddd�л��� ����");
		stutemp = stus.getByName("dddd");
		stutemp.println();
		System.out.println("---------------------------------");
		
		System.out.println("�л� ���");
		stus.print();
		System.out.println("---------------------------------");
		
		System.out.println("������ ����");
		stus.sortByScore();
		stus.print();
		System.out.println("---------------------------------");
		
		System.out.println("���� ������ ���� �л��� ����");
		stutemp = stus.StudentAt(0);
		stutemp.changeScore(90);
		stutemp.println();
		System.out.println("---------------------------------");
		
		System.out.println("�й��� ����");
		stus.sortById();
		stus.print();
		System.out.println("---------------------------------");
		System.out.println("��� ���� : " + stus.average());
	}
}
