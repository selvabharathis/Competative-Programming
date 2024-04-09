import java.util.Scanner;

public class NumberOfEmployeeWhoMetTheTarget {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int noOfEmpMetTarget = 0;
        for(int i=0; i<hours.length ; i++) {
            if(hours[i] >= target) {
                noOfEmpMetTarget++;
            }
        }
        return noOfEmpMetTarget;
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

        System.out.println(numberOfEmployeesWhoMetTarget(arr,target));

        ip.close();
    }
}
