import java.util.Scanner;

public class J2_0926_HW2 {
	@SuppressWarnings( "resource")
	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		
		//���� ���� b1, b2 �׸��� ���� ������ ������ ���� �ٸ� ���
		int b1, b2;
		boolean cnd = false;
		
		//ù ��° �ڽ��� ���� ���� ���� ���� �Է�
		System.out.println("ù ��° ���� ���� ���� �Է� : ");
		Box calc1 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.print("b1 �� ���� : ");
		//ù ��° �ڽ� ���� ���
		b1 = calc1.getVolume();
		System.out.println(b1);
		
		//�� ��° �ڽ��� ���� ���� ���� ���� �Է�
		System.out.println("�� ��° ���� ���� ���� �Է� : ");
		Box calc2 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.print("b2 �� ���� : ");
		//�� ��° �ڽ� ���� ���
		b2 = calc2.getVolume();
		System.out.println(b2);
		
		//�ΰ��� ������ ���ؼ� cnd �� ����
		cnd = calc1.EqualsVolume(calc1, calc2);
		if(cnd == true) System.out.println("�� �ڽ��� ���ǰ� �����ϴ�.");
		else System.out.println("�� �ڽ��� ���ǰ� �ٸ��ϴ�.");
	}
}

class Box {
	private int width, column, height;
	private int volume;
	
	//�����ڷ� ���� ���� ���̸� �޾Ƶ�
	public Box(int w,int c,int h) {
		width = w;
		column = c;
		height = h;
	}
	
	//���� ��� �޼ҵ�
	public int getVolume() {
		volume = width*column*height;
		return volume;
	}
	
	//���ǰ� ������ �Ǵ�
	public Boolean EqualsVolume(Box a, Box b) {
		if(a.volume == b.volume) return true;
		else return false;
	}
}