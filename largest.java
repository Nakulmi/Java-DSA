import java.util.*;

public class largest {
     public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        int largest; 

        //MY Code
        // if (a > b){

        //     if(a > c){
        //         System.out.println("Largest number : "+a);
        //     }

        //     else{
        //         System.out.println("Largest number : "+c);
        //     }
            
        // }

        // else{
        //     if(b > c){
        //         System.out.println("Largest number : "+b);
        //     }

        //     else{
        //         System.out.println("Largest number : "+c);
        //     }
        // }


        // Apna College Code
        if (a>=b && a>=c){
            largest = a;
        }
        else if (b>=c){
            largest = b;
        }
        else{
            largest = c;
        }

        System.out.println("Largest number is :" +largest);

     }
}

