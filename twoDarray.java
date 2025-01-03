import java.util.*;

public class twoDarray {
    
    //method to find a number in a 2d array
    public static boolean search(int darray[][], int key){
        for(int i = 0; i<darray.length; i++){
            for(int j = 0; j<darray[0].length; j++){
                if(darray[i][j] == key){
                    System.out.println(i+" "+j);
                    return true;
                }
            }
        }
        return false;
    }

    // method to calculate the occurence of a number in an array
    public static void count(int arr[][], int key){
        int count1 = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] == key){
                    count1++;
                }
            }
        }
        System.out.println(count1);
    }

    // method to find the sum of 2nd row of array
    public static void sum(int nums[][]){
        int i =1;
        int sums=0;
        for(int j = 0; j<nums[0].length; j++){
            sums += nums[i][j];
        }
        System.out.println(sums);
    }

    // method to find the transpose a matrix
    public static void transpose(int trans[][]){

        System.out.println("Original Matrix :");
        for(int i = 0; i<trans.length; i++){
            for(int j = 0; j<trans[0].length; j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix :");
        for(int i = 0; i<trans[0].length; i++){
            for(int j = 0; j<trans.length; j++){
                System.out.print(trans[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        // int arr[][] = {{4,7,8},{8,8,7}};
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number :");
        // int key = sc.nextInt();
        // count(arr, key);

        // int nums[][] = {{1,4,9},
        //                 {11,4,3},
        //                 {2,2,3}};
        // sum(nums);

        int trans[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}};
        transpose(trans);

        // int mynumber[][] = {{1,5,4}, {6,2,3}};
        // System.out.println(mynumber[0][1]);

        // int darray[][] = new int[2][3];
    
        // int n = darray.length, m = darray[0].length;   // to calculate row and column repectively
        // System.out.println(n+" "+m);

        // // input in 2d array
        // Scanner sc = new Scanner(System.in);
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<m; j++){
        //         darray[i][j] = sc.nextInt();
        //     }
        // }

        // // output/print of 2d array
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<m; j++){
        //         System.out.print(darray[i][j]+" ");;
        //     }
        //     System.out.println();
        // }
        // search(darray, 4);        
    }
}