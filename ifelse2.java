import java.util.*;

public class ifelse2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number : ");
        // int a = sc.nextInt(

        // if (a>=0){
        //     System.out.println("Number is Positive");
        // }
        // else{
        //     System.out.println("Number is Negative");
        // }

        // System.out.print("Your body temperature is : ");
        // double fever = sc.nextDouble();

        // if (fever > 100){
        //     System.out.println("You have a Fever");
        // }
        // else{
        //     System.out.println("You don't have a Fever");
        // }

        System.out.print("Enter Year : ");
        int s = sc.nextInt();

        boolean x = (s % 4 == 0);           // years divisble by 4 potentially are leap year
        boolean y = (s % 100 != 0);         // years divisible by 100 are not leap year
        boolean z = (s % 400 == 0);         // They are also divisible by 400, in which case they are leap years

        if ((x && y) || z){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
