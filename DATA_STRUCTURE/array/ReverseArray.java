import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseArray{
    public static void main(String[] args) throws IOException{
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases:");
        int testcases = Integer.parseInt(br.readLine().trim());
        while (testcases-->0){
            System.out.println("Enter the size of array:");
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println("Enter the array elements with space:");
            int[] arr = new int[n];
            String inputline[] = br.readLine().trim().split(" ");
            for (int i = 0; i<n;i++){
                arr[i] = Integer.parseInt(inputline[i]);
            }
            System.out.println("Array Entered is: "+Arrays.toString(arr));
            System.out.println("Array printed in reversal order is:");
            int rev_arr[] = new int[n];
            for (int i = n-1; i>=0;i--){
                if(i!=0){
                    System.out.print(arr[i]+",");
                    rev_arr[n-1-i] = arr[i];
                }
                if (i==0){
                    System.out.print(arr[i]);
                    rev_arr[n-1]  = arr[i];
                }
            }
            System.out.println("\nReversed array is:"+Arrays.toString(rev_arr));


        }

    }
}