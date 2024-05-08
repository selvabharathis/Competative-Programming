public class ToLowerCase {
    public static String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if ('A' <= arr[i] && arr[i] <= 'Z'){
                arr[i] = (char) (arr[i] - 'A' + 'a');
            }
        }
        return new String(arr);
    }
    public static void main(String args[]) {
        System.out.println("Result: " + toLowerCase("Hello"));
    }
}
