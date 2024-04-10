import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CreateTargetArrayInGivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();

        // Iterate through nums and index arrays
        for (int i = 0; i < nums.length; i++) {
            // Insert nums[i] at index[i] in the target list
            targetList.add(index[i], nums[i]);
        }
        return targetList.stream().mapToInt(Integer::intValue).toArray();
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

        System.out.println("Enter the element of index array");
        for(int i=0; i<n; i++)
            index[i] = ip.nextInt();

        System.out.println(Arrays.toString(createTargetArray(arr,index)));

        ip.close();
    }
}
