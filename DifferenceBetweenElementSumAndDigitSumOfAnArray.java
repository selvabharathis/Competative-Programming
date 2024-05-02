import java.util.Arrays;
import java.util.stream.Stream;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
    public static int differenceOfSum(int[] nums) {
        //int sumOfArray = Arrays.stream(nums).sum();
        int sumOfArray = 0;
        int sumOfDigitsInArray = 0;
        for(int i=0; i < nums.length; i++) {
            sumOfArray += nums[i];
            if(nums[i] < 10) {
                sumOfDigitsInArray += nums[i];
            } else {
                int rem, temp = nums[i];
                while(temp != 0) {
                    rem = temp % 10;
                    sumOfDigitsInArray += rem;
                    temp = temp / 10;
                }
            }
        }
        return Math.abs(sumOfArray - sumOfDigitsInArray);
    }
    public static void main(String args[]) {
        System.out.println("Result: " + differenceOfSum(Stream.of(1,15,6,3).mapToInt(Integer::intValue).toArray()));
        int[] testCase2 = {1,2,3,4};
        System.out.println("Result: " + differenceOfSum(testCase2));
    }
}
