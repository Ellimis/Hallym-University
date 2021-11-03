public class J1_1025_HW2 {
    public static void main(String[] args) {
        int[] ary = { 2, 3, 41, 13, 66, 19, 4, 95, 37};
        int min, tmp;

        System.out.println("======= Before Sort =======");
        for(int temp : ary) {
            System.out.print(temp + " ");
        }

        System.out.println("");
        //정렬 구문
        for(int i = 0; i < ary.length-1; i++) {
            min = i;
            for(int j = 1+i; j < ary.length; j++) {
                if(ary[j] <= ary[min]) min = j;
            }
            tmp = ary[i];
            ary[i] = ary[min];
            ary[min] = tmp;
        }

        System.out.println("====== After Sort ======");
        for(int temp : ary) {
            System.out.print(temp + " ");
        }
    }
}
