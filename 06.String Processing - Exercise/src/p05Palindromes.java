import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p05Palindromes {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       Set<String> palindromes = new TreeSet<>();

       String[] words = scanner.nextLine().split("[,?!. ]");

       for(String word : words){
           StringBuilder sb = new StringBuilder(word);
           sb.reverse();
           if(word.equals(sb.toString()) && !word.equals("")){
               palindromes.add(word);
           }
       }

        System.out.println(palindromes);
    }
}
