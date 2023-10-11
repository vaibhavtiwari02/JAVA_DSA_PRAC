package Arrays.Medium;

import java.util.*;

public class rotate90 {
    public static int[][] rotates(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int t = arr[j][i];
                    arr[j][i] = arr[i][j];
                    arr[i][j]=t;
                }
            }
        }
        return arr;
    }

    public static void display(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>n-1){
                    System.out.println();
                }
                else{
                System.out.print(arr[i][j]);
            }
        }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        display(rotates(arr, n), n);
    }
}
