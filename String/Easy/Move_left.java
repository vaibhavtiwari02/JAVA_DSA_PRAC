import java.util.*;
public class Move_left {
    public static String Movel(String s){
        char c[] = s.toCharArray();
        //System.out.println(c[1]);
        char f = c[0];
        for(int i=0;i<s.length()-1;i++){
            c[i]=c[i+1];
        }
        c[s.length()-1] = f;
        return new String(c);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s =sc.next();
        System.out.println(Movel(s));
    }    
}
