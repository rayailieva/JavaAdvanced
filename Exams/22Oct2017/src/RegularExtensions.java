import java.util.Scanner;

public class RegularExtensions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] words = text.split(" ");
        String pattern = scanner.nextLine();
        String newText = "";

        while (!pattern.equals("Print")){

           if(text.contains(pattern)) {
               StringBuilder sb = new StringBuilder(pattern);
               sb.reverse();

               newText = text.replace(pattern, sb);
           }

            pattern = scanner.nextLine();
        }

        System.out.println(newText);
    }
}
