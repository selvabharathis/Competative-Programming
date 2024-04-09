import java.util.Scanner;
public class RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        int[] sumArray = new int[nums.length];
        sumArray[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            sumArray[i] = nums[i] + sumArray[i-1];
        }
        return sumArray;
    }
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number of elements to store in array = ");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.nextInt();

        System.out.println(runningSum(arr));

        ip.close();
    }
}
