import java.util.Scanner;

//정사각형과 직사각형에 따른 메소드 오버로딩
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
		//스캐너 오류 구문 처리
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//넓이를 계산할 C1 객체 생성
		Calculate C1 = new Calculate();
		//사각형 선택 변수, 가로, 세로, 넓이 변수
		int num, width, height, area;
		//사각형의 종류를 선택받아 각 사각형에 맞는 명령어 실행
		System.out.print("사각형의 종류를 선택하세요.(정사각형 : 1, 직사각형 : 2) : ");
		num = sc.nextInt();
		
		//각 사각형에 맞는 명령어를 실행
		if(num == 1) {
			System.out.print("변의 길이 : ");
			int length = sc.nextInt();
			//return 값을 넓이 area 에 넣어서 출력
			area = C1.AreaCalc(length);
			System.out.println("정사각형의 넓이는 " + area);
			
		} else {
			System.out.print("가로의 길이 : ");
			width = sc.nextInt();
			System.out.print("세로의 길이 : ");
			height = sc.nextInt();
			//return 값을 넓이 area 에 넣어서 출력
			area = C1.AreaCalc(width, height);
			System.out.println("직사각형의 넓이는 " + area);
		}
	}
}