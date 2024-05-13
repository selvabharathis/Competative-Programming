
public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int len = mat[0].length, sum=0;
        for(int row=0; row < len; row++) {
            for(int col=0; col < len; col++) {
                if(row == col)
                    sum += mat[row][col];
            }
        }
        if(mat[0].length == 1)
            return sum;
        else if(len%2 != 0)
            for(int row=0, col=len-1; (row < len) && (col >= 0);row++, col-- ) {
                if(row != col)
                    sum += mat[row][col];
            }
        else {
            for(int row=0, col=len-1; (row < len) && (col >= 0);row++, col-- ) {
                sum += mat[row][col];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(a));
    }
}
