public class FaultyKeyboard {
    public static String finalString(String s) {
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c == 'i')
                result = result.reverse();
            else
                result.append(c);
        }
        return result.toString();
    }
    public static void main(String args[]) {
        System.out.println("Result: " + finalString("string"));
    }
}
