import java.util.*;

public class method {

    // method made by me
    public static void players(String fname){
        System.out.println(fname +" Mishra");
    }

    public static int calculate(int a , int b ){
        int sum = a+b;
        return sum;
    }

    public static int multi (int a , int b){
        int product = a*b;
        return product;
    }
    
    public static int factorial (int a){
        if (a==0){
            System.out.println("Factorial "+a+"! is: 1");
        }
        else{
            int fact=a-1;

        for (int i = fact; i>0; i--){
            a *= i;
        }
        }
        return a;
    }
    public static int bionomial (int n, int r){
        int x = factorial(n);
        int y = factorial(r);
        int z = factorial(n-r);

        int coefficient = x/(y*z);
        return coefficient;
    }

    // Method Overloading
    public static int sum (int a, int b){
        return a + b;
    }

    public static float sum (float a, float b){
        return a + b;
    }
    
    public static boolean isprime (int x){
        if (x==2){
            return true;
        }
        for (int i = 2; i<=Math.sqrt(x); i++){
            if ( x%i == 0){
                return false;
            }
        }
        return true;
    }
    // TO find prime in range
    public static void primeinrange (int n){
        for (int i=2; i<=n; i++){
            isprime(i);
            if (isprime(i) == true){
                System.out.print(i+" ");
            }
        }
    }

    public static float avg (int a, int b, int c){
        float average = (a+b+c)/3;
        return average;
    }

    public static boolean isEven (int h){
        if (h%2==0) {
            return true;
        }
        return false;
    }
    // predefined method (main)
    public static void main(String args[]){
        System.out.println(isEven(8));
    }
}
