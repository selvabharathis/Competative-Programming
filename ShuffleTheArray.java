import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[n * 2];
        int i = 0, j=n;
        for(int k=0; k<n*2-1; k = k+2){
            result[k] = nums[i];
            result[k+1] = nums[j];
            i++;
            j++;
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

        System.out.println("Enter the threshold");
        int l = ip.nextInt();

        System.out.println(Arrays.toString(shuffle(arr,l)));

        ip.close();
    }
}
