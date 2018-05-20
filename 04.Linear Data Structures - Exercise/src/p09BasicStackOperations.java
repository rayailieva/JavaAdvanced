import java.util.ArrayDeque;
import java.util.Scanner;

public class p09BasicStackOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[0]);

        String[] numbers = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < numbers.length; i++){
            stack.push(Integer.parseInt(numbers[i]));
        }

        while (S > 0){
            stack.pop();
            S--;
        }

        for(int el : stack){
            int element = stack.pop();

            if(element == X){
                System.out.println(true);
            }
        }

    }
}
