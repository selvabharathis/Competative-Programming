import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {
    public static String decodeMessage(String key, String message) {
        Map<Character,Character> cipherMap = new HashMap<Character,Character>();
        int asciiCode = 97;
        for(char c : key.toCharArray()) {
            if(!cipherMap.containsKey(c) && c != ' ') {
                cipherMap.put(c,(char)asciiCode);
                asciiCode++;
            }
        }
        StringBuilder result = new StringBuilder();
        for(char c : message.toCharArray()) {
            if(cipherMap.containsKey(c))
                result.append(cipherMap.get(c));
            else
                result.append(c);
        }
        return result.toString();
    }
    public static void main(String args[]) {
        System.out.println("Result: "+decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));
    }
}
