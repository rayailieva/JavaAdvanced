import java.util.Scanner;

public class Snake {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int snakeLength = 1;
        int startRow = 0;
        int startCol = 0;

        int n = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[n][n];

        String[] commands = scanner.nextLine().split(", ");
        initializeMatrix(matrix);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col].equals("s")){
                   startRow = row;
                   startCol = col;
                }
            }
        }

        String currElement;
        String el;

        for(int i = 0; i < commands.length; i++){
            String command = commands[i];

            for (int row = startRow; row < matrix.length; row++) {
                for (int col = startCol; col < matrix[row].length; col++) {

                    if(command.equals("right")){
                       currElement = matrix[row + 1][col];


                    }
                }
            }


        }

        printMatrix(matrix);
    }

    private static void initializeMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {

            String[] inputLine = scanner.nextLine().split("\\s+");

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = inputLine[col];
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
