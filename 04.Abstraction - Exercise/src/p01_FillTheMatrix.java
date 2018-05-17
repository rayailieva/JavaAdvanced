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

    private static void fillMatrixA(int[][] matrix){
        int num = 1;
        for(int col = 0; col < matrix.length; col++){
            for(int row = 0; row < matrix.length; row++){
                matrix[row][col] = num;
                num++;
            }
        }
    }

    private static void fillMatrixB(int[][] matrix){
        int num = 1;
        for(int col = 0; col < matrix.length; col++){
            for(int row = 0; row < matrix[col].length; row++){
                matrix[row][col] = num++;

            }
            if (++col < matrix.length) {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = num++;
                }
            }
        }
    }

}