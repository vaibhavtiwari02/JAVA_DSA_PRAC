import java.util.*;

public class Union {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int [n];
        int arr2[] = new int [m];
        for (int i = 0; i < n; i++) {
            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }
        System.out.print("Array 1 : ");
        for (int i = 0; i <n; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n");
        System.out.print("Array 2 : ");
        for (int i = 0; i <m; i++) {
            System.out.print(arr2[i]+" ");
        }




        System.out.print("The union is: ");
        System.out.println(set);


    }
}
