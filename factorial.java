import java.util.*;

public class factorial {
    public static void main(String args[]){

        // Gives factorial only till 27. 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int a = num;

        if (a==0){
            System.out.println("Factorial "+a+"! is: 1");
        }
        else{
            int fact=a-1;

        for (int i = fact; i>0; i--){
            a *= i;
        }

        System.out.println("Factorial "+num+"! is: "+a);
        }
        

    }
}
