import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountNumberOfConsistentString {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean flag = true;
        char[] allowedArray = allowed.toCharArray();
        boolean[] presentArray = new boolean[256];
        for(char c : allowedArray) {
            presentArray[c] = true;
        }
        for(String word : words) {
            flag = true;
            for(char c : word.toCharArray()) {
                if(!presentArray[c]) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                count++;
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println("Result: " + countConsistentStrings("ab", Stream.of("ad","bd","aaab","baa","badab").toArray(String[]::new)));
    }
}
