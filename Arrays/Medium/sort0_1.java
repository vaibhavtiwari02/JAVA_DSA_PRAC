package Arrays.Medium;

/**
 * sort0_1
 */
public class sort0_1 {
    public static int[] sorts(int arr[]) {
        int low = 0, high = arr.length-1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] < arr[low]) {
                int t = arr[low];
                arr[low] = arr[mid];
                arr[mid] = t;
            }
            low++;
        }
        return arr;
    }
    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={0,2,1,0,0,1,2};
        //
        display(sorts(arr));

    
    }

}