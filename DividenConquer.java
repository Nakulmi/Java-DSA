public class DividenConquer {
    
    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //MERGE SORT
    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2; // or (si + ei)/2
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i =si; // idx dor 1st sorted part
        int j = mid +1; // idx for 2nd sorted part
        int k = 0; // idx for temp

        while(i<= mid && j<= ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // for leftover elements of 1st sorted part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // for leftover elements of 2nd sorted part
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        // copy temp to original array
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    //QUICK SORT
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx = partition(arr, si ,ei);
        quickSort(arr, si, pIdx-1); //left
        quickSort(arr, pIdx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int  i = si - 1; //to make space for elements smaller than pivot

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        int arr[] = {5,90,83,14,34,67,3};
        mergeSort(arr, 0, arr.length-1);
        //quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}