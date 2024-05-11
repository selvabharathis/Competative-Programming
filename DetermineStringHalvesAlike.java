import java.util.List;

public class DetermineStringHalvesAlike {
    public static boolean halvesAreAlike(String s) {
        String a = s.toLowerCase().substring(0,s.length()/2);
        String b = s.toLowerCase().substring(s.length()/2);
        int av=0, bv=0;
        for(int i=0; i< s.length()/2 ; i++) {
            if(a.charAt(i) == 'a'
                    || a.charAt(i) == 'e'
                    || a.charAt(i) == 'i'
                    || a.charAt(i) == 'o'
                    || a.charAt(i) == 'u') {
                av++;
            }

            if(b.charAt(i) == 'a'
                    || b.charAt(i) == 'e'
                    || b.charAt(i) == 'i'
                    || b.charAt(i) == 'o'
                    || b.charAt(i) == 'u') {
                bv++;
            }
        }
        if(av == bv)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
}
