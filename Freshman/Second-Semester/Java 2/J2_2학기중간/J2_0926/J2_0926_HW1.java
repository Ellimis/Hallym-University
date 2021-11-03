import java.util.Scanner;

public class J2_0926_HW1 {
	public static void main(String[] args) {
		//정보 넣을 배열 생성
		int[] roomData = new int[5];
		//객체 생성
		ArrayProc calc = new ArrayProc();
		
		//데이터 출력과 평균 계산
		calc.getValues(roomData);
		System.out.println("평균은 : " + calc.getAverage(roomData) + " 입니다.");
	}
}

class ArrayProc {
	@SuppressWarnings("resource")
	//값을 배열에 저장
	public void getValues(int[] num) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++) {
			System.out.print((i+1) + " 번째 방 데이터 입력 : ");
			num[i] = sc.nextInt();
		}
	}

	//평균 계산
	public double getAverage(int[] num) {
		double sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return (sum/num.length);
		
	}
}