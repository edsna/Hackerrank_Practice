import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        for(int i = 1; i <= n; i++){
            String spaces = spaces(n-i);
            String tags = hashTags(i);
            System.out.println(spaces+tags);
        }

    }

    /*
     *@param: int n
     *@ret: String ans
     *Given an integer n, return a string of n spaces 
    */
    static String spaces(int n){
        String ans = "";
        for(int i = 0; i < n; i++){
            ans = ans + " ";
        }
        return ans;
    }

    /*
     *@param: int n
     *@ret: String ans
     *Given an integer n, return a string of n hashtags 
    */
    static String hashTags(int n){
        String ans = "";
        for(int i = 0; i < n; i++){
            ans = ans + "#";
        }
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
