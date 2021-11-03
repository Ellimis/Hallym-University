
class Box {
    int width, length, height, volume;

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
        volume();
    }

    void volume() {
        volume = width*length*height;
    }

    public String toString() {
        return "Box [가로 = " + width + ", 세로 = " + length + ", 높이 = " + height + ", 부피 = " + volume + "]";
    }
}

public class J1_1108_HW3 {
    public static void main(String[] args) {
        Box b = new Box((int)(Math.random()*10)+1, (int)(Math.random()*10)+1, (int)(Math.random()*10)+1);
        System.out.println(b);
    }
}
