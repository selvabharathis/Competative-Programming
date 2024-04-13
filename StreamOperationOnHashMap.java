import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperationOnHashMap {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        map.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


        map.entrySet().stream()
                .filter(entry -> entry.getValue().startsWith("T"))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        map.keySet().stream()
                .map(key -> key * key)
                .forEach(System.out::println);

        List<Integer> keysList = map.keySet().stream()
                .collect(Collectors.toList());

        int sum = map.values().stream()
                .mapToInt(Integer::valueOf)
                .reduce(0, Integer::sum);


    }
}
