import java.util.List;
import java.util.stream.Stream;

public class CountItemsMatchingARule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        enum PHONE {
            type, color, name
        }
        int count = 0;
        for(List<String> phone : items) {
            PHONE rk = PHONE.valueOf(ruleKey);
            if(phone.get(rk.ordinal()).equals(ruleValue))
                count++;
        }
        return count;
    }
    public static void main(String args[]) {
        List<List<String>> items = Stream.of(
                List.of("phone","blue","pixel"),
                List.of("computer","silver","lenovo"),
                List.of("phone","gold","iphone")).toList();
        System.out.println("Result = " + countMatches(items, "color", "silver"));
    }
}
