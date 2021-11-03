import java.util.Scanner;

public class J1_1004_HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //while 문을 돌기 위한 초기값
        int num, i, rnd = 0, cnt = 0;
        char check = 'a';

        while(true) {
            //난수를 매번 생성
            System.out.println("369 게임을 시작합니다.");
            rnd = (int)(Math.random()*900)+100;
            System.out.println("생성된 난수 >>>> " + rnd);

            //난수에 3의 배수가 얼마나 있는지 체크
            cnt = 0;
            for(i = 0; i < 3; i++) {
                if((rnd%10)%3 == 0) cnt++; //첫째 자리수부터 3의 배수면 cnt++
                if((rnd%10) == 0) cnt--; //0도 3의 배수로 인식하므로 cnt--
                rnd /= 10;
            }

            //cnt 수에 따른 박수 횟수
            System.out.print("박수 ");
            switch(cnt) {
                case 1:
                    System.out.println("짝");
                    break;
                case 2:
                    System.out.println("짝짝");
                    break;
                case 3:
                    System.out.println("짝짝짝");
                    break;
                default:
                    System.out.println("없음");
                    break;
            }

            //종료 구문
            System.out.println("종료 하려면 f 또는 F를 입력하세요.");
            check = sc.next().charAt(0);
            if(check == 'f' || check == 'F') break;
        }
    }
}
