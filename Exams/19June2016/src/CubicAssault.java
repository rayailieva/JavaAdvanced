import java.util.HashMap;
import java.util.Scanner;

public class CubicAssault {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        HashMap<String, HashMap<String,Integer>> results = new HashMap<>();

        while (!input.equals("Count em all")){

            String[] tokens = input.split(" -> ");

            String regionName = tokens[0];
            String meteorType = tokens[1];
            int count = Integer.parseInt(tokens[2]);

            if(!results.containsKey(regionName)){
                results.put(regionName, new HashMap<>());
            }
            if(!results.get(regionName).containsKey(meteorType)){
                results.get(regionName).put(meteorType,count);
            }else if(results.get(regionName).containsKey(meteorType)){
                int incrementedValue =  results.get(regionName).get(meteorType) + count;
                results.get(regionName).put(meteorType,incrementedValue);
            }

            input = scanner.nextLine();
        }

        for(String name: results.keySet()){
            System.out.println(name);

            for(String type : results.get(name).keySet()){
                System.out.println("-> " + type + " : " + results.get(name).get(type));
            }
        }
    }
}
