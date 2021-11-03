import java.util.Scanner;

class Car2 {
	//ó�� ���� ���ǵ�, ��� �����ֱ�
	String color = "Blue";
	double nowSpeed = 10.4;
	int nowGear = 1;
	
	//��� ����
	void ChangeGear(int CG) {
		nowGear = CG;
	}
	
	//����
	void SpeedUp() {
		if((nowSpeed + 10) <= 100) nowSpeed += 10;
		else nowSpeed = 100.0;
	}
	
	//����
	void SpeedDown() {
		if((nowSpeed - 10) >= 0) nowSpeed -= 10;
		else nowSpeed = 0.0;
	}
	
	//���� ���� ���
	void CarPrint() { 
		System.out.println("�� ���� : " + color);
		System.out.println("��� : " + nowGear);
		System.out.println("�ӵ� : " + nowSpeed);
		System.out.println("----------------------");
	}
}

public class J2_0919_HW3 {
	public static void main(String[] args) {
		//���ó� �ߴ� Scanner ���� ���� ����
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//Car ��ü ����
		Car2 Lamborghini = new Car2();
		//gear �� ���ӱ� ����� CG �ʵ庯�� ����
		int act, cg;
		//while ���� -1 �Է� �޾��� �� ���� ��Ű�� ���� boolean����
		boolean cnd = true;
		
		while(cnd) {
			//ó�� ���� ���¸� ���
			Lamborghini.CarPrint();
			System.out.print("������ ���� �Է�(���� : 1, ���� : 2, ���� : 3, ���� : -1) : ");
			act = sc.nextInt();
			
			//�Է¹��� ���ۿ� ���� ����
			switch(act) {
			case 1:
				//��� ���� ���
				System.out.print("�� ������ �������� �Է� : ");
				cg = sc.nextInt();
				if(1 <= cg && cg <= 5) Lamborghini.ChangeGear(cg);
				else System.out.println("1~5�ܱ��� �����մϴ�.");
				break;
			case 2:
				//�� �ӵ� ���� ���
				Lamborghini.SpeedUp();
				break;
			case 3:
				//�� �ӵ� ���� ���
				Lamborghini.SpeedDown();
				break;
			default:
				//-1�� �Է����� �� ���
				System.out.println("���α׷� ����.");
				cnd = false;
				break;
			}
		}
	}
}