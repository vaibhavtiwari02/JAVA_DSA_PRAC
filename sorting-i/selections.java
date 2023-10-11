import java.util.*;
class Main{
    static int i=0,j=0;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Selections(arr,n);
        System.out.print("sorted array is: ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void Selections(int arr[], int n){
        for(i=0;i<=n-2;i++){  //n-2 because no need to swap at last index
            int min=i;
            for(j=i;j<=n-1;j++){ //from i till size which is n-1.
                if(arr[j]< arr[min]){ //check if jth element is less than ith element
                    min=j;//if yes then minimum is jth element
                }
            }
            int t=arr[min];//swapping min with ith element
            arr[min]=arr[i];
            arr[i]=t;
        }
    }
}
