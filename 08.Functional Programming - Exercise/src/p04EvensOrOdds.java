import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class p04EvensOrOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String command = scanner.nextLine();
        Integer lower = Integer.parseInt(input[0]);
        Integer upper = Integer.parseInt(input[1]);

        List<Integer> nums = new ArrayList<>();



        if(command.equals("odd")){
            for(int i = lower; i <= upper ; i++){
                if(i % 2 != 0){
                    nums.add(i);
                }
            }
        }
        if(command.equals("even")){
            for(int i = lower; i <= upper ; i++){
                if(i % 2 == 0){
                    nums.add(i);
                }
            }
        }

        for(Integer i: nums){
            System.out.print(i + " ");
        }
    }
}
