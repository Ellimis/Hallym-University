import java.util.Scanner;

public class J2_0905_HW2 {
	public static void main(String[] args) {
		//��ĳ�ʰ� �ȴ����ٴ� �Ϳ� ���� ����ó������
		@SuppressWarnings("resource")
		//�Է¹ޱ����� ����
		Scanner input = new Scanner(System.in);
		int num, i, changeNum = 0;
		
		//�л����� �Է¹޾� �迭 �����ϴ� ����
		System.out.print("�л� ���� �Է��Ͻÿ� : ");
		num = input.nextInt();
		int[] studentNum = new int[num];
		
		//�л��� ������ �迭�� ����
		for(i = 0; i < studentNum.length; i++){
			System.out.print((i + 1) + " ��° �л��� ���� : ");
			studentNum[i] = input.nextInt();
		}
		//�Է¹��� ������ ���
		System.out.print("�Է� ���: ");
		for(i = 0; i < studentNum.length; i++) {
			System.out.print(studentNum[i] + " ");
		}
		System.out.println("");
		
		//ū ������ �������� ����
		for(i = 0; i < studentNum.length; i++) {
			for(int j = 1; j < studentNum.length; j++) {
				if(studentNum[j-1] <= studentNum[j]) {
					changeNum = studentNum[j];
					studentNum[j] = studentNum[j-1];
					studentNum[j-1] = changeNum;
				}
			}
		}
		
		//���� ������ �迭 ����� ���
		System.out.print("���� ������ ����: ");
		for(i = 0; i < studentNum.length; i++) {
			System.out.print(studentNum[i] + " ");
		}
		System.out.println("");
		System.out.print("����� �˰� ���� ������ �Է��Ͻÿ�: ");
		num = input.nextInt();
		//�Է¹��� ������ ���� ��� ���
		for(i = 0; i < studentNum.length; i++) {
			if(studentNum[i] == num) 
				System.out.println(num + " ���� " + (i + 1) + " �� �Դϴ�.");
		}
	}
}
