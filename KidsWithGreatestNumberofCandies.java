import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithGreatestNumberofCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largestValue = candies[0];
        for(int val : candies) {
            if(largestValue < val)
                largestValue = val;
        }
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length; i++) {
            if(candies[i]+extraCandies >= largestValue)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number of elements to store in array = ");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.nextInt();

        System.out.print("Enter the extra candies value = ");
        int eCandies = ip.nextInt();

        System.out.println(kidsWithCandies(arr,eCandies));

        ip.close();
    }
}
