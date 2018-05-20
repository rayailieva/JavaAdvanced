import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class p08ReverseNumbersStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < input.length; i++){
            stack.push(Integer.parseInt(input[i]));
        }

        for(int num : stack){
            System.out.print(stack.pop() + " ");
        }

    }
}
