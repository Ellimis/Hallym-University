
//Shape 클래스를 상속받는 Rectangle 클래스
public class Rectangle extends Shape {
	private int width, height;
	
	//생성자
	public Rectangle() {
		width = 0;
		height = 0;
	}
	
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	
	public Rectangle(int x, int y, int w, int h) {
		super(x, y);
		width = w;
		height = h;
	}
	
	//넓이 반환
	public int area() {
		return height*width;
	}
	
	//넓이를 비교하여 크기에 따라 return
	public int comparing(Object r) {
		if(this.area() > ((Rectangle)r).area()) return 1;
		else if(this.area() < ((Rectangle)r).area()) return -1;
		else return 0;
	}
	
	//출력문
	public String toString() {
		return (super.toString() + " width : " + width + " height : " + height);
	}
}
