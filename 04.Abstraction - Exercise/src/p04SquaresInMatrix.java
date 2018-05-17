import java.util.Arrays;
import java.util.Scanner;

public class p04SquaresInMatrix {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] line = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);

        String[][] matrix = new String[rows][cols];

        initializeMatrix(matrix);

        int count = 0;

        for(int row = 0; row < matrix.length - 1; row++){
            for(int col = 0; col < matrix[0].length - 1; col ++){
                String firstLetter = matrix[row][col];
                String secondLetter = matrix[row][col + 1];
                String thirdLetter = matrix[row + 1][col];
                String fourthLetter = matrix[row + 1][col + 1];

                if(firstLetter.equals(secondLetter) && secondLetter.equals(thirdLetter)
                        && thirdLetter.equals(fourthLetter) && fourthLetter.equals(firstLetter)){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    private static void initializeMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {

            String[] inputLine = scanner.nextLine().split("\\s+");

            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = inputLine[col];
            }
        }
    }
}
