public class ReverseWordInString {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0; i < words.length ; i++) {
            String word = words[i];
            String intermediateWord = "";
            for(int end=word.length()-1; end >= 0; end--) {
                intermediateWord = intermediateWord + word.charAt(end);
            }
            result.append(intermediateWord);
            if(i != (words.length -1))
                result.append(" ");
        }
        return result.toString();
    }
    public static void main(String args[]){
        System.out.println("Result: "+reverseWords("Let's take LeetCode contest"));
    }
}
