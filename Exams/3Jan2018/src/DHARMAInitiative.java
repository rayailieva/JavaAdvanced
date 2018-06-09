import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DHARMAInitiative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        HashMap<String, HashMap<String, String>> data = new HashMap<>();
        String[] stations = {"The Hydra", "The Arrow", "The Flame",
                "The Pearl", "The Orchid"};

        while (!input.equals("Recruit")){

            String[] tokens = input.split(":");
            String name = tokens[0];
            String fn = tokens[1];
            String stationName = tokens[2];

            input = scanner.nextLine();
        }

        String command = scanner.nextLine();

        if(!command.equals("DHARMA Initiative")){

        }else{
            if(!Arrays.asList(stations).contains(command)){
                System.out.println("DHARMA Initiative does not have such a station!");
            }
        }
    }
}
