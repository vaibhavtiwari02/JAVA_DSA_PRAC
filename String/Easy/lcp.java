//Longest common prefix
/**
 * lcp
 */
import java.util.*;
 public class lcp {
    public static int lcpre(String str[]){
        Arrays.sort(str);//sorted all elements
        String s1 = str[0]; //smallest element
        String s2 = str[str.length-1];//last element
        int index=0;
        for (int i = 0; i < s1.length(); i++) { //smallest ele ke length tk chalenge
            if(s1.charAt(i) == s2.charAt(i)){
                index++; //if is same then increment index by 1
            }
            else{
                break;
            }
        }
        return index; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in the array: ");
        int n=sc.nextInt();
        String arr[]= new String[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        int index = lcpre(arr);
        if(index == 0)
        System.out.println("");
        else{
            System.out.println(arr[1].substring(0,index)); //preinting the first element till index 
        }
    }
}