public class J1_1101_HW1 {
    public static void init(int[] array, int i) {
        int temp;

        for(int j = 0; j < array.length; j++) {
            temp = (int)(Math.random()*50)+1;
            if(temp%3 == 0) { array[j] = temp; }
        }
    }

    public static void write(int[] array, String n) {
        System.out.println("==== " + n + " ====");
        for(int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] arr1 = new int[7];
        int[] arr2 = new int[10];

        System.out.println("배열을 초기화 합니다.");
        init(arr1, 3);
        init(arr2, 6);

        System.out.println("배열 원소를 출력 합니다.");
        write(arr1, "배열 : arr1");
        write(arr2, "배열 : arr2");
    }
}
