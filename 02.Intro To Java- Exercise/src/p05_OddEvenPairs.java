import java.util.Scanner;

public class p05_OddEvenPairs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        if(input.length % 2 == 0){
            for(int i = 0; i < input.length; i += 2){
                Integer current = Integer.parseInt(input[i]);
                Integer next = Integer.parseInt(input[i] + 1);

                if(current % 2 == 0 && next % 2 == 0){
                    System.out.printf("%d, %d -> both are even\n", current, next);
                }
                else if(current % 2 != 0 && next % 2 != 0){
                    System.out.printf("%d, %d -> both are odd\n", current,next);
                }
                else {
                    System.out.printf("%d, %d -> different", current, next);
                }
            }
        }
        else{
            System.out.println("invalid length");
        }
    }
}
