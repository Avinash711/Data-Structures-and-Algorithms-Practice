import java.util.*;
import java.io.*;
class Union{
    static void union(int[] arr1, int[] arr2, int m, int n){
        int i =0, j=0;
        int res_arr[] = new int[m+n];
        while(i<m && j<n){
            if (arr1[i] < arr2[j]){
                System.out.println(arr1[i]);
                res_arr[i] = arr1[i++];
                
            }else if(arr1[i]>arr2[j]){
                System.out.println(arr2[j]);
                res_arr[i] = arr2[j++];
                
            }else{
                System.out.println(arr2[j]);
                res_arr[i] = arr2[j++];
                i++;
            }
        }
        //System.out.println(i +" "+ j);
        //System.out.println(Arrays.toString(res_arr));
        while(i<m){
            res_arr[i++] = arr1[i++];
            System.out.println(arr1[i]);
        }
        while(j<n){
            System.out.println(arr2[j]);
            res_arr[i++] = arr2[j++];
        }
        System.out.println(Arrays.toString(res_arr));

    }
    public static void main(String[] args){
        int arr1[] = new int[]{1,2,3,4,5,6};
        int[] arr2 = new int[]{2,4,7,8,10};
        int m = arr1.length;
        int n = arr2.length;
        union(arr1, arr2, m, n);

    }
}
