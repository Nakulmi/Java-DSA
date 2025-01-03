import java.util.*;

public class sum {

    public static int compute (int x){
        int y = 0;

        while (x>0){
            int ld = x%10;
            y = y+ld;
            x/=10;
        }
        return y;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int z = sc.nextInt();

        System.out.println("The sum of digit in number is: "+compute(z));

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number: ");
        //  int a = sc.nextInt();
       
        // System.out.println("Enter second number: ");
        // int b = sc.nextInt();

        // System.out.println("Enter Third number: ");
        // int c = sc.nextInt();


        // int sum = a+b;
        // float avg = (a+b+c)/3;
        // System.out.println("Sum = "+sum);
        // System.out.println("Average = "+avg);
       

        //System.out.println("Product = ");
        // int product= a*b;
        //System.out.println(product);
        
    }
}
