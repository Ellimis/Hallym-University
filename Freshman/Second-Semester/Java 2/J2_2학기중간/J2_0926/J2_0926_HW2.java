import java.util.Scanner;

public class J2_0926_HW2 {
	@SuppressWarnings( "resource")
	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		//부피 담을 b1, b2 그리고 조건 변수로 부피의 같음 다름 출력
		int b1, b2;
		boolean cnd = false;
		
		//첫 번째 박스에 대한 가로 세로 높이 입력
		System.out.println("첫 번째 가로 세로 높이 입력 : ");
		Box calc1 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.print("b1 의 부피 : ");
		//첫 번째 박스 부피 계산
		b1 = calc1.getVolume();
		System.out.println(b1);
		
		//두 번째 박스에 대한 가로 세로 높이 입력
		System.out.println("두 번째 가로 세로 높이 입력 : ");
		Box calc2 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.print("b2 의 부피 : ");
		//두 번째 박스 부피 계산
		b2 = calc2.getVolume();
		System.out.println(b2);
		
		//두개가 같은지 비교해서 cnd 에 저장
		cnd = calc1.EqualsVolume(calc1, calc2);
		if(cnd == true) System.out.println("두 박스는 부피가 같습니다.");
		else System.out.println("두 박스는 부피가 다릅니다.");
	}
}

class Box {
	private int width, column, height;
	private int volume;
	
	//생성자로 가로 세로 높이를 받아둠
	public Box(int w,int c,int h) {
		width = w;
		column = c;
		height = h;
	}
	
	//부피 계산 메소드
	public int getVolume() {
		volume = width*column*height;
		return volume;
	}
	
	//부피가 같은지 판단
	public Boolean EqualsVolume(Box a, Box b) {
		if(a.volume == b.volume) return true;
		else return false;
	}
}