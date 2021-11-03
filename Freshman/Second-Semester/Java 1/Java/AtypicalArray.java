public class AtypicalArray {
    public static void main(String[] args) {
        int[][] ragged = new int[5][];  //비정형 배열 선언, 행 크기만 제시
        for (int i = 0; i < ragged.length; i++) {
            ragged[i] = new int[i + 1];  //행별 열크기
        }
        for (int i = 0; i < ragged.length; i++) {  //배열명.length : 행크기
            for (int j = 0; j < ragged[i].length; j++) //배열명[행첨자].length : 열크기
                ragged[i][j] = j;  //초기화
        }
        for (int[] row : ragged) {
            for (int data : row)
                System.out.print(data + "     ");
            System.out.println();
        }

    }
}
