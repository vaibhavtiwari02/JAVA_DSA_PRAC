import java.util.*;
class check_sorted{

    public static boolean isSorted(int arr[], int n){
        for(int i=n-1;i>=1;i--){
            if(arr[i] >= arr[i-1]){

            }
            else{
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(isSorted(arr, n) == true){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}
