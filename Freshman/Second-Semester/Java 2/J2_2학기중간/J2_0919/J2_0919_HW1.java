import java.util.Scanner;

//���簢���� ���簢���� ���� �޼ҵ� �����ε�
class Calculate {
	int AreaCalc(int length){
		return length*length;
	}
	
	int AreaCalc(int width, int height) {
		return width*height;
	}
}

public class J2_0919_HW1 {
	public static void main(String[] args) {
		//��ĳ�� ���� ���� ó��
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//���̸� ����� C1 ��ü ����
		Calculate C1 = new Calculate();
		//�簢�� ���� ����, ����, ����, ���� ����
		int num, width, height, area;
		//�簢���� ������ ���ù޾� �� �簢���� �´� ��ɾ� ����
		System.out.print("�簢���� ������ �����ϼ���.(���簢�� : 1, ���簢�� : 2) : ");
		num = sc.nextInt();
		
		//�� �簢���� �´� ��ɾ ����
		if(num == 1) {
			System.out.print("���� ���� : ");
			int length = sc.nextInt();
			//return ���� ���� area �� �־ ���
			area = C1.AreaCalc(length);
			System.out.println("���簢���� ���̴� " + area);
			
		} else {
			System.out.print("������ ���� : ");
			width = sc.nextInt();
			System.out.print("������ ���� : ");
			height = sc.nextInt();
			//return ���� ���� area �� �־ ���
			area = C1.AreaCalc(width, height);
			System.out.println("���簢���� ���̴� " + area);
		}
	}
}