
class Shape1 {
	protected int x, y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle1 extends Shape1 {
	private int width, height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle1 extends Shape1 {
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle1 extends Shape1 {
	private int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}


public class J2_1024_p2 {
	private static Shape1 arrayOfShapes[];
	
	public static void main(String[] args) {
		init();
		drawAll();
	}
	
	public static void init() {
		arrayOfShapes = new Shape1[3];
		arrayOfShapes[0] = new Rectangle1();
		arrayOfShapes[1] = new Triangle1();
		arrayOfShapes[2] = new Circle1();
	}
	
	public static void drawAll() {
		for(int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		}
	}
}
