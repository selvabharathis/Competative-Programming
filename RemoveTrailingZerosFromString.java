public class RemoveTrailingZerosFromString {
    public static String removeTrailingZeros(String num) {
        for(int i=num.length()-1; i>=0 ; i--) {
            if(num.charAt(i) != '0') {
                return num.substring(0,i+1);
            }
        }
        return num;
    }
    public static void main(String args[]) {
        System.out.println(removeTrailingZeros("51230100"));
    }
}
