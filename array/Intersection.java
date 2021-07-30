import java.util.*;
import java.io.*;
class Intersection{
    static void intersection(int[] arr1, int[] arr2, int m, int n){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    list.add(arr1[i]);
            }
        }
    }
    System.out.println(Arrays.toString(list.toArray()));

    }
    public static void main(String[] args){
        int arr1[] = new int[]{1,2,3,4,5,6};
        int[] arr2 = new int[]{2,4,7,8,10};
        int m = arr1.length;
        int n = arr2.length;
        intersection(arr1, arr2, m, n);

    }
}
