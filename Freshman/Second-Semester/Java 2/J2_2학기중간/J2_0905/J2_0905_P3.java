import java.util.Scanner;

public class J2_0905_P3 {
	public static void main(String[] args) {
		int x, y, r;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("�� ���� ������ �Է��Ͻÿ�(ū ��, ���� ��): ");
		x = input.nextInt();
		y = input.nextInt();
		
		while(y != 0) {
			r = x%y;
			x = y;
			y = r;
		}
		System.out.println("�ִ� ������� " + x);
	}
}
