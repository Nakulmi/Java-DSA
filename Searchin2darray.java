import java.util.*;

public class Searchin2darray {
    
    // Starting from Top-Right cell
    public static boolean search(int matrix[][], int key){
        int row = 0 , col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if(matrix[row][col] == key){
                System.out.println("key is found at ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    //Starting from Bottom-Left cell
    public static boolean search2(int matrix[][], int key){
        int row = matrix.length-1 , col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if(matrix[row][col] == key){
                System.out.println("key is found at ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40,},
                        {15,25,35,45},
                        {27,29,37,48}
                        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        
        search(matrix,key);
        //search2(matrix,key);
        sc.close();
    }
}
