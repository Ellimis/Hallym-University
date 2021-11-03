import java.util.Scanner;

class Car2 {
	//처음 색과 스피드, 기어 정해주기
	String color = "Blue";
	double nowSpeed = 10.4;
	int nowGear = 1;
	
	//기어 변속
	void ChangeGear(int CG) {
		nowGear = CG;
	}
	
	//가속
	void SpeedUp() {
		if((nowSpeed + 10) <= 100) nowSpeed += 10;
		else nowSpeed = 100.0;
	}
	
	//감속
	void SpeedDown() {
		if((nowSpeed - 10) >= 0) nowSpeed -= 10;
		else nowSpeed = 0.0;
	}
	
	//현재 상태 출력
	void CarPrint() { 
		System.out.println("차 색상 : " + color);
		System.out.println("기어 : " + nowGear);
		System.out.println("속도 : " + nowSpeed);
		System.out.println("----------------------");
	}
}

public class J2_0919_HW3 {
	public static void main(String[] args) {
		//역시나 뜨는 Scanner 무시 구문 쓰기
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//Car 객체 생성
		Car2 Lamborghini = new Car2();
		//gear 와 변속기어를 담당할 CG 필드변수 생성
		int act, cg;
		//while 문을 -1 입력 받았을 때 종료 시키기 위한 boolean변수
		boolean cnd = true;
		
		while(cnd) {
			//처음 차의 상태를 출력
			Lamborghini.CarPrint();
			System.out.print("수행할 동작 입력(기어변속 : 1, 가속 : 2, 감속 : 3, 종료 : -1) : ");
			act = sc.nextInt();
			
			//입력받은 동작에 따른 수행
			switch(act) {
			case 1:
				//기어 변속 담당
				System.out.print("몇 단으로 변속할지 입력 : ");
				cg = sc.nextInt();
				if(1 <= cg && cg <= 5) Lamborghini.ChangeGear(cg);
				else System.out.println("1~5단까지 가능합니다.");
				break;
			case 2:
				//차 속도 증가 담당
				Lamborghini.SpeedUp();
				break;
			case 3:
				//차 속도 감소 담당
				Lamborghini.SpeedDown();
				break;
			default:
				//-1을 입력했을 때 담당
				System.out.println("프로그램 종료.");
				cnd = false;
				break;
			}
		}
	}
}