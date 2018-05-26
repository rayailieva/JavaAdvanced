import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        HashMap<String, Integer> materials = new HashMap<>();

        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        TreeMap<String, Integer> junk = new TreeMap<>();

        String legendary = "";

        while (true) {
            boolean obtained = false;

            String[] tokens = input.split(" ");

            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String materialType = tokens[i + 1];

                if (materials.containsKey(materialType)) {
                    materials.put(materialType, materials.get(materialType) + quantity);
                } else if (!junk.containsKey(materialType)) {
                    junk.put(materialType, quantity);
                } else {
                    junk.put(materialType, junk.get(materialType) + quantity);
                }
                if (materials.get("shards") >= 250
                        || materials.get("fragments") >= 250
                        || materials.get("motes") >= 250) {

                    legendary = materialType.equals("shards") ? "Shadowmourne"
                            : materialType.equals("fragments") ? "Valanyr"
                            : "Dragonwrath";

                    materials.put(materialType, materials.get(materialType) - 250);

                    obtained = true;

                    break;
                }
            }
            if(obtained) {
                break;
            }

            input = scanner.nextLine().toLowerCase();
        }

        System.out.printf("%s obtained!\n", legendary);

        materials.entrySet().stream()
                .sorted((m1,m2) -> {
                    if (Integer.compare(m2.getValue(), m1.getValue()) == 0) {
                        return m1.getKey().compareTo(m2.getKey());
                    }
                    return Integer.compare(m2.getValue(), m1.getValue());
                })
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));

        junk.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));
    }
}

