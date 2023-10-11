import java.util.*;
public class move_zero {
int j=-1;
    public static int [] movezero(int arr[], int n){
        int j=-1; 
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                j=i; //j has the indec of 0th element.
                break; // when first 0 ele is found it comes out of the loop 
            }
            
        }
        if(j == -1){  // j is -1 if it has not encountered any 0 in the array
            return arr; // in that case return the original array.
        }
        for(int i=j+1;i<n;i++){ //for i= index of first 0th elemnt +1 if [1204] let j=2
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++; //we swap the 0 with non zero ele and j++
            }
        }
        return arr;    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int arr2[] = movezero(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i]);
        }

    }
}