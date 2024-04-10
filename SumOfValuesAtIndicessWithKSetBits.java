import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfValuesAtIndicessWithKSetBits {
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.size(); i++) {
            int numberOfOnes = getNumberOfOnesFromBinary(i);
            if(numberOfOnes == k)
                sum = sum + nums.get(i);
        }
        return sum;
    }

    public static int getNumberOfOnesFromBinary(int val) {
        int count = 0;
        while(val > 0) {
            count = count + (val & 1);
            val = val >> 1;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr.add(ip.nextInt());

        System.out.println("Enter k = ");
        int k = ip.nextInt();

        System.out.println(sumIndicesWithKSetBits(arr,k));

        ip.close();
    }
}
