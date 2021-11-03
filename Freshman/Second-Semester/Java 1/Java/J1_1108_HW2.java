import java.util.Scanner;

class Circle {
    double radius;

    double area() { return radius*radius*(3.14); }
    double circum() { return 2*radius*(3.14); }

    public String toString() {
        String result = String.format("반지름 : %6.2f", radius);
        result += String.format("\t원넓이 : %6.2f", area());
        result += String.format("\t원둘레 : %6.2f", circum());
        return result;
    }
}

public class J1_1108_HW2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("-------- circle1 --------");
        Circle c1 = new Circle();
        c1.radius = (Math.random()*10)+1;
        System.out.println(c1);

        System.out.println("-------- circle2 --------");
        Circle c2 = new Circle();
        System.out.print(">> 반지름 : ");
        c2.radius = key.nextDouble();
        System.out.println(c2);
    }
}
