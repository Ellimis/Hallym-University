import java.util.Scanner;

public class J1_1004_HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, money, budget = 10000;
        boolean exitCode = false;

        do {
            System.out.println("-----------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고출력 | 4. 종료 ");
            System.out.println("-----------------------------------------");
            System.out.print("선택 >> ");
            num = sc.nextInt();
            switch(num) {
                case 1:
                    System.out.print("입금액 : ");
                    money = sc.nextInt();
                    budget += money;
                    break;
                case 2:
                    System.out.print("출금액 : ");
                    money = sc.nextInt();
                    budget -= money;
                    break;
                case 3:
                    System.out.println("잔고 출력 : " + budget);
                    break;
                case 4:
                    System.out.println("종료.");
                    exitCode = true;
                    break;
                default:
                    System.out.println("------ 없는 기능입니다. ------");
                    break;
            }
            if(exitCode) break;
        } while(true);
    }
}
