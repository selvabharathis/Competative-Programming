import java.util.stream.Stream;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for(int i=0; i<indices.length ; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }

    public static void main(String args[]) {
        System.out.println("Result = " + restoreString("codeleet",
                Stream.of(4,5,6,7,0,2,1,3).mapToInt(Integer::intValue).toArray()));
    }
}
