import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int[] ans;
        ans = new int[arr.length];
        ans = sortArr(arr);
        long minSum = minSum(ans);
        long maxSum = maxSum(ans);
        System.out.println(minSum + " " + maxSum);
    }
    /*
     *@param: int[]
     *@ret: int
     *Given sorted integer array, sum first 4 elements of array 
    */
    static long minSum(int[] arr){
        long sum = 0;
        for(int i = 0; i < 4; i++){
            sum += arr[i];
        }
        return sum;
    }

    /*
     *@param: int[]
     *@ret: int
     *Given sorted integer array, sum 4 elements of array starting from arr[1] 
    */
    static long maxSum(int[] arr){
        long sum = 0;
        for(int i = 1; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    /*
     *@param: int[]
     *@ret: int[]
     *Given an integer array, sort it in increasing order and return it
     *I know I could have used Arrays.sort(arr[]) I did this for the sake of practice
    */
    static int[] sortArr(int[] arr){
        int temp;
        int[] ans;
        ans = new int[arr.length];
        //Sort array
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            } 
        }
        //System.out.println(arr);
        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
