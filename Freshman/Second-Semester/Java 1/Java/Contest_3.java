import java.util.Scanner;

public class Contest_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rnd, i = 0, answer;
        boolean gameResult = true;

        rnd = (int)Math.random()*10+1; //정수형으로 1 ~ 10 범위
        System.out.println("[빙고 게임]");
        System.out.println("기회는 총 5번 입니다.");
        System.out.println("숫자의 범위는 1-10 입니다.");

        //답을 맞출 때 까지 while 돌리기
        while(gameResult) {
            System.out.print((i+1)+"번째 기회 : ");
            answer = s.nextInt();
            //사용자가 입력한 숫자가 난수에 맞는지 체크
            if(rnd > answer) System.out.println("숫자가 작습니다.");
            else if(rnd < answer) System.out.println("숫자가 큽니다.");
            else {
                System.out.println("[ 빙고 ]");
                gameResult = false;
                continue;
            }
            i++;
        }
    }
}
