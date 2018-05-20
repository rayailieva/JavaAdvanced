import java.util.Arrays;
import java.util.Scanner;

public class p07MatrixShuffling {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] line = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);

        int[][] matrix = new int[rows][cols];

        initializeMatrix(matrix);

        String command = scanner.nextLine();

        while (!command.equals("END")){
            String[] tokens = command.split(" ");
            if(!tokens[0].equals("swap") || tokens.length != 5){
                System.out.println("Invalid input!");
            }

            int row1 = Integer.parseInt(tokens[1]);
            int row2 = Integer.parseInt(tokens[1]);
            int col1 = Integer.parseInt(tokens[1]);
            int col2 = Integer.parseInt(tokens[1]);

            for(int row = 0; row < matrix.length; row++){
                for(int col = 0; col < matrix[row].length; col ++){
                   matrix[row1] = matrix[row2];
                   matrix[col1] = matrix[col2];

                }
            }

            command = scanner.nextLine();
        }
        printMatrix(matrix);
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

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
