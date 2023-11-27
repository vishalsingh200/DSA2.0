package Array;
import java.util.*;


public class LargestElement {
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int res = Largest(arr);
        System.out.println(res);
    }
    public static int Largest(int[] arr){
        int largest = 0;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] >= largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
