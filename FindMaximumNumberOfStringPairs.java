import java.util.stream.Stream;

public class FindMaximumNumberOfStringPairs {
    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++) {
            for(int j=i+1;j<words.length;j++) {
                StringBuilder revWord = new StringBuilder(words[j]);
                if(words[i].equals(revWord.reverse().toString()))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maximumNumberOfStringPairs(Stream.of("cd","ac","dc","ca","zz").toArray(String[]::new)));
    }
}
