import java.util.Scanner;

public class J2_0905_P4 {
	public static void main(String[] args) {
		int x;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է����ּ���: ");
		x = input.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(x + " * " + i + " = " + (x*i));
		}
	}
}
