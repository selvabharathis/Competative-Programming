import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberGame {
    public static int[] numberGame(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(i%2 == 0) {
                result[i+1] = nums[i];
            } else {
                result[i-1] = nums[i];
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        int[] arr = new int[n];
        int[] index = new int[n];
        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.nextInt();

        System.out.println(Arrays.toString(numberGame(arr)));

        ip.close();
    }
}
