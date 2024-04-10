import java.util.Arrays;
import java.util.Scanner;

public class DecodeXORedArray {
    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0] = first;
        for(int i=0; i<encoded.length; i++) {
            // Perform bitwise XOR
            arr[i+1] = encoded[i] ^ arr[i];
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.nextInt();
        System.out.println("Enter first element = ");
        int first = ip.nextInt();

        System.out.println(Arrays.toString(decode(arr, first)));

        ip.close();
    }
}
