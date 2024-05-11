public class DecryptStringFromAlphabetToIntegerMapping {
    public static String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=s.length()-1; i >= 0;) {
            char c;
            if(s.charAt(i) == '#') {
                c = (char)(96 + Integer.parseInt(s.substring(i-2,i)));
                i = i-3;
            } else {
                c = (char)(96 + Integer.parseInt(String.valueOf(s.charAt(i))));
                i--;
            }
            result.append(c);
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println("10#11#12");
    }
}
