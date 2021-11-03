public class J1_1011_HW2 {
    public static void main(String[] args) {
        int[] dim = { 4, 7, 2, 8, 3, 12, 23, 11 };
        int[] array = new int[dim.length];

        System.out.println("==== 배열 dim 원소 출력 ");
        for(int temp : dim) {
            System.out.print(temp + "\t");
        }

        //반복문으로 배열 내 모든 값 두배 증가
        for(int i = 0; i < dim.length; i++) {
            array[i] = dim[i]*2;
        }
        System.out.println("");
        System.out.println("==== 배열 array 원소 출력 ");
        for(int temp : array) {
            System.out.print(temp + "\t");
        }
    }
}
