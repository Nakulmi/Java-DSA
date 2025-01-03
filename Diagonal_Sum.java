import java.util.*;

public class Diagonal_Sum {
    public static void answer(int ds[][], int n, int m){
        int sum =0;
        
        // Time complexity of this code is O(n^2)
        // for(int i = 0; i<n; i++){
        //     for(int j =0; j<m; j++){
        //         if(i==j){                    // primary diagonal
        //             sum = sum+ds[i][j];
        //         }
        //         else if(i+j == n-1){         // secondary diagonal
        //             sum = sum + ds[i][j];
        //         }
        //     }
        // }
        

        // Optmized code for Diagonal sum with Time complexity of O(n)
        for(int i =0; i<n; i++){
            //primary diagonal
            sum += ds[i][i];

            if(i!= n-1-i){     // condition for odd n
                //secondary diagonal
                sum += ds[i][n-1-i];
            }
        }
        System.out.println(sum);
    }

    public static void main (String args[]){
        int ds[][] = {
            {1, 2, 3,3},
            {4, 5, 6,6},
            {7, 8, 9,9},
            {10,11,12,13}
        };

        int n = ds.length;
        int m = ds[0].length;
        answer(ds,n,m);
    }
}
