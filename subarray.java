import java.util.*;

public class subarray {

    public static void SA(int t[]){
        for(int i = 0; i<t.length; i++){
            for(int j = i; j<t.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(t[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxsubarray(int left[]){  //BRUTE FORCE
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<left.length; i++){
            for(int j =i; j<left.length; j++){
                currSum=0;
                for(int k =i; k<=j; k++){
                    currSum += left[k];
                }
                if(currSum>maxSum){
                maxSum=currSum;
                }
                System.out.println(currSum);
            }
        }
        System.out.println("max sum :"+maxSum);
    }

    public static void maxsubarray2(int left[]){  //PREFIX SUM
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[left.length];
        prefix[0] = left[0];
        
        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+left[i];
        }
        for(int i=0; i<left.length; i++){

            for(int j=i; j<left.length; j++){

                currSum = i == 0 ? prefix[j] : prefix[j]-prefix[i-1];
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max SUM : "+maxSum);
    }

    public static void maxsubarray3(int left[]){  //KADANE's ALGORITHM (this code cannot be used when all the elements in array are negative)
        // Apna College code
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<left.length; i++){
            cs += left[i];
            if(cs<0){
                cs =0;
            }   
            ms = Math.max(cs, ms);
        }
        System.out.println("max sum : "+ms);
    }



    public static void main (String args[]){
        int left[]={-7,-6,-4,-5,-3};
        //{-4,-5,-6,-8,-3,-9,-1};
        //SA(left);
        //maxsubarray(left);
        //maxsubarray2(left);
        maxsubarray3(left);

        // Better code for KADANE's ALGOROTHM (can be used for all conditions)
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<left.length; i++){
            cs = Math.max(left[i],cs+left[i]);
            ms = Math.max(ms, cs);
        }
        System.out.println("Max Sum : "+ms);
    }
}
