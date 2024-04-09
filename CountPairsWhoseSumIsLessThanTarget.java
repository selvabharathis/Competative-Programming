import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CountPairsWhoseSumIsLessThanTarget {
/*
    public static int countPairs(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array in non-decreasing order
        int n = nums.length;
        int count = 0;

        // Two pointers approach
        int left = 0, right = n - 1;
        while (left < right) {
            if (nums[left] + nums[right] < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
 */
    public static int countPairs(List<Integer> nums, int target) {
        int pairsFound = 0;
        for(int i=0; i<nums.size(); i++) {
            for(int j=i+1; j<nums.size(); j++) {
                if(nums.get(i) + nums.get(j) < target)
                    pairsFound++;
            }
        }
        return pairsFound;
    }
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number of elements to store in array = ");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.nextInt();

        System.out.print("Enter the target value = ");
        int target = ip.nextInt();
        Integer[] integerArray = IntStream.of(arr).boxed().toArray(Integer[]::new);
        List<Integer> myList = Arrays.asList(integerArray);
        System.out.println(countPairs(myList,target));

        ip.close();
    }
}
