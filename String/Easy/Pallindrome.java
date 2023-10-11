import java.util.Scanner;

public class Pallindrome {
    public static String pallindrome(String s) {
        String nstr = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
        /*
         * if(nstr != s){
         * return false;
         * }
         * return true;
         */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (pallindrome(s).equals(s)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not pallindrome");
        }
        // System.out.println(check_pallindrome(s));
    }

}
