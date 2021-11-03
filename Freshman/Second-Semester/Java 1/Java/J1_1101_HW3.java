public class J1_1101_HW3 {
    public static void number(int[] grade, int[] freq) {
        for(int i = 0; i < grade.length; i++) {
            grade[i] = (int)(Math.random()*100);
            freq[grade[i]/10]++;
        }
    }

    public static void write(int[] grade) {
        for(int i = 0; i < grade.length; i++) {
            if(i%10 == 0) System.out.println("");
            System.out.print(grade[i] + " ");
        }
    }

    public static void histogram(int[] freq) {
        for(int j = 0; j < freq.length; j++) {
            if(j == 0) System.out.print("0-9("+freq[j]+") : ");
            else System.out.print(j+"0-"+j+"9("+freq[j]+") : ");
            for (int i = 0; i < freq[j]; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[] freq = new int[10];
        int[] grade = new int[50];

        System.out.println("=== 배열 원소 초기화 & 빈도수 계산 ===");
        number(grade, freq);
        System.out.println("=== 배열 전체 원소 출력 ===");
        write(grade);
        System.out.println("\n=== 구간별 빈도수 출력 ===");
        histogram(freq);
    }
}
