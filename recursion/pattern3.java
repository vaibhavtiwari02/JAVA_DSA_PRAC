//Print N to 1 using recursion

import java.util.*;
class Main {
    public static void Solutions(int n){
        // Write your code here.
        if(n>0){
            System.out.print(n);
            n--;
            Solutions(n);
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Solutions(n);
    }
}
