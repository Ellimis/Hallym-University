import java.util.Scanner;

public class J2_0905_HW1 {
	public static void main(String[] args) {
		//��ĳ�ʰ� �ȴ����ٴ� �Ϳ� ���� ����ó������
		@SuppressWarnings("resource")
		//����ڷκ��� �ڸ� ��ȣ�� �ޱ� ���� ����
		Scanner input = new Scanner(System.in);
		int i, choice;
		//�ڸ� �迭 ����
		int[] seat = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		//����ó�� ����
		do {
			System.out.println("----------------------");
			//ó�� 10���� �ڸ��� �ִٴ� ���� ��Ÿ���� ����
			for(i = 0; i < 10; i++) {
				System.out.print((i + 1) + " ");
			}
			System.out.println("");
			System.out.println("----------------------");
			//���� ���� �ڸ��� �˷��ִ� ����
			for(i = 0; i < 10; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println("");
			System.out.println("----------------------");
			
			System.out.print("���Ͻô� �¼� ��ȣ�� �Է��ϼ���.(����� -1): ");
			choice = input.nextInt();
			
			//����ڷκ��� ���� �ڸ��� ������� �ƴϸ� ���α׷��� �������� �Ǵ��ϴ� ����
			if(choice == -1) break;
			else if(seat[choice-1] == 1){
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			} else {
				seat[choice-1] = 1;
				System.out.println("����Ǿ����ϴ�.");
			}
		} while(true);
	}
}
