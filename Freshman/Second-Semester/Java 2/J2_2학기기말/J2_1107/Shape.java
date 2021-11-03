
//Compare 인터페이스르 받는 Shape 클래스, comparing 이 없기 때문에 abstract
public abstract class Shape implements Compare{
	protected int x, y;
	
	//생성자
	public Shape() {
		x = 0;
		y = 0;
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//x, y 출력문
	public String toString() {
		return ("Shape at x : " + x + " y : " + y);
	}
}
