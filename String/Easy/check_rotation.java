import java.util.*;
public class check_rotation {
    
    public static boolean check(String s1, String s2){
        String tmp=s1+s1+s1;
        if(s1.length() !=  s2.length()){
            return false;
        }
        else if(tmp.contains(s2)) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 =sc.next();
        System.out.println("Enter another string");
        String s2 =sc.next();
        if(check(s1, s2)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }    
}
