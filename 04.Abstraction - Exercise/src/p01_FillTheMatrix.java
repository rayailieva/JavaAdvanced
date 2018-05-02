import java.util.Scanner;

public class p01_FillTheMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[n][n];

        if(pattern.equals("A")){
            patternA(n,matrix);
        }
        if(pattern.equals("B")){
            patternB(n,matrix);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static void patternA(int n,int matrix[][]){
        int numbers = 1;

        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[col].length; row++) {
                if (col % 2 == 0) {
                    matrix[row][col] = numbers;
                } else {
                    matrix[n - row - 1][col] = numbers;
                }
                numbers++;
            }
        }
    }

    private static void patternB(int n,int matrix[][]){
        int numbers = 1;

        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[col].length; row++) {
                matrix[row][col] = numbers;
                numbers++;
            }
        }
    }
}
