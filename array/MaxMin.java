import java.util.*;
import java.lang.*;
import java.io.*;
class Logic{
    public void return_max_min(int arr[], int n){
        int max = arr[0];
        int min = arr[0];
        for (int i =1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max + " is maximum in array");
        System.out.println(min + " is minimum in array");
    }
}
class MaxMin{
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
            obj.return_max_min(arr, n);

        }


    }
}