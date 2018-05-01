import java.util.Scanner;

public class p08_GetFirstElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] area = scanner.nextLine().split("\\s+");
        String[] comand = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(comand[1]);
        Integer counter = 1;

        if (comand[2].equals("odd")) {
            for (String anArea : area) {
                if (n >= counter && Integer.parseInt(anArea) % 2 != 0) {
                    System.out.printf("%d ", Integer.parseInt(anArea));
                    counter++;
                }
            }
        }
        else if (comand[2].equals("even")) {
            for (String anArea : area) {
                if (n >= counter && Integer.parseInt(anArea) % 2 == 0) {
                    System.out.printf("%d ", Integer.parseInt(anArea));
                    counter++;
                }

            }
        }
    }
}
