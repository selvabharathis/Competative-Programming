import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int length = nums.length;
        for(int i=0; i<length ; i++) {
            result[i] = nums[i];
            result[i+length] = nums[i];
        }
        return result;
    }
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.nextInt();

        System.out.println(Arrays.toString(getConcatenation(arr)));

        ip.close();
    }
}
