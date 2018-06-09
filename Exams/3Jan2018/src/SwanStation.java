import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwanStation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] theNumbersAsStr = scanner.nextLine().split(" ");
        String[] integersAsStr = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>(6);
        List<Integer> integers = new ArrayList<>();

        List<Integer> removed = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            numbers.add(Integer.parseInt(theNumbersAsStr[i]));
        }
        for(int i = 0; i < integersAsStr.length; i++){
            integers.add(Integer.parseInt(integersAsStr[i]));
        }

        int index = 0;
        while(removed.size() != 6) {
            if (integers.get(index) % numbers.get(0) == 0) {
                removed.add(integers.get(index));
                numbers.remove(numbers.get(0));
                index++;
            } else {
                int num = integers.get(index);
                integers.add(num + 1);
                index++;
            }
        }

        String[] res = new String[6];
        for (int i = 0; i <6; i++) {
            res[i]= String.valueOf(removed.get(i));
        }
        System.out.println(String.join(", ",res));
    }
}
