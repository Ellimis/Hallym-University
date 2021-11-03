import java.util.Scanner;

public class J2_0905_HW2 {
	public static void main(String[] args) {
		//스캐너가 안닫힌다는 것에 대한 오류처리구문
		@SuppressWarnings("resource")
		//입력받기위한 구문
		Scanner input = new Scanner(System.in);
		int num, i, changeNum = 0;
		
		//학생수를 입력받아 배열 생성하는 구문
		System.out.print("학생 수를 입력하시오 : ");
		num = input.nextInt();
		int[] studentNum = new int[num];
		
		//학생의 점수를 배열에 저장
		for(i = 0; i < studentNum.length; i++){
			System.out.print((i + 1) + " 번째 학생의 점수 : ");
			studentNum[i] = input.nextInt();
		}
		//입력받은 점수들 출력
		System.out.print("입력 결과: ");
		for(i = 0; i < studentNum.length; i++) {
			System.out.print(studentNum[i] + " ");
		}
		System.out.println("");
		
		//큰 수부터 나오도록 정렬
		for(i = 0; i < studentNum.length; i++) {
			for(int j = 1; j < studentNum.length; j++) {
				if(studentNum[j-1] <= studentNum[j]) {
					changeNum = studentNum[j];
					studentNum[j] = studentNum[j-1];
					studentNum[j-1] = changeNum;
				}
			}
		}
		
		//성적 순으로 배열 됬는지 출력
		System.out.print("성적 순으로 정렬: ");
		for(i = 0; i < studentNum.length; i++) {
			System.out.print(studentNum[i] + " ");
		}
		System.out.println("");
		System.out.print("등수를 알고 싶은 점수를 입력하시오: ");
		num = input.nextInt();
		//입력받은 점수에 따른 등수 출력
		for(i = 0; i < studentNum.length; i++) {
			if(studentNum[i] == num) 
				System.out.println(num + " 점은 " + (i + 1) + " 등 입니다.");
		}
	}
}
