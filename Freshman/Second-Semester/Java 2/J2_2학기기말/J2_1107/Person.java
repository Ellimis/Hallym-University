
//Compare �������̽��� �޴� Person Ŭ����
public class Person implements Compare{
	protected String name;
	
	//������
	public Person() {
		name = "";
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	//�̸���
	public int comparing(Object p) {
		return this.name.compareTo(((Person)p).name);
	}
}
