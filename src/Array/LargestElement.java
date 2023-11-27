package Array;
import java.util.*;

//arr = 1 2 3 4 o/p = 4 otherwise return -1
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int res = Largest(arr);
        System.out.println(res);
    }
    public static int Largest(int[] arr){
        int largest = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] >= largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
