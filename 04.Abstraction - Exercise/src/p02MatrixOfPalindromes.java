import java.util.Scanner;

public class p02MatrixOfPalindromes {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] line = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);

        String[][] matrix = new String[rows][cols];

        initializeMatrix(matrix);
        printMatrix(matrix);

    }

    private static void initializeMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String edgeSymbol = Character.toString((char) ('a' + row));
                String middle = Character.toString((char) ('a' + col + row));

                matrix[row][col] = edgeSymbol + middle + edgeSymbol;
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
