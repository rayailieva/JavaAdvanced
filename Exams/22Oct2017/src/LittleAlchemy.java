import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class LittleAlchemy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stones = new ArrayDeque<>();
        Deque<Integer> gold = new ArrayDeque<>();

        String[] inputStones = scanner.nextLine().split(" ");

        for(String n : inputStones){
            stones.addLast(Integer.parseInt(n));
        }
        String commands = scanner.nextLine();

        while (!commands.equals("Revision")){

            String[] tokens = commands.split(" ");
            int value = Integer.parseInt(tokens[2]);

            if(tokens[0].equals("Apply")){
                for(int i = 0; i < value; i++){
                    if(!stones.isEmpty()) {
                        int num = stones.pop();
                        num--;
                        if (num > 0) {
                            stones.addLast(num);
                        } else {
                            gold.addLast(num);
                        }
                    }
                }
            }
            else if(tokens[0].equals("Air") && !gold.isEmpty()){
                stones.addLast(value);
                gold.pop();
             }
             commands = scanner.nextLine();
        }
        System.out.println(stones.toString().replaceAll("[\\[,\\]]", ""));
        System.out.println(gold.size());
    }
}