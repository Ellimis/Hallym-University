import java.util.*;

public class EnterArray {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int[] dim = new int[5];  //크기가 5인 정수형 배열 선언 & 생성
        System.out.println("정수 데이터를 입력하세요");
        for(int i=0; i<dim.length;i++) {
            //입력 받은 값으로 배열 초기화
            System.out.print(i + "번째 : ");
            dim[i]=key.nextInt();
        }
        System.out.println("\n=== 배열 원소 출력");
        //배열 원소 출력
        for(int i=0; i<dim.length;i++)
            System.out.print(dim[i] + "\t");
    }

}
