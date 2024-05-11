public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        int w1 = word1.length(), w2 = word2.length(), actualLen=0;
        if(w1 <= w2)
            actualLen = w1;
        else
            actualLen = w2;

        StringBuilder result = new StringBuilder();
        for(int i=0; i < actualLen; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        if(w1 != w2) {
            String leftOver = (w1 < w2)
                    ? word2.substring(actualLen)
                    : word1.substring(actualLen);
            result.append(leftOver);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab","pqrs"));
    }
}
