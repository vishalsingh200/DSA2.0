package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int res = SecondLargestElement(arr);
        System.out.println(res);

    }
    public static int SecondLargestElement(int[] arr){
        //brute force
//        Arrays.sort(arr);
//        int largest = arr[arr.length - 1];
//        for(int i = arr.length - 2; i >= 0; i--){
//            if(arr[i] != largest){
//                return arr[i];
//            }
//        }
//        return -1;



        //Better Approch
        if(arr.length < 2){
            return -1;
        }
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= largest){
                largest = arr[i];
            }
        }
        int secLar = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= secLar && arr[i] != largest){
                secLar = arr[i];
            }
        }
        return secLar;
    }
}
