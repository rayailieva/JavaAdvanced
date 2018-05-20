import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> result = new LinkedHashMap<>();

        String name = scanner.nextLine();

        while(true){

            if(name.equals("stop")){
                break;
            }
            String email = scanner.nextLine();

                if(!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")&& !result.containsKey(name)) {
                    result.put(name, email);
                }

            name = scanner.nextLine();
        }

        for(String person : result.keySet()){
            System.out.println(person + " -> " + result.get(person));
        }
    }
}
