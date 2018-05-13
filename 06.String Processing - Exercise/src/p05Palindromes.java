import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p05Palindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("[ !?.,]");

        Set<String> palindromes = new TreeSet<>();

        for(String word: text){
            StringBuilder current = new StringBuilder(word);
            current.reverse();

            if (word.equals(current.toString()) && !word.equals("")) {
                palindromes.add(word);
            }
        }

        System.out.println(palindromes);

    }
}
