//�̸��� id �� ������ Person Ŭ����
public class Person {
	protected int id;
	protected String name;
	
	public Person(int i, String n) {
		id = i;
		name = n;
	}
	
	//Person ��ü�� Id �� Name �� ��ȯ�� �޼ҵ�
	public int getId() { return id; }
	public String getName() { return name; }
	
	//���
	public String toString() {
		return "Id : " + id + " Name : " + name;
	}
}
