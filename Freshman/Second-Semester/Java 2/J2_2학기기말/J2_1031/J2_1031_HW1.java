//�Ű������� ���� a�� b �� ���� ����ϴ� Ŭ������ �����޼ҵ�
class Ars {
	public static int lengthCompare(PersonList a, PersonList b) {
		return a.length() - b.length();
	}
}

public class J2_1031_HW1 {
	public static void main(String[] args) {
		//�����Ե��� ����� TeacherList ��ü ����
		TeacherList t1 = new TeacherList();
		
		//������ ����
		t1.append(new Teacher(123, "Joo0", 40));
		t1.append(new Teacher(234, "Joo1", 41));
		t1.append(new Teacher(345, "Joo2", 42));
		t1.append(new Teacher(456, "Joo3", 43));
		StudentList c = new StudentList();
		
		//�л� ���� �Է�, ������ ����
		Student s = new Student(783, "Hank", 98);
		s.setAdvisor((Teacher)t1.getByName("Joo0"));
		c.append(s);
		
		s = new Student(678, "Mike", 78);
		s.setAdvisor((Teacher)t1.getByName("Joo0"));
		c.append(s);
		
		s = new Student(710, "Joseph", 83);
		s.setAdvisor((Teacher)t1.getByName("Joo1"));
		c.append(s);
		
		s = new Student(690, "Susan", 96);
		s.setAdvisor((Teacher)t1.getByName("Joo2"));
		c.append(s);
		
		s = new Student(753, "Flora", 94);
		s.setAdvisor((Teacher)t1.getByName("Joo2"));
		c.append(s);
		
		s = new Student(820, "Cathy", 95);
		s.setAdvisor((Teacher)t1.getByName("Joo3"));
		c.append(s);
		
		System.out.println("---------------------------------");
		
		c.print();
		System.out.println("---------------------------------");
		
		//2��° �л� ���
		System.out.println(c.studentAt(2));
		System.out.println("---------------------------------");
		
		//Id�� ����, ���
		c.sortById();
		c.print();
		System.out.println("---------------------------------");
		
		//���� ����, ���
		c.reverse();
		c.print();
		System.out.println("---------------------------------");
		
		//1���� �л��� ���� ���
		c.sortByScore();
		c.print();
		System.out.println("---------------------------------");
		
		//���� ���
		c.reverse();
		c.print();
		System.out.println("---------------------------------");
		
		//2��° �л��� ������ �̸� ���, �л����� ���� ��� ���
		System.out.println(c.studentAt(2).getAdvisor().getName());
		System.out.println(c.average());
		
		//TeacherList ��ü t1�� ���� - StudentList ��ü c�� ���� ��� 
		System.out.println(Ars.lengthCompare(t1, c));
	}
}
