public class MaxOddBinaryNumber {
    public static String maximumOddBinaryNumber(String s) {
        long numberOfOnes = s.chars().filter(ch -> ch == '1').count();
        long numberOfZeros = s.length() - numberOfOnes;
        StringBuilder result = new StringBuilder();
        for(int i=0; i < numberOfOnes - 1 ; i++) {
            result.append("1");
        }
        for(int i=0; i< numberOfZeros; i++) {
            result.append("0");
        }
        result.append("1");
        return result.toString();
    }
    public static void main(String args[]) {
        System.out.println("Result: " + maximumOddBinaryNumber("0101"));
    }
}
