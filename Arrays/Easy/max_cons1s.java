import java.util.Scanner;

class max_cons1s{

    public static int count1(int arr[], int n){
        int c=0,max=0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1){
                c++;
                if(c>max){
                    max=c;
                }
            }
            else{
                c=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=count1(arr, n);
        System.out.println(max);
    }
}