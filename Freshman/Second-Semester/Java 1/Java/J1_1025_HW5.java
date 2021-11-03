import java.util.Scanner;

public class J1_1025_HW5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, rnd, pay, personNum = 0, hap = 0, returnMoney = 0;
        char cnd = 'a';
        String[][] menu = {{"카푸치노", "3000"},
                            {"에스프레소", "2000"},
                            {"아메리카노", "2500"},
                            {"카페라떼", "3500"},
                            {"자몽에이드", "4000"}};

        do {
            System.out.print("인원 수를 입력하세요 >> ");
            personNum = in.nextInt();

            for (i = 0; i < personNum; i++) {
                rnd = (int)(Math.random() * 5) + 1;
                System.out.println("선택한 난수 : " + rnd + ", 메뉴 : " + menu[rnd-1][0] + ", 가격 : " + menu[rnd-1][1]);
                hap += Integer.parseInt(menu[rnd-1][1]);
            }

            System.out.print("주문합계 : " + hap + "   계산 : ");
            pay = in.nextInt();
            System.out.println("받은 돈 : " + pay);

            returnMoney = pay - hap;
            System.out.println((returnMoney > 0)? "거스름 돈 : " + returnMoney : (returnMoney == 0)? "거스름 돈 없음 " : " 계산 불가능! ");
            hap = 0;

            System.out.print("계속하려면 c 또는 C를 입력하세요 >>> ");
            cnd = in.next().charAt(0);
        } while(cnd == 'c' || cnd == 'C');
        System.out.println("프로그램 종료");
    }
}
