
//Person Ŭ������ ��ӹ޴� Employee
public class Employee extends Person {
	protected double grossPay;
	
	//������
	public Employee() {
		grossPay = 0.0;
	}
	
	public Employee(String name, double grossPay) {
		super(name);
		this.grossPay = grossPay;
	}
	
	//��¹�
	public String toString() {
		final String DOLLAR_SIGN = "    $";
		return (name + DOLLAR_SIGN + grossPay);
	}
	
	//���� ���Ͽ� ũ�⿡ ���� return
	public int comparing(Object p) {
		Employee e = (Employee)p;
		if (grossPay > e.grossPay) return 1;
		else if (grossPay < e.grossPay) return -1; 
		else return 0;
	}
}
