public class DecrationInstallize {
    public static void main(String[] args) {
        //배열 선언 & 생성 & 초기화
        int[] copyFrom = {1, 2, 3, 4, 5, 6, 7};
        int sum=0;

        //또는 무명 배열을 사용하여 다음과 같은 방법으로 초기화한다
        // int[] copyFrom;
        //copyFrom = new int[] {1, 2, 3, 4, 5, 6, 7};

        //for~each를 이용한 배열 합 계산
        for(int  temp : copyFrom)
            sum += temp;   //배열 원소 합 계산
        System.out.println("배열 원소 합 : " + sum);
    }

}
