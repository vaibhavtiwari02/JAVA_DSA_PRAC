import java.util.Scanner;

public class left_rot_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the no. of places you want to rotate: (Should be less than size of array)");
        int d=sc.nextInt();
        if(d >= n){
            System.out.println("Invalid");
        }
        if(d == n-1){
            
           for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+ ",");
        }
        }
        else{
        int temp[] = new int[d+1];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        System.out.println("temporary array: ");
        for (int i = 0; i <d; i++) {
             System.out.println(temp[i]);
        }
        //left rotation----->
        int j=0;
        for (int i = 0; i < n; i++) {
            if(i>d){
                arr[i] = temp[j++];
            }
            else{
                arr[i]=arr[d+i];
            }
        }
        System.out.print("Rotated array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+ ",");
        }
        }


}
}
