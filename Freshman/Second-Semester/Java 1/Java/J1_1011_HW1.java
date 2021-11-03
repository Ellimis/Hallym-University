import java.util.Scanner;

public class J1_1011_HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = new char[10];

        System.out.println("문자 데이터를 입력하세요.");
        for(int i = 0; i < array.length; i++) {
            System.out.print(i + "번째 : ");
            array[i] = sc.next().charAt(0);
        }

        System.out.println("=== 배열 원소 출력 : 변환 전");
        for(char temp : array) {
            System.out.print(temp + "\t");
        }
        //대문자이면 소문자로, 소문자면 대문자로 변환
        for(int j = 0; j < array.length; j++) {
            if('A' <= array[j] && array[j] <= 'Z') array[j] = (char)(array[j] + 32);
            else if('a' <= array[j] && array[j] <= 'z') array[j] = (char)(array[j] - 32);
        }
        System.out.println("=== 배열 원소 출력 : 변환 후");
        for(char temp : array) {
            System.out.print(temp + "\t");
        }
    }
}
