import java.util.Scanner;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if((i != j) && (nums[i] == nums[j]) && (i < j)) {
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.nextInt();

        System.out.println(numIdenticalPairs(arr));

        ip.close();
    }
}
