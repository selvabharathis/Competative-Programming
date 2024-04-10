import java.util.Arrays;
import java.util.Scanner;

public class LeftAndRightSumDifferences {
    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length-1]=0;
        for(int i=1;i<nums.length;i++) {
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        for(int i=nums.length-1; i>0; i--) {
            rightSum[i-1] = rightSum[i] + nums[i];
        }

        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;

    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.nextInt();

        System.out.println(Arrays.toString(leftRightDifference(arr)));

        ip.close();
    }
}
