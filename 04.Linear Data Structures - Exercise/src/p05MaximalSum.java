import java.util.Arrays;
import java.util.Scanner;

public class p05MaximalSum {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] line = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);

        int[][] matrix = new int[rows][cols];

        initializeMatrix(matrix);

        printMatrixWithBiggestSum(matrix);

    }

    private static void initializeMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {

            int[] inputLineNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = inputLineNumbers[col];
            }
        }
    }

    private static void printMatrixWithBiggestSum(int[][] matrix){
        int biggestSum = Integer.MIN_VALUE;
        int sum;

        for(int row = 0; row < matrix.length - 2; row++){
            for(int col = 0; col < matrix[0].length - 2; col ++){
                sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if(sum > biggestSum){
                    biggestSum = sum;
                }
            }
        }

        System.out.println(biggestSum);
    }
}
