import java.util.stream.Stream;

public class ReplaceAllDigitsWithCharacter {
    public static String replaceDigits(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i < s.length()-1; i+=2) {
            result.append(s.charAt(i));
            result.append(shift(s.charAt(i),s.charAt(i+1)));
        }
        if(s.length()%2 != 0)
            result.append(s.charAt(s.length()-1));
        return result.toString();
    }
    public static char shift(char c, char x) {
        return (char)((int)c + Integer.parseInt(String.valueOf(x)));
    }

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1b2c3d4e"));
    }
}
