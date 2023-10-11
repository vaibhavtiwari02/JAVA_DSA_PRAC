import java.util.*;
public class left_rotate_sdArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("original array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+",");
        }
        int firstele=arr[0];
        for (int i = 0; i <n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = firstele;
        System.out.print("After left rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+",");
        }
    }
}
