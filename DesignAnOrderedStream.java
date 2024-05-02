import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DesignAnOrderedStream {

    private String[] record;
    private int pointer;
    public DesignAnOrderedStream(int n) {
        this.record = new String[n+1];
        Arrays.fill(record,"");
        this.pointer = 1;
    }

    public List<String> insert(int idKey, String value) {
        List<String> result = new ArrayList<>();
        record[idKey] = value;
        if(idKey == this.pointer) {
            int loopIndex = this.pointer;
            while((loopIndex < record.length) && (record[loopIndex] != "")) {
                result.add(record[loopIndex]);
                loopIndex++;
            }
            this.pointer = loopIndex;
        }
        return result;
    }
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the stream length: ");
        int streamLen = ip.nextInt();
        DesignAnOrderedStream obj = new DesignAnOrderedStream(streamLen);
        for(int i=0; i< streamLen; i++) {
            System.out.print("Enter idKey: ");
            int idKey = ip.nextInt();
            System.out.println();
            System.out.print("Enter value: ");
            String value = ip.next();
            List<String> param = obj.insert(idKey, value);
            System.out.println("Result stream: " + param);
        }


    }
}
