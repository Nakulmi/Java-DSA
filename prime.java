import java.util.*;

public class prime {

    public static boolean isprime (int b){
        boolean prime = true;

        for (int i = 2; i<(b-1); i++){
            if (b%i == 0){
                prime = false;
            }
        }return prime;
    }
    public static void main (String args[]){

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Number : ");
        // int a = sc.nextInt(); 

        

        System.out.println(isprime(7));

    //     boolean prime = true;

    //     for (int i = 2; i<=(a-1); i++){
    //         if (a%i==0){       // a is multiple of i (where i != 1 & a) 
    //             prime = false;
    //     }
    // }

    // if (prime == true){
    //     System.out.println("PRIME");
    // }
    // else{
    //     System.out.println("Not PRIME");
    // }
}
}