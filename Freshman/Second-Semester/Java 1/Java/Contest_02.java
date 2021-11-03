import java.util.Scanner;

public class Contest_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, max, min;

        while(true) {
            System.out.print("피라미드 바닥 숫자 입력(홀수만) : ");
            num = s.nextInt(); //11입력 가정
            max = num/2; //max = 5
            min = (-1)*max; //min = -5
            if(num%2 == 0 || num == 0) { //num 이 0이면 홀수일 때도 작동함.
                System.out.println("홀수만 입력가능");
            } else {
                num -= max;
                for(int i = 0; i <= max; i++) {
                    for(int j = min; j <= max; j++) {
                        if(Math.abs(j) <= i) System.out.print("*");
                            //-j ~ j 동안 i 랑 같으면 * 출력
                        else System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
