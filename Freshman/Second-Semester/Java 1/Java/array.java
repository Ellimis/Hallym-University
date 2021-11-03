import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dim;
        int size;

        System.out.print("배열 크기를 입력하세요 : ");
        size = sc.nextInt();
        dim = new int[size];
        for(int i = 0; i < dim.length; i++) {
            dim[i] = (int)(Math.random()* 91) + 10;
        }
        for(int temp : dim) {
            System.out.println(temp);
        }
    }
}
