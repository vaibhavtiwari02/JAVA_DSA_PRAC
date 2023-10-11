package String.Easy;

/**
 * reverse
 */
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String nstr="";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch=s.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("original: "+s);
        System.out.println("reverse: "+nstr);

    }

    
}