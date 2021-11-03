public class Loop2 {
    public static void main(String[] args) {
        int rnd, cnt=1;

        do {
            rnd= (int)(Math.random()*1000)+1;
            if(rnd % 5 == 0)
                continue;
            else if(rnd % 6 == 0) { //생성된 난수가 6의 배수이면 난수를 출력하고 반복문 종료
                System.out.println("\nrnd = " + rnd);
                break;
            }
            else
                System.out.print(rnd + (cnt++ % 5 == 0 ? "\n" : "\t" )); //한 행에 5개씩 출력
        }while(true);
        System.out.println("프로그램을 종료합니다.");
    }
}
