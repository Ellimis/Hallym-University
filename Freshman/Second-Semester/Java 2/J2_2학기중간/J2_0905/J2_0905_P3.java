import java.util.Scanner;

public class J2_0905_P3 {
	public static void main(String[] args) {
		int x, y, r;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하시오(큰 수, 작은 수): ");
		x = input.nextInt();
		y = input.nextInt();
		
		while(y != 0) {
			r = x%y;
			x = y;
			y = r;
		}
		System.out.println("최대 공약수는 " + x);
	}
}
