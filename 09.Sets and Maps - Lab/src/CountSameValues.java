import java.util.HashMap;
import java.util.Scanner;

public class CountSameValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> result = new HashMap<>();

        String[] input = scanner.nextLine().split(" ");

        for(String number : input){
            if(!result.containsKey(number)){
                result.put(number, 1);
            }else{
                result.put(number, result.get(number) + 1);
            }
        }

        for(String key : result.keySet()){
            System.out.println(key + " - " + result.get(key) + " times");
        }
    }
}
