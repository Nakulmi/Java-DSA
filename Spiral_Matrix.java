import java.util.*;

public class Spiral_Matrix {
    
    // Spiral Matrix code when n=m i.e. for square matrix
    public static void spiral(int matrix[][], int n, int m){
        int start_row = 0;
        int start_col = 0;
        int end_row = n-1;
        int end_col = m-1;
        
        while(start_row<=end_row && start_col<=end_col){
            //top
            for(int j = start_col; j< end_col; j++){
                System.out.print(matrix[start_row][j]+" ");
            }

            //rigth
            for(int j = start_row; j< end_row; j++){
                System.out.print(matrix[j][end_col]+" ");
            }

            //bottom
            for(int j = end_col; j> start_col; j--){
                System.out.print(matrix[end_row][j]+" ");
            }

            //left
            for(int j = end_row; j> start_row; j--){
                System.out.print(matrix[j][start_col]+" ");
            }
            
            start_row++;
            start_col++;
            end_col--;
            end_row--;
        }
    }

    public static void main(String args[]){
        System.out.println();
        System.out.println("Original 2d Array");
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };        

        int n = matrix.length, m = matrix[0].length;

        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Spiral matrix");
        spiral(matrix, n, m);
    }
}
