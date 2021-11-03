import java.util.Scanner;

public class J1_1004_HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, max = 0;

        while(true) {
            System.out.print("정수를 입력하세요 ___ ");
            num = sc.nextInt();
            if(max < num) {
                max = num;
            } else if (num <= 0) {
                break;
            }
        }
        System.out.println("max = " + max);
    }
}
