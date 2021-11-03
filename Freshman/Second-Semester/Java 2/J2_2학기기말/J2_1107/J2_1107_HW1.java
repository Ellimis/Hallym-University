
//������ �ϱ� ���ؼ� ���� �޼ҵ带 ���� Compare �������̽�
interface Compare {
	public int comparing(Object o);
}

//�������� ���� Ars Ŭ������ �� ��ü�� �´� ���� �޼ҵ� descending
class Ars {
	public static void descending(Compare[] o) {
		int min, i, j;
		
		//�������� ����
		for(i = 0; i < o.length-1; i++) {
			min = i;
			for(j = 1+i; j < o.length; j++) {
				//Compare[] o �϶��� Object[] o �϶� �� �񱳿���
				//���� o[i].comparing(o[j]) ��
				//((Compare)o[i]).comparing(o[j])
				//�Ѵ� �Ǵ��� Ȥ�� ���Ŵٸ� ���� �ǽ� �� �˷��ֽ� �� �ֳ���?
				if(o[i].comparing(o[j]) == 1) min = i;
				else if(o[i].comparing(o[j]) == -1) min = j;
				else min = j;
				Compare temp;
				temp = o[i];
				o[i] = o[min];
				o[min] = temp;
			}
		}
	}
}

public class J2_1107_HW1 {
	public static void main(String[] args) {
		//Employee, Student, Rectangle ��ü �迭 ����
		Employee[] e = new Employee[10];
		Student[] s = new Student[10];
		Rectangle[] r = new Rectangle[5];
		
		//Employee 10�� ����
		e[0] = new Employee("Kim", 300.0);
		e[1] = new Employee("Lee", 450.0);
		e[2] = new Employee("Park", 200.0);
		e[3] = new Employee("Choi", 440.0);
		e[4] = new Employee("Jung", 700.0);
		e[5] = new Employee("Seok", 250.0);
		e[6] = new Employee("Yoon", 100.0);
		e[7] = new Employee("Cho", 650.0);
		e[8] = new Employee("Ryu", 500.0);
		e[9] = new Employee("Ji", 310.0);
		
		//Student 10�� ����
		s[0] = new Student("Kim", 2.3);
		s[1] = new Student("Lee", 3.0);
		s[2] = new Student("Park", 1.3);
		s[3] = new Student("Choi", 4.0);
		s[4] = new Student("Jung", 3.1);
		s[5] = new Student("Seok", 4.4);
		s[6] = new Student("Yoon", 3.7);
		s[7] = new Student("Cho", 3.9);
		s[8] = new Student("Ryu", 3.2);
		s[9] = new Student("Ji", 2.7);
		
		r[0] = new Rectangle(10, 3);
		r[1] = new Rectangle(10, 4);
		r[2] = new Rectangle(5, 3);
		r[3] = new Rectangle(7, 2);
		r[4] = new Rectangle(6, 8);
		
		//Employee �������� ������ ���
		Ars.descending(e);
		for(int i = 0; i < 10; i++) {
			System.out.println(e[i]);
		}
		System.out.println("---------------------------------------");
		
		//Studnet �������� ������ ���
		Ars.descending(s);
		for(int i = 0; i < 10; i++) {
			System.out.println(s[i]);
		}
		System.out.println("---------------------------------------");
		
		//Rectangle �������� ������ ���
		Ars.descending(r);
		for(int i = 0; i < 5; i++) {
			System.out.println(r[i]);
		}
	}
}
