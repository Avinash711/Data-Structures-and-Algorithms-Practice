import java.util.*;
import java.io.*;
import java.lang.*;


public class Sort012{
    public static void main(String[] args){
        int arr[] =   new int[]{0,0,0,1,2,0,2,1,1,2};

        int low = 0, mid = 0, temp = 0;
        int high = arr.length -1;

        while(mid <=high){
            if (arr[mid] == 0){
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid ++;
            }
            else{
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;

            }
        }
        System.out.println("Sorted array is: "+Arrays.toString(arr));

    }
}