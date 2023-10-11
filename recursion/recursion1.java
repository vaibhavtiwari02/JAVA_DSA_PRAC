//Print name N times using recursion
import java.util.*;
public class Solution {
    public static void printNtimes(int n){
        // Write your code here.
        if(n>0){
            System.out.print("Coding Ninjas");
            n--;
            Solution(n);
        }

    }
    void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Solution(n)
    }
}
