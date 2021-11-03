
public class J1_1108_HW1 {
    public static void init(int[] arr, int num) {
        int rnd;
        for(int i = 0; i < arr.length; i++) {
            rnd = (int)(Math.random()*50)+1;
            if(rnd%3==0) arr[i] = rnd;
            else i--;
        }
    }

    public static void init(double[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random()*10)+1;
        }
    }

    public static void write(int[] arr, String print) {
        System.out.println("======== " + print + " ========");
        for(int i = 0; i < arr.length; i++) {
            System.out.print("    " + arr[i]);
        }
        System.out.println("");
    }

    public static void write(double[] arr, String print) {
        System.out.println("======== " + print + " ========");
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%7.2f", arr[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] arr1 = new int[7];
        double[] arr2 = new double[10];

        System.out.println("배열을 초기화 합니다.");
        init(arr1, 3);
        init(arr2);

        System.out.println("배열 원소를 출력합니다.");
        write(arr1, "배열 : arr1");
        write(arr2, "배열 : arr2");
    }
}
