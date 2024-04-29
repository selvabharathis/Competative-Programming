import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TruncateSentence {
    public static String truncateSentence(String s, int k) {
        return Stream.of(s.split(" ")).limit(k).collect(Collectors.joining(" "));
    }

    public static void main(String args[]) {
        System.out.println("Result: "+truncateSentence("Hello how are you Contestant", 4));
    }
}
