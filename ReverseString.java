import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseString {
    public static void reverseString(Character[] s) {
        for(int start=0,end=s.length-1; start <= end; start++, end--) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
        }
        Arrays.stream(s).iterator().forEachRemaining(System.out::print);
    }
    public static void main(String args[]) {
        reverseString(Stream.of("h", "e", "l", "l", "o").map(c -> (char) c.charAt(0)).toArray(Character[]::new));
    }
}
