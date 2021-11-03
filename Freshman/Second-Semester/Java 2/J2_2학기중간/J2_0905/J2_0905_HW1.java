import java.util.Scanner;

public class J2_0905_HW1 {
	public static void main(String[] args) {
		//스캐너가 안닫힌다는 것에 대한 오류처리구문
		@SuppressWarnings("resource")
		//사용자로부터 자리 번호를 받기 위한 구문
		Scanner input = new Scanner(System.in);
		int i, choice;
		//자리 배열 선언
		int[] seat = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		//예약처리 구문
		do {
			System.out.println("----------------------");
			//처음 10개의 자리가 있다는 것을 나타내는 구문
			for(i = 0; i < 10; i++) {
				System.out.print((i + 1) + " ");
			}
			System.out.println("");
			System.out.println("----------------------");
			//현재 남은 자리를 알려주는 구문
			for(i = 0; i < 10; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println("");
			System.out.println("----------------------");
			
			System.out.print("원하시는 좌석 번호를 입력하세요.(종료는 -1): ");
			choice = input.nextInt();
			
			//사용자로부터 받은 자리가 비었는지 아니면 프로그램을 종료할지 판단하는 구문
			if(choice == -1) break;
			else if(seat[choice-1] == 1){
				System.out.println("이미 예약된 자리입니다.");
			} else {
				seat[choice-1] = 1;
				System.out.println("예약되었습니다.");
			}
		} while(true);
	}
}
