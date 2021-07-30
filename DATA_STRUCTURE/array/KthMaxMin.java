import java.util.*;
import java.lang.*;
import java.io.*;
class Logic{
    public void return_max_min(int arr[], int k_max, int k_min){
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("Sorted array is: "+Arrays.toString(arr));
        System.out.println(arr[n-1-(k_max-1)] + " is "+k_max+" maximum in array");
        System.out.println(arr[k_min-1] + " is "+k_min+" minimum in array");
    }
}
class KthMaxMin{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases:");
        int t = Integer.parseInt(br.readLine().trim());
        while (t-->0){
            System.out.println("Enter the size of array:");
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println("Enter the array elements with space:");
            int[] arr = new int[n];
            String inputline[] = br.readLine().trim().split(" ");
            for (int i = 0; i<n;i++){
                arr[i] = Integer.parseInt(inputline[i]);
            }
            System.out.println("Array Entered is: "+Arrays.toString(arr));
            Logic obj = new Logic();
            System.out.println("Enter the kth maximum index: ");
            int k_max = Integer.parseInt(br.readLine().trim());
            System.out.println("Enter the kth minimum index: ");
            int k_min = Integer.parseInt(br.readLine().trim());
            obj.return_max_min(arr, k_max, k_min);

        }


    }
}