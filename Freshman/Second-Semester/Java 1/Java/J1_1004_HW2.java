import java.util.Scanner;

public class J1_1004_HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cnt = 4, rnd = 0, i;
        boolean cnd = false;

        for(i = 0; i < cnt; i++){
            System.out.print((i+1) + " ] 정수를 입력하세요 > ");
            num = sc.nextInt();
            rnd = (int)(Math.random()*10);
            if(rnd < num) {
                System.out.println("난수보다 큰 값을 입력하였습니다.");
            } else if (rnd == num) {
                System.out.println("축하합니다.");
                cnd = true;
                i += 5;
            } else {
                System.out.println("난수보다 작은 값을 입력하였습니다.");
            }
        }
        if(cnd) {
            System.out.println("생성된 난수 " + rnd + " 를 맞췄습니다.");
        } else {
            System.out.println("횟수를 초과했습니다.");
        }
    }
}
