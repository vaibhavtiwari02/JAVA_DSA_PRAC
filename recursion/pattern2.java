//Print 1 to N using recursion

import java.util.*;
class Main {
    public static void Solutions(int i, int n){
        // Write your code here.
        if(i<=n){
            System.out.print(i);
            i++;
            Solutions(i,n);
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        Solutions(i, n);
    }
}
