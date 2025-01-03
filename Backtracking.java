public class Backtracking {

    public static void changeArr(int arr[], int i, int val){
        //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        arr[i] = val;
        changeArr(arr, i+1, val+1);  //Recursive Function
        arr[i] = arr[i] - 2;         //Backtracking step
    }
    //PRINT ARRAY ELEMENTS
    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //FIND SUBSETS OF A STRING
    public static void findSubset(String str, String ans, int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.print(ans+" ");
            }
            return;
        }
        findSubset(str, ans+str.charAt(i), i+1);
        findSubset(str, ans, i+1);
    }

    //FIND ALL PERMUTATIONS OF A STRING
    public static void findPermutations(String per, String output){
        if(per.length() == 0){
            System.out.println(output);
            return;
        }
        for(int i=0; i<per.length(); i++){
            char currChar = per.charAt(i);
            String newStr = per.substring(0, i) + per.substring(i+1);
            findPermutations(newStr, output+currChar);
        }
    }

    //CHECK IF QUEEN CAN BE PLACED OR NOT
    public static boolean isSafe(char chessBoard[][], int row, int col){
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(chessBoard[i][col] == 'Q'){
                return false;
            }
        }

        //diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }

        //diag right up
        for(int i=row-1, j=col+1; i>=0 && j<chessBoard.length; i--, j++){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    //N-QUEENS PROBLEM  -> ALL POSSIBLE SOLUTIONS
    public static void nQueens(char chessBoard[][], int row){
        //Base case
        if(row == chessBoard.length){
            printBoard(chessBoard);
            //count++;
            return;
        }
        
        for(int k=0; k<chessBoard.length;k++){
            if(isSafe(chessBoard, row, k)){
                chessBoard[row][k] = 'Q';
                nQueens(chessBoard, row+1); // Function call
                chessBoard[row][k] = 'x';  // Backtracking step
            }
        }
    }
    //METHOD TO PRINT CHESS BOARD
    public static void printBoard(char chessBoard[][]){
        System.out.println("-----------CHESS BOARD-----------");
        for(int i =0; i<chessBoard.length; i++){
            for(int j=0; j<chessBoard.length; j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }
    //static int count = 0;

    // GRID WAYS
    public static int gridWays(int i, int j, int n, int m){
        //BASE CASE
        if(i == n-1 && j == m-1){
            return 1;
        }
        else if(i ==n || j==m){
            return 0;
        }

        //KAAM
        int w1 = gridWays(i+1, j, n, m);  //down move
        int w2 = gridWays(i, j+1, n, m);  //right move
        return w1+w2;
    }
    public static void main(String args[]){
        int n = 3;
        int m = 3;
        System.out.println(gridWays(0,0,n,m));

        // int n =4;
        // char chessBoard[][] = new char[n][n];
        // //Initialize
        // for(int i =0; i<chessBoard.length; i++){
        //     for(int j=0; j<chessBoard.length; j++){
        //         chessBoard[i][j] = 'x';
        //     }
        // }
        //nQueens(chessBoard,0);
        //System.out.println(count);

        // String per = "abc";
        // findPermutations(per, "");

        // String str = "abc";
        // findSubset(str, (""), 0);

        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);
    }
}