import java.util.Scanner;

public class J2_0905_P2 {
	public static void main(String[] args) {
		int month;
		int days;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("�ϼ���  �˰� ���� ���� �Է��Ͻÿ� : ");
		month = input.nextInt();
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			break;
			default:
				days = 31;
				break;
		}
		System.out.println(month + "���� �ϼ��� " + days + "�� �Ԉ���.");
	}
}
