import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingWordsWithGivenPrefix {
    public static int prefixCount(String[] words, String pref) {
        int count = 0 , len = pref.length();
        for(String word : words) {
            //if(word.startsWith(pref))
            if(word.length() >= len && pref.equals(word.substring(0,len)))
                count++;
        }
        return count;
    }
    public static void main(String args[]) {
        System.out.println(prefixCount(Stream.of("pay","attention","practice","attend").toArray(String[]::new),"at"));
    }
}
