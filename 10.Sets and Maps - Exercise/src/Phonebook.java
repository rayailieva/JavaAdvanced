import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("search")){
            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];

            phonebook.put(name,number);

            input = scanner.nextLine();
        }

        while(!input.equals("stop")){

            if(!phonebook.containsKey(input) && !input.equals("search")){

                System.out.println("Contact " + input + " does not exist.");
            }else{
                if(!input.equals("search")) {
                    System.out.println(input + " -> " + phonebook.get(input));
                }
            }

            input = scanner.nextLine();
        }

    }
}

