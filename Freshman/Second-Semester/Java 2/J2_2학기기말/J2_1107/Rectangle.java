
//Shape Ŭ������ ��ӹ޴� Rectangle Ŭ����
public class Rectangle extends Shape {
	private int width, height;
	
	//������
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
	
	//���� ��ȯ
	public int area() {
		return height*width;
	}
	
	//���̸� ���Ͽ� ũ�⿡ ���� return
	public int comparing(Object r) {
		if(this.area() > ((Rectangle)r).area()) return 1;
		else if(this.area() < ((Rectangle)r).area()) return -1;
		else return 0;
	}
	
	//��¹�
	public String toString() {
		return (super.toString() + " width : " + width + " height : " + height);
	}
}
