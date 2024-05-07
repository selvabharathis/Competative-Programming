public class SplitStringInBalancedStrings {
    public static int balancedStringSplit(String s) {
        int count=0, flag = 0;
        for(char c : s.toCharArray()) {
            if(c == 'R')
                flag++;
            else if(c == 'L')
                flag--;
            if(flag == 0)
                count++;
        }
        return count;
    }
    public static void main(String args[]) {
        System.out.println("Result: "+balancedStringSplit("RLRRLLRLRL"));
    }
}
