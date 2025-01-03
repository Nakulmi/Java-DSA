package PracticeQuestions.Arrays;

class PracticeArray{

    public static int getPairsCount(int[] arr, int sum){

        int count =0;

        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(sum == arr[i] + arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void concatenation(int nums[]){
        int n = nums.length;
        int count = n;
        int ans[] = new int[count];
        for(int i = 0; i<ans.length; i++){
            ans[i] = nums[i];
            System.out.print(ans[i]+" ");
        }
        count ++;
    }
    public static void main(String args[]){
        int nums[] = {1,2,1};
        concatenation(nums);

        // int arr[] = {1,1,1,1};
        // int sum = 2;
        // System.out.println(getPairsCount(arr,sum));
    }
}

class RotatedSortedArray{
    // Method to Print Array Elements
    public static void printArr(int rSarr[]){
        for(int i = 0; i<rSarr.length; i++){
            System.out.print(rSarr[i]+" ");
        }
    }
    //LINEAR SEARCH - it takes more time to solve the rotated sorted array having time complexity O(n)
    public static void index(int rSarr[]){
        for(int i = 0; i<rSarr.length; i++){
            if(rSarr[i] == 0){
                System.out.println("Index of element 0 = "+i);
            }
        }
    }

    //MODIFIEED BINARY SEARCH
    public static int search(int[] rSarr, int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        // CASE: found
        if (rSarr[mid] == tar) {
            return mid;
        }
        // Mid on L1
        if (rSarr[si] <= rSarr[mid]) {
            // Case a: Left
            if (rSarr[si] <= tar && tar <= rSarr[mid]) {
                return search(rSarr, tar, si, mid - 1);
            }
            // Case b: right
            else {
                return search(rSarr, tar, mid + 1, ei);
            }
        }
        // Mid on L2
        else {
            // Case c: right
            if (rSarr[mid] <= tar && tar <= rSarr[ei]) {
                return search(rSarr, tar, mid + 1, ei);
            }
            // Case d: left
            else {
                return search(rSarr, tar, si, mid - 1);
            }
        }
    }
    public static void main(String args[]){
        int rSarr[] = {4,5,6,7,0,1,2};
        printArr(rSarr);
        // System.out.println();
        // index(rSarr);
        int target = 0;
        int tarIdx = search(rSarr, target, 0, rSarr.length-1);
        System.out.println();
        System.err.println(tarIdx); 
    }
}

class Solution {
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        int smallest = Integer.MAX_VALUE;
        int j = 0;
        while(k>0){
            for(int i = 0; i<nums.length; i++){
                if(smallest > nums[i]){
                    smallest = nums[i];
                    j = i;
                }
            }
            nums[j] = smallest*multiplier;
            k--;
        }
        return nums;
    }
    public static void main(String args[]){
        int nums[] = {2,1,3,5,6};
        getFinalState(nums, 5,2);
    }
}