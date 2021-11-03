import java.util.Scanner;

class info {
    String id;
    int pass;

    public info(String id) {
        this.id = id;
        pass = (int)(Math.random()*9000)+1000;
    }

    void disPlay() {
        System.out.println("Id : " + id + "  Pass : " + pass);
    }
}

public class J1_1108_HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력하세요 >> ");
        info i1 = new info(sc.next());
        System.out.println("첫번째 객체 생성  완료.");
        System.out.print("아이디를 입력하세요 >> ");
        info i2 = new info(sc.next());
        System.out.println("두번째 객체 생성  완료.");

        System.out.println("\n첫 번째 객체의 아이디와 비밀번호 출력");
        i1.disPlay();

        System.out.println("두 번째 객체의 아이디와 비밀번호 출력");
        i2.disPlay();
    }
}
