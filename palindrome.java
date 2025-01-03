import java.util.*;

public class palindrome {
    public static int reverse (int x){

        int rev = 0;
        while (x>0){
            int ld = x%10;       // to get the last digit
            rev = (rev*10) + ld;
            x = x/10;            // to remove last digit
        }
        return rev;
    }
    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        if (reverse(a) == a){
            System.out.println(a+" is a Palindrome");
        }
        else{
            System.out.println(a+" is a not Palindrome");
        }
    }
}
