import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Genome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        HashMap<String, Integer> result = new HashMap<>();

        while(!input.equals("Stop!")){

            Pattern pattern = Pattern.compile("^[a-z!@#$?]+=([0-9])+--([0-9]+)<<([a-z]+)$");
            Matcher matcher = pattern.matcher(input);


            if(matcher.find()){

                int genomes = Integer.parseInt(matcher.group(2));
                String organism = matcher.group(3);

                if(!result.containsKey(organism)){
                    result.put(organism,genomes);
                }else{
                    int currentGenomes = result.get(organism);
                    currentGenomes += genomes;
                    result.put(organism, currentGenomes);
                }
            }

            input = scanner.nextLine();
        }

        Set<Map.Entry<String, Integer>> set = result.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );

        for(var organism : list){

            System.out.println(organism.getKey() + " has genome size of " + organism.getValue());
        }
    }
}
