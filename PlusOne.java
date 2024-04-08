import java.util.Scanner;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n - 1; i >= 0 ; i-- ) {
            digits[i]++;

            if(digits[i] < 10) {
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[n+1];
        result[0] = 1;

        return result;
    }
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.nextInt();

        System.out.println(plusOne(arr));

        ip.close();
    }
}
