public class J1_1025_HW3 {
    public static void main(String[] args) {
        int rnd, maxIndex = 0;
        int[] bindosu = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.print("한 행에 난수를  5 개씩 출력합니다.");
        for(int i = 0; i < 30; i++) {
            rnd = (int)(Math.random() * 10);
            if(i%5 == 0) System.out.println("");
            System.out.print(rnd + " ");
            bindosu[rnd]++;
        }

        System.out.printf("\n난수 : 빈도수\n");
        for(int i = 0; i < bindosu.length; i++) {
            System.out.println("  " + i + " :  " + bindosu[i]);
            if(bindosu[maxIndex] <= bindosu[i]) maxIndex = i;
        }
        System.out.println("가장 많이 생성 된 난수는 " + maxIndex + " 입니다.");
    }
}
