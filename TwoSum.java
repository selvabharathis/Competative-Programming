import java.util.*;
class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        // Brute force method
        /*int[] index  = new int[2];
        for(int i=0;i < nums.length; i++) {
            for(int j=0; j < nums.length; j++ ) {
                if((j != i) && (nums[i]+nums[j] == target))  {
                    index[0] = j;
                    index[1] = i;
                    break;
                }
            }
        }
        return index; */

        // using hash
        Map<Integer, Integer> mapValue = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            mapValue.put(nums[i],i);
        }

        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(mapValue.containsKey(complement) && mapValue.get(complement) != i) {
                return new int[]{i, mapValue.get(complement)};
            }
        }
        return null;
    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.nextInt();

        System.out.println("Enter the target value");
        int target = ip.nextInt();

        ip.close();

        int[] result = findTwoSum(arr, target);

        System.out.println(Arrays.toString(result));
    }
}