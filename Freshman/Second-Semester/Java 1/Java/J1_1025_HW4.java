import java.util.Scanner;

public class J1_1025_HW4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row, column, plusNum = 0, i, j;

        System.out.print("행 크기를 입력하세요 >>>> ");
        row = in.nextInt();
        System.out.print("열 크기를 입력하세요 >>>> ");
        column = in.nextInt();

        int[][] matrix = new int[row][column];

        for(i = 0; i < row; i++) {
            if (i % 2 == 0)
                for (j = 0; j < column; j++) {
                    plusNum++;
                    matrix[i][j] = plusNum;
                }
            else
                for (j = 4; j >= 0; j--) {
                    plusNum++;
                    matrix[i][j] = plusNum;
                }
        }

        for(i = 0; i < row; i++) {
            for(j = 0; j < column; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
