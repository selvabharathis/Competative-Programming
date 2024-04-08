import java.util.Scanner;

public class FindValueOfVariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String operator : operations) {
            if(operator.equals("X++") || operator.equals("++X"))
                x++;
            else if(operator.equals("--X") || operator.equals("X--"))
                x--;
        }
        return x;
    }
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.next();

        System.out.println(finalValueAfterOperations(arr));

        ip.close();
    }
}
