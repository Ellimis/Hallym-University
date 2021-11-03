
interface OperateCar1 {
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
	
	default public void fly() {
		System.out.println("�ϴ��� ���� ����");
	}
}

class AutoCar1 implements OperateCar1 {
	public void start() {
		System.out.println("�ڵ��� ���");
	}
	
	public void stop() {
		System.out.println("�ڵ��� ����");
	}
	
	public void setSpeed(int speed) {
		System.out.println("�ڵ��� �ӵ� " + speed + " km/h�� �ٲߴϴ�");
	}
	
	public void turn(int degree) {
		System.out.println("�ڵ��� ���� " + degree + " �� ��ŭ �ٲߴϴ�");
	}
}

public class J2_1107_P2 {
	public static void main(String[] args) {
		AutoCar1 obj = new AutoCar1();
		obj.start();
		obj.setSpeed(30);
		obj.turn(15);
		obj.stop();
		
		obj.fly();
	}
}
