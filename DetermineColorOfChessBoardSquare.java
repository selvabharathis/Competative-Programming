public class DetermineColorOfChessBoardSquare {
    public static boolean squareIsWhite(String coordinates) {
        if((coordinates.charAt(0)%2 != 0) && (coordinates.charAt(1)%2 == 0))
            return true;
        else if((coordinates.charAt(0)%2 == 0) && (coordinates.charAt(1)%2 != 0))
            return true;
        else
            return false;
    }
    public static void main(String args[]) {
        System.out.println(squareIsWhite("a1"));
    }
}
