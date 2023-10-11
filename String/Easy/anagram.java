import java.util.*;
class anagram{
    public static String SortString(String s){
        char s3[] = s.toCharArray();
        Arrays.sort(s3);
        return new String(s3); //converting s3 to string type conversion.
    }

    public static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        
            s1=SortString(s1);
            s2=SortString(s2);
            for (int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i) != s2.charAt(i)){
                    return false;
                }
                
            }
            return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        System.out.println("Enter another string: ");
        String s2 = sc.next();
        if(checkAnagram(s, s2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}