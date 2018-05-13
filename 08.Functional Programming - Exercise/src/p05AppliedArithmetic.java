import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class p05AppliedArithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();

        Function<Integer, Integer> addOne = num -> num + 1;
        Function<Integer, Integer> subtractOne = num -> num - 1;
        Function<Integer, Integer> multiplyByTwo = num -> num * 2;

        while (true) {
            String command = scanner.nextLine();
            if ("end".equalsIgnoreCase(command)) {
                break;
            }

            if ("add".equalsIgnoreCase(command)) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = addOne.apply(nums[i]);
                }
            } else if ("subtract".equalsIgnoreCase(command)) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = subtractOne.apply(nums[i]);
                }
            } else if ("multiply".equalsIgnoreCase(command)) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = multiplyByTwo.apply(nums[i]);
                }
            } else if ("print".equalsIgnoreCase(command)) {
                System.out.println(Arrays.toString(nums).replaceAll("[\\[\\],]", ""));
            }
        }
    }
}
