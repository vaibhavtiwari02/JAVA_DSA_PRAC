package Arrays.Medium;

import java.util.Scanner;

public class twosum {
    public static void find(int arr[], int n, int target){
        int e1=-1, e2=-1;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if((arr[i]+arr[j] == target)){
                e1=i;
                e2=j;
            }   
            }
        }
        if(e1>-1 && e2 >-1){
                System.out.println("YES");
                System.out.println("[ "+e1+", "+e2+" ]");
            }
            else{
                System.out.println("NO");
                System.out.println("[ "+e1+", "+e2+" ]");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t=sc.nextInt();
        find(arr, n, t);
    }
    
}
