import java.util.Scanner;

public class J2_0926_HW1 {
	public static void main(String[] args) {
		//���� ���� �迭 ����
		int[] roomData = new int[5];
		//��ü ����
		ArrayProc calc = new ArrayProc();
		
		//������ ��°� ��� ���
		calc.getValues(roomData);
		System.out.println("����� : " + calc.getAverage(roomData) + " �Դϴ�.");
	}
}

class ArrayProc {
	@SuppressWarnings("resource")
	//���� �迭�� ����
	public void getValues(int[] num) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++) {
			System.out.print((i+1) + " ��° �� ������ �Է� : ");
			num[i] = sc.nextInt();
		}
	}

	//��� ���
	public double getAverage(int[] num) {
		double sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return (sum/num.length);
		
	}
}