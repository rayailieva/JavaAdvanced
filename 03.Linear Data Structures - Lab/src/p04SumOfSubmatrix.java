import java.util.Scanner;

public class p04SumOfSubmatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(firstLine[0]);
        int cols = Integer.parseInt(firstLine[1]);

        int[][] matrix = new int[rows][cols];

        int biggestSum = Integer.MAX_VALUE;

        for(int row = 0; row < matrix.length; row++){
            String[] reminder = scanner.nextLine().split(", ");
            for(int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = Integer.parseInt(reminder[col]);
            }
        }

        for(int row = 0; row < matrix.length - 1; row++){
            for(int col = 0; col < matrix[row].length - 1; col++){
               int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
               if(sum > biggestSum){
                   biggestSum = sum;
               }
            }
        }

        System.out.println(biggestSum);
        }
}
