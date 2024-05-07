public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        int firstOccuranceIndex = word.indexOf(ch);
        if(firstOccuranceIndex == -1) {
            return word;
        } else {
            StringBuilder result = new StringBuilder();
            result.append(word.substring(0,firstOccuranceIndex+1)).reverse();
            if(firstOccuranceIndex < word.length()) {
                result.append(word.substring(firstOccuranceIndex+1));
            }
            return result.toString();
        }
    }
    public static void main(String args[]) {
        System.out.println("Result: "+reversePrefix("abcdefd",'d'));
    }
}
