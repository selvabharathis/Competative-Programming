
public class FindFirstPalindromicStringInArray {

    public static String firstPalindrome(String[] words) {
        String result = "";
        for(String word: words) {
            if(isPalindrome(word)) {
                result = word;
                break;
            }
        }
        return result;
    }
    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while( left < right) {
            if(word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]) {
        String[] myStr = {"abc","car","ada","racecar","cool"};
        System.out.println("Result: " +  firstPalindrome(myStr));
    }
}
