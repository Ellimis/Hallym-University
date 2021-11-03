public class Triangle extends Shape {
	public Triangle(int x, int y) {
		setWidth(x);
		setHeight(y);
	}
	
	public double area() {
		return 0.5* getWidth() * getHeight();
	}
}
