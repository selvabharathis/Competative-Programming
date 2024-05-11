import java.util.ArrayList;
import java.util.List;

public class DestinationCity {
    public static String destCity(List<List<String>> paths) {
        List<String> cityA = new ArrayList<String>();
        List<String> cityB = new ArrayList<String>();
        for(int i=0; i<paths.size(); i++) {
            cityA.add(paths.get(i).get(0));
            cityB.add(paths.get(i).get(1));
        }

        for(String city : cityB){
            if(!cityA.contains(city)) {
                return city;
            }
        }
        return "";
    }

    public static void main(String args[]) {
        System.out.print(
                destCity(
                    List.of(
                            List.of("London","New York"),
                            List.of("New York","Lima"),
                            List.of("Lima","Sao Paulo")
                    )
                )
        );
    }
}
