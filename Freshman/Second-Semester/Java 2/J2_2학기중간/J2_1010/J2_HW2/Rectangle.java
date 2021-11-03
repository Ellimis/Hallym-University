public class Rectangle extends Shape {
	public Rectangle(int x, int y) {
		setWidth(x);
		setHeight(y);
	}
	
	public double area() {
		return getWidth() * getHeight();
	}
}
