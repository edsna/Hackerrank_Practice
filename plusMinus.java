import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    /*
    Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. 
    Print the decimal value of each fraction on a new line.

    */
    static void plusMinus(int[] arr) {
        int[] typeCounts;
        typeCounts = new int[3]; 
        typeCounts = countTypes(arr);
        //Get each values
        double N = arr.length;
        double p = typeCounts[0];
        double z = typeCounts[1];
        double n = typeCounts[2];
        //Compute fractions
        double posFract = p/N;
        double negFract = n/N;
        double zerFract = z/N;
        //Print fractions
        System.out.println(posFract);
        System.out.println(negFract);
        System.out.println(zerFract);
    }


    /*
     *@param: int[] arr
     *@ret: int[] counts
     *Takes an array of ints and returns array with type counts
    */
    static int[] countTypes(int[] arr){
        int pos = 0;
        int neg = 0;
        int zer = 0;
        int[] ans;          //Declare returning array
        ans = new int[3];   //Initialize returning array
        //Make counts of each type in array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){     //Count positive types
                pos += 1;
            }else if(arr[i] == 0){  //Count zero types
                zer += 1;
            }else if(arr[i] < 0){   //Count negative types
                neg += 1;
            }else{
                //Do nothing
            }

        }
        //Store each type in returning array
        ans[0] = pos;  
        ans[1] = zer;
        ans[2] = neg;
        //Return array
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
