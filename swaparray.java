import java.util.*;

public class swaparray {

    // Optimized Code ;; Time Complexity = O(n) ;; Space Complexity = O(1);
    public static void swap(int arr[]){
        int first = 0 , last = arr.length - 1;
        
        while (first < last){

            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;  

            first++;
            last--;
        }
    }

    // Not Optimized ;; Time Complexity = O(n) ;; Space Complexity = O(n); it takes more space bcoz the array size depends on the size of other array
    public static void notoptimized(int arr[], int arr1[]){
        int first1 = 0, last1 = arr.length-1;

        while (last1 >= 0){
            
            arr1[first1] = arr[last1];

            first1++;
            last1--;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
    }

    public static void main(String args[]){

        int arr[] = {1, 13, 5, 7, 9, 11, 25};
        int arr1[] = new int[arr.length];

        // notoptimized(arr, arr1);
        // System.out.print("Reverse of array ( NOT optimized solution) ");
        // for (int i =0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        swap(arr);
        System.out.print("Reverse of array (optimized solution) ");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
