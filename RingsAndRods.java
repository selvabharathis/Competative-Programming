import java.util.*;

public class RingsAndRods {
    public static int countPoints(String rings) {
        Map<Integer,List<String>> dataStructure = new HashMap<Integer,List<String>>();
        for(int i = 0; i < rings.length(); i+=2) {
            //Character.getNumericValue(rings.charAt(i+1))
            int position = Integer.parseInt(String.valueOf(rings.charAt(i+1)));
            List<String> val = dataStructure.getOrDefault(position, new ArrayList<>());
            val.add(String.valueOf(rings.charAt(i)));
            dataStructure.put(position, val);
        }

        int count = 0;
        for(List<String> value : dataStructure.values()) {
            if(value.contains("R") && value.contains("G") && value.contains("B")) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
    }
}
