public class MaximumNestingDepthOfParentheses {
    public static int maxDepth(String s) {
        int count = 0;
        int max=0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                count++;
                if(max < count)
                    max = count;
            }
            else if(c == ')')
                count--;

        }
        return max;
    }
    public static void main(String args[]) {
        System.out.println("Result: " + maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}
