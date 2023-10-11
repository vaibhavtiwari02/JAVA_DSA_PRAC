import java.util.Scanner;

public class appearonce {
    public static int countap(int arr[], int n){
        int xxor=0;
        for (int i = 0; i < n; i++) {
            xxor = xxor ^ arr[i];     
        }
     return xxor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();            
        }
        int single = countap(arr, n);
        System.out.println(single);
    }
}
 //explanation
/*
 xor of the same element is equal to 0 so in case of 1 2 1 2 4 => (1^1)+ (2^2)+4
                                                               => 0 + 0 +4
                                                               ans = 4
 */