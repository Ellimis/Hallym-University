import java.util.*;

class Rec {
    int garo, sero;

    int area() { return garo * sero; }
    int circum() { return (garo+sero)*2; }

    public String toString() {
        String result = "garo : " + garo;
        result += " sero : " + sero;
        result += " area : " + area();
        result += " circum : " + circum();
        return result;
    }
}

public class RecTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Rec  rec1 = new Rec();  //객체 선언과 생성

        //멤버 접근(필드와 메소드)시 반드시 객체명과 .(dot)를 사용해야 함
        rec1.garo = (int)(Math.random()*20)+10;  //난수로 필드 초기화
        rec1.sero = (int)(Math.random()*20)+10;;
        System.out.println("---------- rec1 ------- \n"+rec1.toString());  //넓이와 둘레 출력

        Rec  rec2 = new Rec();
        System.out.print(">> 가로 :");
        rec2.garo = key.nextInt();  //입력값으로 필드 초기화
        System.out.print(">> 세로 :");
        rec2.sero = key.nextInt(); //입력값으로 필드 초기화
        System.out.println("---------- rec2 ------- \n"+rec2.toString());
    }
}
