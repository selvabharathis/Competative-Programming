import java.util.Scanner;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0, sum=0, rowLen = accounts.length, colLen = accounts[0].length;
        for(int row=0;row<rowLen;row++) {
            sum = 0;
            for(int col=0; col<colLen; col++) {
                sum = sum + accounts[row][col];
            }
            if(max < sum)
                max = sum;
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Matrix row length = ");
        int rowLen = ip.nextInt();
        System.out.println("Enter Matrix col length = ");
        int colLen = ip.nextInt();

        int[][] matrix = new int[rowLen][colLen];
        System.out.println("Please provide the Matrix");
        for(int row=0; row < rowLen ; row++) {
            for(int col=0; col < colLen ; col++) {
                matrix[row][col] = ip.nextInt();
            }
        }

        System.out.println("Richest Customer wealth is = " + maximumWealth(matrix));
    }
}
