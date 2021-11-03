import java.util.*;
public class Loop1{
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean flag=true;
        int count, total=0;

        while(flag) {
            System.out.print(" 1. 주문하기  2. 계산하기  3. 종료\n >>  ");
            switch (key.nextInt()) {
                case 1:
                    System.out.print("> 사과 개수를 입력하세요 :  ");
                    count = key.nextInt();
                    total += count;
                    break;
                case 2:
                    System.out.println("전체 주문한 사과 개수 : " + total);
                    System.out.println("입금할 금액은 " + (total *500) + " 입니다.");
                    break;
                case 3:
                    flag=false;
                    break;
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
