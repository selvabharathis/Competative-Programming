import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckStringIsAcronymOfWords {
    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder result = new StringBuilder();
        words.forEach(word -> {
            result.append(word.charAt(0));
        });
        return result.toString().equals(s);
    }
    public static void main(String args[]){
        System.out.println("Result: "+ isAcronym(Stream.of("alice","bob","charlie").toList(), "abc"));
    }
}
