import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p07_ValidUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        while (!line.equals("END")){
            Pattern pattern = Pattern.compile("^([A-Za-z0-9_-]{3,16})$");
            Matcher matcher = pattern.matcher(line);

            if(matcher.find()){
                System.out.println("valid");
            }else{
                System.out.println("invalid");
            }

            line = scanner.nextLine();
        }

    }
}
