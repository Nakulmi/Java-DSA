import java.util.*;

public class calculator {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double a = sc.nextInt();

        System.out.print("Enter second number : ");
        double b = sc.nextInt();

        System.out.print("Enter Operator : ");
        char operator = sc.next().charAt(0);  //for input of single character
 
        double result = 0;

        switch(operator){

            case '+' : result = (a+b);
            break;

            case '-' : result = (a-b);
            break;

            
            case '*' : result = (a*b);
            break;

            
            case '/' : if (b!=0){
                result = (a/b);
            }
            else{
                System.out.println("Cannot divide by zero");
            }
            break;

            
            case '%' : result = (a%b);
            break;

            default : System.out.println("Invalid Operator");

        }
        System.out.println("Result : "+result);
        
    }
}
