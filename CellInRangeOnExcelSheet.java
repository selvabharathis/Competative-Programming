import java.util.ArrayList;
import java.util.List;

public class CellInRangeOnExcelSheet {
    public static List<String> cellsInRange(String s) {
        String[] columnDetails = s.split(":");
        int colLimit = columnDetails[1].charAt(0) - columnDetails[0].charAt(0);
        int rowLimit = (int) columnDetails[1].charAt(1) - (int) columnDetails[0].charAt(1);
        int startingChar = (int) columnDetails[0].charAt(0);
        int startingValue = Math.abs(columnDetails[0].charAt(1) - '0');

        List<String> resultArray = new ArrayList<String>();

        for(int col = 0; col <= colLimit; col++) {
            for(int row = 0; row <= rowLimit; row++) {
                StringBuilder result = new StringBuilder();
                result.append((char) (startingChar + col));
                result.append(startingValue + row);
                resultArray.add(result.toString());
            }
        }

        return resultArray;
    }

    public static void main(String args[]) {
        System.out.println("Result: " + cellsInRange("U7:X9"));
    }
}
