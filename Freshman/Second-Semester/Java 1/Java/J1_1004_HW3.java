public class J1_1004_HW3 {
    public static void main(String[] args) {
        for(int i = 5; i > 0; i--){
            for(int j = 1; j <= 5; j++) {
                if(i <= j) System.out.printf("%-3c", '*');
                else System.out.printf("%-3c", ' ');
            }
            System.out.println("");
        }
    }
}
