interface Employable {
	String getName();
	
	static boolean isEmpty(String str) {
		if(str == null || str.trim().length() == 0) {
			return true;
		} else {
			return false;
		}
	}
}

class Employee1 implements Employable {
	private String name;
	
	public Employee1 (String name) {
		if(Employable.isEmpty(name) == true) {
			throw new RuntimeException("�̸��� �ݵ�� �Է��ؾ���!");
		}
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}

public class J2_1107_P3 {
	public static void main(String[] args) {
		Employable employee1 = new Employee1("ȫ�浿");
		Employable employee2 = new Employee1("");
	}
}
