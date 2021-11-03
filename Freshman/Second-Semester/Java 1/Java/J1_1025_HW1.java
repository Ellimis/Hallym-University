import java.util.Scanner;

public class J1_1025_HW1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] id = {"linux", "unix", "window", "iOS", "android", "dos", "debian"};
        int[] password = new int[id.length];
        boolean cnd = true;

        for(int i = 0; i < id.length; i++) {
            password[i] = (int)(Math.random() * 900) + 100;
        }

        System.out.println("==== 생성된 비밀번호 출력 ====");
        for(int i = 0; i < id.length; i++) {
            System.out.printf("id = %6s\t pass = %4d\n", id[i], password[i]);
        }
        System.out.println("==== id 를 입력하세요. ====");
        String findId = in.next();

        for(int i = 0; i < id.length; i++) {
            if(id[i].equals(findId)) {
                cnd = false;
                System.out.println("입력한 id" + findId + "의 비밀번호는 " + password[i] + " 입니다.");
            }
        }
        if(cnd) {
            System.out.println("입력한 id " + findId + "는(은) 존재하지 않습니다.");
        }
    }
}
