import java.util.Scanner;

public class Shockwave {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] parameters = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(parameters[0]);
        int cols = Integer.parseInt(parameters[1]);

        int[][] matrix = new int[rows][cols];

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col ++){
                matrix[row][col] = 0;
            }
        }
        String input = scanner.nextLine();

        while(!input.equals("Here We Go")){
            String[] tokens = input.split(" ");
            int x1 = Integer.parseInt(tokens[0]);
            int y1 = Integer.parseInt(tokens[1]);
            int x2 = Integer.parseInt(tokens[2]);
            int y2 = Integer.parseInt(tokens[3]);

            for(int i = x1; i <= x2; i++){
                for(int j = y1; j <= y2; j++){
                    matrix[i][j] +=1;
                }
            }
            input = scanner.nextLine();
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
}
