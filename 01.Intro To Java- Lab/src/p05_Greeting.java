import java.util.Scanner;

public class p05_Greeting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();

        if(firstName.isEmpty()){
            firstName = "*****";
        }
        if(secondName.isEmpty()){
            secondName = "*****";
        }
        else{
            System.out.printf("Hello, %s %s!", firstName, secondName);
        }

    }


}
