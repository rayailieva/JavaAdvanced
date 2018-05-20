import java.util.LinkedHashMap;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String,Long>> result = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("report")){

            String[] tokens = command.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            long population = Long.parseLong(tokens[2]);

            if(!result.containsKey(country)){
                result.put(country, new LinkedHashMap<>());
            }
            if(!result.get(country).containsKey(city)){
                result.get(country).put(city,population);
            }

            command = scanner.nextLine();
        }

        result.entrySet().stream()
                .sorted((country1, country2) -> country2.getValue().values().stream().reduce(0L, Long::sum)
                        .compareTo(country1.getValue().values().stream().reduce(0L, Long::sum)))
                .forEach(country -> {
                    System.out.printf("%s (total population: %d)%n", country.getKey(),
                            country.getValue().values().stream().reduce(0L, Long::sum));
                    country.getValue().entrySet().stream()
                            .sorted((city1, city2) -> city2.getValue().compareTo(city1.getValue()))
                            .forEach(city -> System.out.printf("=>%s: %d%n", city.getKey(), city.getValue()));
                });

    }
}
