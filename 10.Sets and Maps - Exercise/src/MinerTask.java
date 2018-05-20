import java.util.LinkedHashMap;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

        while(true){

            String material = scanner.nextLine();

            if(material.equals("stop")){
                break;
            }

            int quantity = Integer.parseInt(scanner.nextLine());

            if(!result.containsKey(material)){
                result.put(material,quantity);
            }else{
                result.put(material, result.get(material) + quantity);
            }
        }

        for(String el : result.keySet()){
            System.out.println(el + " -> " + result.get(el));
        }
    }
}
