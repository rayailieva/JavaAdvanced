import java.util.Scanner;
import java.util.regex.Pattern;

public class p09MatchFullName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String regex = ("^[A-Z][a-z]{2,}[ ]{1}[A-Z][a-z]{2,}$");

        while(!line.equals("end")){

            if(Pattern.matches(regex, line)){
                System.out.println(line);
            }

            line = scanner.nextLine();
        }
    }
}
