import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class p11BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);
        int X = Integer.parseInt(input[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String[] numbers = scanner.nextLine().split(" ");

        for(int i = 0; i < numbers.length; i++){
            queue.add(Integer.parseInt(numbers[i]));
        }

        for(int i = 0; i < S; i++){
            queue.poll();
        }

        if(queue.contains(X)){
            System.out.println(true);
        }else{
            if(queue.isEmpty()){
                System.out.println(0);
            }
            System.out.println(Collections.min(queue));
        }
    }
}
