import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DecompressRunLengthEncodedList {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<nums.length-1; i = i+2) {

            int len = nums[i];
            while(len > 0) {
                result.add(nums[i+1]);
                len--;
            }

        }
        return result.stream().mapToInt(Integer::intValue).toArray();
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

        System.out.println(Arrays.toString(decompressRLElist(arr)));

        ip.close();
    }
}
