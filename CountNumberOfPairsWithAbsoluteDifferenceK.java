import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    // O(n)
    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        Map<Integer,Integer> mapElement = new HashMap<>();
        for (int num : nums) {
            int positiveCount = mapElement.getOrDefault((num + k), 0);
            int negativeCount = mapElement.getOrDefault((num - k), 0);

            count += positiveCount + negativeCount;

            mapElement.put(num, (mapElement.getOrDefault(num, 0)+1));
        }
        // O(n2)
        // for(int selector=0; selector < nums.length; selector++) {
        //     for(int loop=selector+1; loop < nums.length; loop++) {
        //         if(Math.abs(nums[selector] - nums[loop]) == k)
        //             count++;
        //     }
        // }
        return count;
    }
    public static void main(String args[]) {
        System.out.println("Result: " + countKDifference(Stream.of(3,2,1,5,4).mapToInt(Integer::intValue).toArray(), 2));
        // to create a stream of string array.
        String[] myStr = Stream.of("abc","xyz").toArray(String[]::new);
    }
}
