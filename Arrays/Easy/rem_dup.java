import java.util.*;

class rem_dup {
    public static void main(String[] args) {
        Set<Integer> sets = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sets.add((arr[i]));
        }
        System.out.println(sets);
        

    }
}