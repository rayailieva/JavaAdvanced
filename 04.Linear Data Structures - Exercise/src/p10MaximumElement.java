import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class p10MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < n; i++){

            String[] commands = scanner.nextLine().split(" ");

            if(commands.length > 1){
                int element = Integer.parseInt(commands[1]);
                stack.push(element);
            }else{
               int command = Integer.parseInt(commands[0]);
                if(command == 2){
                    stack.pop();
                }
                if(command == 3){
                    System.out.println(Collections.max(stack));
                }
            }
        }
    }
}
