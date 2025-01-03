import java.util.*;

public class taxcalci {
    
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Income : ");
        double income = sc.nextInt();
        double tax;

        if(income < 500000){
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000){
            tax = income * 0.2;
        }
        else {
            tax = income * 0.3;
        }

        System.out.println("Your Tax is : "+tax);


    }
}
