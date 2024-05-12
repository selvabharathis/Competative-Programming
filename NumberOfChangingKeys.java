public class NumberOfChangingKeys {
    public static int countKeyChanges(String s) {
        int count = 0;
        char[] charArray = s.toLowerCase().toCharArray();
        for(int i=0; i<charArray.length-1; i++) {
            if(charArray[i] != charArray[i+1])
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countKeyChanges("aAbBcC"));
    }
}
