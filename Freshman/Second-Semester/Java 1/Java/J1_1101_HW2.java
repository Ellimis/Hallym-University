import java.util.Scanner;

public class J1_1101_HW2 {
    public static int input(String personNum, Scanner k) {
        System.out.print(personNum);
        return k.nextInt();
    }

    public static int valueAt(int rnd) {
        int temp = 0;
        switch(rnd) {
            case 1:
                temp =3000;
            break;
            case 2:
                temp = 2000;
            break;
            case 3:
                temp = 2500;
            break;
            case 4:
                temp = 3500;
            break;
            case 5:
                temp = 4000;
            break;
        }
        return temp;
    }

    public static String menuAt(int rnd) {
        String temp = " ";
        switch(rnd) {
            case 1:
                temp = "카푸치노";
                break;
            case 2:
                temp = "에스프레소";
                break;
            case 3:
                temp = "아메리카노";
                break;
            case 4:
                temp = "카페라뗴";
                break;
            case 5:
                temp = "자몽에이드";
                break;
        }
        return temp;
    }

    public static char ch_input(String print, Scanner key) {
        System.out.print(print);
        return key.next().charAt(0);
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String menu = null;
        int cnt, money, total, value = 0;
        char ch;

        do {
            cnt = input("인원수를 입력하세요 >> ", key);
            total = 0;
            for(int i = 0; i < cnt; i++) {
                int rnd = (int)(Math.random()*5)+1;
                value = valueAt(rnd);
                menu = menuAt(rnd);
                System.out.println("난수 : " + rnd + ", 메뉴 : " + menu + ", 가격 : " + value);
                total += value;
            }
            money = input("주문합계 : " + total + " 계산 : ", key);
            System.out.println("받은 돈 : " + money);
            System.out.println((money-total)!=0? "거스름 돈 : " + (money-total) : "거스름 돈 없음");
            ch = ch_input("계속하려면 c 또는 C를 입력하세요 >>>", key);
        } while(ch =='c' || ch == 'C');
        System.out.println("프로그램 종료");
    }
}
