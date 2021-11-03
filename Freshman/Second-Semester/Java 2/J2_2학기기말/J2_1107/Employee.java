
//Person 클래스를 상속받는 Employee
public class Employee extends Person {
	protected double grossPay;
	
	//생성자
	public Employee() {
		grossPay = 0.0;
	}
	
	public Employee(String name, double grossPay) {
		super(name);
		this.grossPay = grossPay;
	}
	
	//출력문
	public String toString() {
		final String DOLLAR_SIGN = "    $";
		return (name + DOLLAR_SIGN + grossPay);
	}
	
	//값을 비교하여 크기에 따라 return
	public int comparing(Object p) {
		Employee e = (Employee)p;
		if (grossPay > e.grossPay) return 1;
		else if (grossPay < e.grossPay) return -1; 
		else return 0;
	}
}
