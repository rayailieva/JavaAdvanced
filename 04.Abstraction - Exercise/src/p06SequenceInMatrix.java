import java.util.Scanner;

public class p06SequenceInMatrix {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] line = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);

        String[][] matrix = new String[rows][cols];

        initializeMatrix(matrix);


    }

    private static void initializeMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {

            String[] inputLine = scanner.nextLine().split("\\s+");

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = inputLine[col];
            }
        }
    }

    private static void findLongestSequence(String[][] matrix){
        int length = 0;

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col ++){

            }
        }
    }
}
