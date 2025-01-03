import java.util.*;

public class sorting {

    // Bubble Sort
    public static void BubbleSort(int arr[]){
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }

    // Selection Sort
    public static void SelectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos]<arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }

    // Insertion Sort
    public static void InsertionSort(int arr[]){
        for (int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }

    // Counting Sort
    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]); 
        }

        int  count[]= new int[largest+1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i =0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }

    // Method to print Elements of Array
    public static void print(int arr[]){
        System.out.print("Unsorted Array : ");
        for(int l = 0; l<arr.length; l++){
            System.out.print(arr[l]+" ");
        }
    }
    
    public static void main (String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        print(arr);
        System.out.println();
        System.out.print("Sorted Array : ");

        //BubbleSort(arr);
        //SelectionSort(arr);
        //InsertionSort(arr);
        //CountingSort(arr);

        // Swap array code
        // int mix[]={4,5,2,1,7,6,3};
        // int temp = mix[1];
        // mix[1]=mix[0];
        // mix[0]=temp;
        // for(int  i = 0; i<mix.length; i++){
        //     System.out.print(mix[i]+" ");
        // }
    }
}
