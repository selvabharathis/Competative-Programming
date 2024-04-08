import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                resultArray.add(nums[i]);
            }
        }
        int[] intArray = resultArray.stream().mapToInt(Integer::intValue).toArray();


        System.out.println(Arrays.toString(intArray));

        return intArray.length;
    }

//    public static int removeElement(int[] nums, int val) {
//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[index] = nums[i];
//                index++;
//            }
//        }
//        return index;
//    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.nextInt();

        System.out.println("Enter the element to remove");
        int remove = ip.nextInt();

        System.out.println(removeElement(arr,remove));

        ip.close();
    }
}
