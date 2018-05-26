import java.util.Scanner;
import java.util.regex.Pattern;

public class p10MatchPhoneNumber {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       String regex = "^\\+359([-| ])2\\1[0-9]{3}\\1[0-9]{4}$";

       String line = scanner.nextLine();

       while (!line.equals("end")){

           if(Pattern.matches(regex, line)){
               System.out.println(line);
           }
           line = scanner.nextLine();
       }
    }
}
