import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i< nums.length; i++) {
            result[i] = nums[nums[i]];
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

        System.out.println(Arrays.toString(buildArray(arr)));

        ip.close();
    }
}
