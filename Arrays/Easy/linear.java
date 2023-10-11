import java.util.*;

/**
 * linear search
 */
public class linear {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int arr[] = new int [n];
       for (int i = 0; i < n; i++) {
        arr[i]= sc.nextInt();
       }
       System.out.println("enter element to be searched: ");
       int e =sc.nextInt();
       int index = linear_search(arr, n, e);
       if(index != -1){
        System.out.println("Element found at index: " + index);
       }
       else{
        System.out.println("Not found");
       }
    }
    public static int linear_search(int arr[], int n, int e){
        for (int i = 0; i < n; i++) {
            if(arr[i] == e){
                return i;
            }      
        }
        return -1;
    }
    
}