import java.util.Scanner;

public class Contest_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] student;
        int cnt, i = 0, sum = 0;
        String name;
        char score;

        System.out.print("이름을 입력하세요 : ");
        name = s.next();
        System.out.print("입력할 성적의 개수를 입력하세요 : ");
        cnt = s.nextInt();
        //성적 개수만큼 배열 생성
        student = new int[cnt];

        //성적 입력받기
        while(i < cnt) {
            System.out.print((i+1) + "번째 성적 입력 : ");
            student[i] = s.nextInt();
            sum += student[i];
            i++;
        }

        //정보 출력
        System.out.println("당신의 이름은 : " + name);
        i = 0;
        while(i < cnt) {
            System.out.print((i+1) + "번째 성적  : " + student[i] + " ");
            i++;
        }
        System.out.println("\n총합은 : " + sum);
        System.out.println("평균은 : " + (sum/cnt));

        //점수의 평균을 10 으로 나눠서 각 숫자에 따른 학점 부여
        switch((sum/cnt)/10) {
            case 10:
            case 9:
                score = 'A';
                break;
            case 8:
                score = 'B';
                break;
            case 7:
                score = 'C';
                break;
            case 6:
                score = 'D';
                break;
            default:
                score = 'F';
                break;
        }
        //출력
        System.out.println("학점은 : " + score);
    }
}
