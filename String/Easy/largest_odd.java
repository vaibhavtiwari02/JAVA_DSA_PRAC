import java.util.*;
public class largest_odd {
    public static String find_max_odd(String s){
        int k = Integer.valueOf(s);
        int max=0;
        int rem=0;
        for (int i = 0; i < s.length(); i++) {
            rem=k%10;
            k=k/10;
            if(rem %2 !=0 && rem>max){
                max=rem;
            }
        }
        return String.valueOf(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find maximum from: ");
        String s = sc.next();
        String max = find_max_odd(s);
        System.out.println(max);
    }
}
