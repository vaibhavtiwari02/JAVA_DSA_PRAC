import java.util.*;
class Second_largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<5;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        for(int i=4;i>=0;i--){
            if(arr.get(i) != arr.get(i-1)){
                System.out.println("Second largest: " + arr.get(i-1));
                break;
            }
        }
    }
}