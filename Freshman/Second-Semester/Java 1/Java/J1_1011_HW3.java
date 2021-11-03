public class J1_1011_HW3 {
    public static void main(String[] args) {
        int[] rndArray = new int[10];
        int i, half, temp = 0;

        //난수로 배열 초기화, 범위는 1 ~ 200
        for(i = 0; i < rndArray.length; i++) {
            rndArray[i] = (int)(Math.random()*200) + 1;
        }

        System.out.println("===== 배열 원소 출력 =====");
        for(int tmp : rndArray) {
            System.out.print(tmp + "\t");
        }

        //역순으로 만들기 위한 양 끝값 바꾸기
        half = rndArray.length/2;
        for(int j = 0; j < half; j++) {
            i = rndArray.length -1 -j;
            temp = rndArray[j];
            rndArray[j] = rndArray[i];
            rndArray[i] = temp;
        }

        System.out.println("");
        System.out.println("===== 역순으로 출력 =====");
        for(int tmp : rndArray) {
            System.out.print(tmp + "\t");
        }
    }
}
