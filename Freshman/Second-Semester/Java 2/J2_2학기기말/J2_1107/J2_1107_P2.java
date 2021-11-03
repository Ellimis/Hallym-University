
interface OperateCar1 {
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
	
	default public void fly() {
		System.out.println("하늘을 날고 있음");
	}
}

class AutoCar1 implements OperateCar1 {
	public void start() {
		System.out.println("자동차 출발");
	}
	
	public void stop() {
		System.out.println("자동차 정지");
	}
	
	public void setSpeed(int speed) {
		System.out.println("자동차 속도 " + speed + " km/h로 바꿉니다");
	}
	
	public void turn(int degree) {
		System.out.println("자동차 방향 " + degree + " 도 만큼 바꿉니다");
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
