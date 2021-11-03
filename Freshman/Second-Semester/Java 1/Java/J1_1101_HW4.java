public class J1_1101_HW4 {
    public static void int_copy(int[] is, int[] it) {
        for(int i = 0; i < is.length; i++) {
            it[i] = is[i];
        }
    }

    public static void int_write(int[] it) {
        for(int i = 0; i < it.length; i++) {
            System.out.print(it[i] + " ");
        }
        System.out.println("");
    }

    public static void char_copy(char[] cs, char[] ct) {
        for(int i = 0; i < cs.length; i++) {
            ct[i] = cs[i];
        }
    }

    public static void char_write(char[] ct) {
        for(int i = 0; i < ct.length; i++) {
            System.out.print(ct[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] isource= {21, 34, 76, 38, 11, 8, 56, 98, 64};
        char[] csource = {'s', 'g', 'w', 'y', 'i', 'p', 'a', 'c'};
        int[] itarget=new int[isource.length];
        char[] ctarget=new char[csource.length];

        System.out.println("=== 복사 결과 출력(int)===");
        int_copy(isource, itarget);
        int_write(itarget);
        System.out.println("=== 복사 결과 출력(char)===");
        char_copy(csource, ctarget);
        char_write(ctarget);
    }
}
