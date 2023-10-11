import java.util.*;
public class missiing {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int arr[] = new int[n];
        for (int i = 0; i < n-1; i++) {
            arr.add(sc.nextInt());
        }
        for (int i = 1; i <=n; i++) {
            if(arr.contains(i)){
                
            }
            else{
                System.out.println(i + " is not present.");
            }
        }
        
    }
}
