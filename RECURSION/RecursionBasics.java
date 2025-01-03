package RECURSION;

public class RecursionBasics {
    
    //Infinite times Recursion
    public static void p(){
        System.out.println("Hello JAVA");
        p();
    }
    // Print numbers from n to 1 in decreasing order
    public static void printDec(int n){
        if(n<=1){
            System.out.print(1+" ");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    // Print numbers from 1 to n in increasing order
    public static void printInc(int n){ 
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    // Find n!
    public static int factu(int n){
        if(n==0){
            return 1;
        }
        int f1 = factu(n-1);
        int f2 = n*f1;
        return f2;
    }
    //Print Nth Fibonacci Number
    public static int fibonacci(int n){
        //WITH RECUSION
        if(n==0 || n==1){
            return n;
        }
        int fib_nm1 = fibonacci(n-1);
        int fib_nm2 = fibonacci(n-2);
        int fib_n = fib_nm1 + fib_nm2;
        return fib_n;

        //WITHOUT RECURSION
        // if(n==0||n==1){
        //     return n;
        // }
        // long a = 0;
        // long b = 1;
        // long fib = 1;
        // for(int i = 2; i<=n; i++){
        //     fib = a+b;
        //     a=b;
        //     b=fib;
        // }
        // return fib;
    }
    //CHECK IF AN ARRAY IS SORTED
    public static boolean checkSorted(int check[],int i){
        //WITH RECURSION
        if(i == check.length-1){
            return true;
        }
        if(check[i]>check[i+1]){
            return false;
        }
        return checkSorted(check, i+1);

        //WITHOUT RECURSION
        // boolean op = false;
        // for(int i =0; i<check.length-1; i++){
        //     if(check[i]<= check[i+1]){
        //         op = true;
        //     }
        //     else{
        //         op=false;
        //         break;
        //     }
        // }
        // return op;
    }
    //FIND 1st OCCURENCE OF ELEMENT IN ARRAY
    public static int findFirst(int find[], int key, int i){
        //WITH RECURSION
        if(i == find.length){
            return -1;
        }
        if(find[i] == key){
            return i;
        }
        return findFirst(find, key, i+1);

        //WITHOUT RECURSION
        // for(int i =0; i<find.length; i++){
        //     if(find[i]==key){
        //         return i;
        //     }
        // }
        // return -1;
    }
    //FIND LAST OCCURENCE OF ELEMENT IN ARRAY
    public static int findLast(int find[], int key, int i){
        if(i == -1){
            return i;
        }
        if(find[i]==key){
            return i;
        } 
        return findLast(find, key, i-1);
    }
    //PRINT x TO THE POWER m          O(n)
    public static int expo(int x, int m){
        if(m == 0){
            return 1;
        }
        int fnm1 = expo(x, m-1);
        int fn = x*fnm1;
        return fn;
    }
    //OPTIMIZED POWER                  O(logn)
    public static int optiPower(int x, int m){
        if(m == 0){
            return 1;
        }
        int sq = optiPower(x, m/2);
        int sq2 = sq*sq;
        
        // m is odd
        if(m%2 != 0){
            sq2 = x * sq2;
        }
        return sq2;
    }
    public static void main(String args[]){
        System.out.println(optiPower(2, 30));
        //System.out.println(expo(4, 2));
        // int find[] = {8,3,5,9,5,10,2,5,3,4};
        // System.out.println(findLast(find, 1, find.length-1));
        //System.out.println(findFirst(find, 5, 0));
        // int check[] = {1,2,3,6,4,5,7};
        // System.out.println(checkSorted(check,0));
        // int n = 5;
        // System.out.println(fibonacci(n));
        //System.out.println(factu(n));
        // printInc(n);
        //printDec(n);
        //p();
    }
}
