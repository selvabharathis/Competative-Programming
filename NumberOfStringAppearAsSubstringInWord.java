import java.util.stream.Stream;

public class NumberOfStringAppearAsSubstringInWord {
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String pattern : patterns) {
            if(word.contains(pattern))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numOfStrings(Stream.of("a","abc","bc","d").toArray(String[]::new),"abc"));
    }
}
