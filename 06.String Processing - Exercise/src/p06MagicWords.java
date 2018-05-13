import java.util.HashSet;
import java.util.Scanner;

public class p06MagicWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String first = input[0];
        String second = input[1];

        HashSet<Character> firstSet = new HashSet<>();
        HashSet<Character> secondSet = new HashSet<>();

        for (int i = 0; i < first.length(); i++)
        {
            firstSet.add(first.charAt(i));
        }

        for (int i = 0; i < second.length(); i++)
        {
            secondSet.add(second.charAt(i));
        }

        System.out.println(firstSet.size() == secondSet.size() ? "true" : "false");


    }
}
