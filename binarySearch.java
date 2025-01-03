import java.util.*;

public class binarySearch {
    
    public static int binary(int num[], int key){
        int start = 0;
        int end = num.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            //comparision
            if(num[mid] == key){
                return mid;
            }
            else if(num[mid]<key){
                // rigth part
                start = mid +1;
            }
            else{
                // left part
                end = mid -1;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int num[] = {7, 12, 14, 16, 19, 25, 34};
    
        int key = 12;

        System.out.println("The key is at Index : "+binary(num,key));
    }
}
