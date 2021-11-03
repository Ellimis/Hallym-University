import java.util.Scanner;

public class J1_HW {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hap = 0, num = 0;
        char ch = 'a';
        String coffeeName;
        char coffee;
        boolean cnd = true;

        do {
            System.out.print("커피종류와 수량을 입력하세요 >>>");
            coffeeName = sc.nextLine();
            coffee = coffeeName.charAt(1);
            switch(coffee){
                case '메':
                    num = coffeeName.charAt(6)-'0';
                    hap += num*2000;
                    break;
                case '스':
                    num = coffeeName.charAt(6)-'0';
                    hap += num*2500;
                    break;
                case '푸':
                    num = coffeeName.charAt(5)-'0';
                    hap += num*3000;
                    break;
                case '페':
                    num = coffeeName.charAt(5)-'0';
                    hap += num*3500;
                    break;
                default:
                    System.out.println("없 습 니 다.");
                    break;
            }
            System.out.print("추가 주문 하시겠습니까? >>>");
            ch = sc.next().charAt(0);
            if(ch == 'n' || ch == 'N') cnd = false;
            sc.nextLine();
        } while (cnd);
        System.out.print("주문합계 : " + hap + "\t계산 : ");
        int acount = sc.nextInt();
        System.out.println("받은 돈 : " + acount);
        if(hap < acount) System.out.println("거스름 돈 : " + (acount - hap));
        else if(hap == acount) System.out.println("거스름 돈 없음");
        else System.out.println("잔돈 부족");
        System.out.println("----- 프로그램 종료 -----");
    }
}
