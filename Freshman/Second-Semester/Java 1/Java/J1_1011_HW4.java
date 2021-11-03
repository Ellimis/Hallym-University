public class J1_1011_HW4 {
    public static void main(String[] args) {
        int[] array  = new int[7];
        int i, min, max = 0, indexNum = 0;

        //배열 원소를 모두 10 ~ 99 사이의 난수로 초기화
        for(i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()* 90) + 10;
        }

        System.out.println("===== 배열 원소 출력 =====");
        for(int temp : array) {
            System.out.print(temp + "\t");
        }
        System.out.println("");

        //max 값 찾기
        for(i = 0; i < array.length; i++) {
            if(max <= array[i]) {
                max = array[i];
                indexNum = i;
            }
        }
        System.out.println("가장 큰 값 : " + max + "\t index = " + indexNum);

        //min 값 찾기
        min = array[0];
        for(i = 1; i < array.length; i++) {
            if(min >= array[i]) {
                min = array[i];
                indexNum = i;
            }
        }
        System.out.println("가장 작은 값 : " + min + "\t index = " + indexNum);
    }
}
