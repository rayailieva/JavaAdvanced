import java.util.Scanner;

public class p01_FillTheMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");

        int n = Integer.parseInt(line[0]);
        String pattern = line[1];

        int[][] matrix = new int[n][n];

        if(pattern.equals("A")){
            fillMatrixA(matrix);
        }

        if(pattern.equals("B")){
            fillMatrixB(matrix);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixA(int[][] matrix) {
        int num = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[0].length; row++) {
                matrix[row][col] = num;
                num++;
            }
        }
    }

    private static void fillMatrixB(int[][] matrix){
        int number = 1;
        for (int row = 0; row < matrix.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[col][row] = number++;
                }
            } else {
                for (int col = matrix[row].length - 1; col >= 0 ; col--) {
                    matrix[col][row] = number++;
                }
            }
        }
    }

}