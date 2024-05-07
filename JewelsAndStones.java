import java.util.Arrays;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Integer[] hash = new Integer[256];
        Arrays.fill(hash, 0);
        for(int i=0; i<stones.length(); i++) {
            hash[stones.charAt(i)]++;
        }
        for(int i=0; i<jewels.length(); i++) {
            count += hash[jewels.charAt(i)];
        }
        return count;
    }
    public static void main(String args[]) {
        System.out.println("Result: "+numJewelsInStones("aA","aAAbbbb"));
    }
}
