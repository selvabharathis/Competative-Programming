import java.util.Arrays;

public class CheckSentenceIsPangram {
    public static boolean checkIfPangram(String sentence) {
        Integer[] alphabet = new Integer[123];
        Arrays.fill(alphabet,0);
        for(char c : sentence.toCharArray()) {
            alphabet[(int)c]++;
        }
        for(int i=97; i<=122; i++) {
            if(alphabet[i] == 0)
                return false;
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println("Result: " + checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}
